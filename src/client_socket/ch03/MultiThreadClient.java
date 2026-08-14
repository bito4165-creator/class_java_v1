package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiThreadClient {

    public static void main(String[] args) {

        try (Socket socket = new Socket("192.168.5.100", 5001)) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 읽기 스레드 (서버측에서 들어온 데이터를 계속 받을 수 있도록 처리)
            Thread readThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = reader.readLine()) != null) {
                        // 프로토콜 1 - exit
                        if ("exit".equalsIgnoreCase(serverMessage)) {
                            System.out.println("서버가 종료를 원합니다");
                            break;
                        }
                        // 프로토콜 - smile = 주의 읽기 할때 반대편에서 쓰리 메세지에 다른게 붙어있다면 의도한 행동을 할때 오류가 날수 있다.
                        // ex) 서버에서 메세지를 보내올때 @@ + smile 이렇게 보내면 받아올때 smile이 아니라 @@smile이 되버려서
                        // 의도했던 이모지 스마일이 안나오는 경우가 생긴다.
                        if ("smile".equalsIgnoreCase(serverMessage)) {
                            System.out.println("😊");
                        }
                        System.out.println("응답 메세지 : " +serverMessage);
                    }
                } catch (Exception e) {
                    System.err.println("서버가 강제 종료 했습니다");
                }
            });

            // 쓰기 스레드 ( 클라이언트 측 키보드 값을 입력 받아서 서버측으로 전송)
            Thread writeThread = new Thread(() -> {
                String clientMessage;
                try {
                    while ((clientMessage = keyboardReader.readLine()) != null) {
                        writer.println(clientMessage);
                        if ("exit".equalsIgnoreCase(clientMessage)) {
                            System.out.println("클라이언트 종료 됨");
                            break;
                        }
                        if ("smile".equalsIgnoreCase(clientMessage)) {
                            System.out.println("웃음 이모티콘 보냄");
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

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    } // end of main
}
