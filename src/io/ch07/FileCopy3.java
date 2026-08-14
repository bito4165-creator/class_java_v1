package io.ch07;

import java.io.*;

public class FileCopy3 {
    public static void main(String[] args) {
        // 1. 파일 위치를 지정한다. (원본 경로, 복사될 경로)
        // 2. 스트림 (File I/O) - 바이트 기반
        // 3. 소요시간 측정
        // 성능 개선

        String sourceFilePath = "assets/employees.zip";
        String destinationFilePath = "assets/employees_copy_zip";
        long startTime = System.nanoTime();

        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(sourceFilePath));
             BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(destinationFilePath))) {

            byte[] buffer = new byte[8192];

            int data;
            while ((data = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, data); // 읽은 숨 만큼만 (중요)
            }

            System.out.println("파일 복사 완료");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.nanoTime();

        long duartion = endTime - startTime;
        System.out.println("나노 초 :" + duartion);
        System.out.println("초 : " + duartion / 1_000_000_000.0);
    }
}
