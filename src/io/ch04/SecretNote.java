package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecretNote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- 비밀 메모장 -----");
        System.out.println("저장할 메모를 입력하세요 : ");
        String input = sc.nextLine();
        String record = input;

        // 비밀 메모장 기능을 구현해주세요.
        try(FileOutputStream fos = new FileOutputStream("assets/secret.txt")) {
            byte[] original = record.getBytes();
            byte[] encrypted = new byte[original.length];

            for (int i = 0; i < original.length; i++) {
                encrypted[i] = (byte)(original[i] + 3);
            }
            fos.write(encrypted);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(FileInputStream fis = new FileInputStream("assets/secret.txt")) {
            StringBuilder sb = new StringBuilder();

            int data;

            while ((data = fis.read()) != -1) {
                sb.append((char) (data - 3));
            }

            String code = sb.toString();

            System.out.println(code);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
