package client_socket.ch05;

import java.io.IOException;
import java.net.Socket;

public class ChatClient_2 extends AbstractChatClient_2{
    public ChatClient_2(String name) {
        super(name);
    }

    @Override
    protected void connectToServer() {
        try {
            setSocket(new Socket("localhost", 5002));
        } catch (IOException e) {
            System.err.println("서버측 연결 도중 예외 발생 (IP, PORT 주소 확인)");
        }
    }

    public static void main(String[] args) {
        new ChatClient_2("홍길동").run();
    }
}
