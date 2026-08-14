package sokcet.ch02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile2 {
    // 내 IP 주소 : 192.168.5.21
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("서버측 프로그램 시작 - 포트 번호 : 5000 에서 대기중 ....");
            // 클라이언트가 내 IP 주소와 포트번호를 사용해서 연결할 때 까지 이 줄에서 멈춤(블로킹)
            Socket socket = serverSocket.accept();

            // 일기 스트림(문자기반) , 클라이언트 --> 서버
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 쓰기 스트림(문자 기반), 서버 ----> 클라이언트
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // 클라이언트가 보낸 데이터 한 줄 읽기
            String message = reader.readLine();
            System.out.println("클라이언트 메시지 : " + message);

            // 서버가 클라이언트로 응답 메세지 보내기
            writer.println("안녕 나는 서버야 !!!");

            // 서버측에서 클라이언트에서 온 메세지를 저장하는 기능을 만들어주세요.
            // 파일저장 = FileWriter -> 한줄씩 BufferedWriter 감싸서 저장하기
            try (BufferedWriter fileWriter = new BufferedWriter(
                    new FileWriter("assets/client_messages.txt", true))) {

                fileWriter.write(message);
                fileWriter.newLine();
            }


            System.out.println("클라이언트가 연결 되었습니다.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
