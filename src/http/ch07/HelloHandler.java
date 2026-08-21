package http.ch07;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

import static http.ch07.SimpleHttpServer.TYPE_JSOM;
import static http.ch07.SimpleHttpServer.TYPE_TEXT;

public class HelloHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            String json = "hello";
            SimpleHttpServer.sendResponse(exchange, 200,TYPE_TEXT,json);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
