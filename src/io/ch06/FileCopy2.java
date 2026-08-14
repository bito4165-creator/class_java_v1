package io.ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {
    public static void main(String[] args) {
        // 1. 파일 위치를 지정한다. (원본 경로, 복사될 경로)
        // 2. 스트림 (File I/O) - 바이트 기반
        // 3. 소요시간 측정

        String sourceFilePath = "assets/employees.zip";
        String destinationFilePath = "assets/employees.zip_copy_zip";
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {

            int data;
            while ((data = fis.read()) !=-1){
                fos.write(data);
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
