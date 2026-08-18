package sokcet.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class practice {

    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "uploads";

    public static void main(String[] args) {

        File dir = new File(UPLOAD_DIR);

        if (!dir.exists()) {
            boolean created = dir.mkdirs();
        }

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            int nameLength = in.read();

            if (nameLength == -1) {
                System.out.println("아무것도 오지않음");
            }
            System.out.println("파일 이름 길이"  + nameLength);

            byte[] nameBuffer = new byte[nameLength];
            int nameRead = 0;

            while (nameRead < nameLength) {
                int count = in.read(nameBuffer, nameRead, nameLength = nameRead);
                if (count == -1) {
                    System.out.println("연결 끊김");
                }
                nameRead += count;
            }

            String fileName = new String(nameBuffer);
            if (fileName.contains("..") | fileName.contains("/") || fileName.contains("\\")) {
                System.out.println("잘못된 파일 이름");
            }
            System.out.println("파일 이름  : " + fileName);

            File target = new File(dir, fileName);
            FileOutputStream fos = new FileOutputStream(target);

            byte[] buffer = new byte[4096];
            int bytesRead;
            long total = 0;

            while ( (bytesRead = in.read(buffer)) != -1 ) {
                fos.write(buffer, 0, bytesRead);
                total += bytesRead;
            }
            System.out.println("저장 완료 : " + target.getPath());

            out.write(("업로드 성공 : " + fileName).getBytes());
            out.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
