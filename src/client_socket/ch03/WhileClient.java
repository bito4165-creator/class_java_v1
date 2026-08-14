package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class WhileClient {

    public static void main(String[] args) {

        // 도전 과제. 주석으로 무엇을 해야될지만 작성해보세요'

        //  출력 스트림 BufferedReader 소켓
        //  입력 스트림 PrintWriter 소켓
        // 키보드에서 데이터 받아올 스트림 BufferedReader 키보드

        // while문을 통해서 readline()으로 데이터를 받아올 코드
        // exit를 받아오면 while문 정지

        // 키보드에서 받아온 데이터를 서버측으로 보낼 코드
        // 키보드 BufferedReader 로 readline()으로 받아와서 출력한다.

        // 1. 소켓 준비(서버 IP 주소, 포트번호)
        // 2. 소켓과 연결된 입력 / 출력 스트림 필요
        // 3. 클라이언트 측 키보드 스트림 핖요

        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while (true) {
                System.out.println("[client]콘솔 로그 클라이언트 입력 >>> ");
                String input = keyboardReader.readLine(); // 블로킹
                writer.println(input); // 소켓과 연결된 출력스트림을 사용해서 서버측에 데이터 보냄
                if ("exit".equalsIgnoreCase(input)) {
                    break; // 즉 키보드 입력 스트림 종료
                }
                String response = reader.readLine();
                if ("exit".equalsIgnoreCase(response)) {
                    break;
                }
                System.out.println("서버측 응답 : "+ response);
                // 서버측에서 보낸 데이터를 받아서 클라이언트 콘솔창에 출력
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
