package io.ch06;

import java.io.*;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("복사할 파일을 입력해주세요");
        String source =  sc.nextLine();
        copy(source);
    }

    // 파일 복사 기능을 만들어주세요
    // 단.. 파일은
    public static void copy(String source) {
        // 1. 복사할 파일 읽어오기
        String sourceFilePath = "img1/"+source;
        String destinationFilePath = "img1/copy";

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


    }
}

