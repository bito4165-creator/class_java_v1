package client_socket.ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile {
    // 내 IP 주소 : 192.168.5.21    상대방 Ip 192.168.5.19
    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("클라이언트 : 서버에 연결했습니다.");

            // 서버측으로 메세지를 보내기 위한 출력 스트림 사용
            // socket + PrintWriter : autoFlush 처리 됨
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("안녕 서버 나는 클라이언트 메시지야"); // "\n "
            writer.println("안녕 난 서버2야");

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
