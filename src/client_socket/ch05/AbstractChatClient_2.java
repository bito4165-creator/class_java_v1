package client_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

 abstract class AbstractChatClient_2 {
    private String name;
    private Socket socket;
    private PrintWriter socketWriterStream;
    private BufferedReader socketReaderStream;
    private BufferedReader keyboardReaderStream;

    public AbstractChatClient_2(String name) {
        this.name = name;

    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public final void run() {
        try {
            connectToServer();
            setupStreams();
            startCommunication();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    // 상속 받은 자식 클래스는 무조건 이 메서드를 재정의 해야 한다. (강제성 부여)
    protected abstract void connectToServer();

    private void setupStreams() throws IOException {
        socketWriterStream = new PrintWriter(socket.getOutputStream(), true);
        socketReaderStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyboardReaderStream = new BufferedReader(new InputStreamReader(System.in));
    }

    private void startCommunication() throws InterruptedException {
        // 1. 서버에서 보낸 데이트를 받기
        Thread readThread = new Thread(() -> {
            try {
                String serverMessage;
                while ((serverMessage = socketReaderStream.readLine()) != null) {
                    // 프로토콜 1 - exit
                    if ("exit".equalsIgnoreCase(serverMessage)) {
                        System.out.println("서버가 종료를 원합니다");
                        break;
                    }
                    System.out.println(serverMessage);
                }
            } catch (Exception e) {
                System.err.println("서버가 강제 종료 했습니다");
            }
        });

        // 2. 키보드에서 값을 받아서 서버로 메세지 전송
        Thread writeThread = new Thread(() -> {
            String clientMessage;
            try {
                while ((clientMessage = keyboardReaderStream.readLine()) != null) {
                    socketWriterStream.println(name + ": " + clientMessage);
                    if ("exit".equalsIgnoreCase(clientMessage)) {
                        System.out.println("클라이언트 종료 됨");
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("메세지 전송 중 오류 발생");
            }
        });

        readThread.start();
        writeThread.start();
        // 메인 스레드 종료시 socket.close() 가 호출 됨 그래서 대기 상태로 만들어 줘야 함
        readThread.join();
        writeThread.join();
    }
}
