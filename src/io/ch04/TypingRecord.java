package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TypingRecord {
    public static void main(String[] args) {
        // 키보드에서 값을 입력 받아서 내가 정의한 파일에 그대로 저장 시키는 기능을 구현해 보자.
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 타자 연습 기록기 =====");
        System.out.println("연습한 문장을 입력하세요 : ");
        // 입력을 하기 시작하는 시간
        LocalTime start = LocalTime.now();
        String input = sc.nextLine();

        // 입력이 끝난 직후의 시각을 기록
        LocalTime end = LocalTime.now();

        Duration result = Duration.between(start, end);
        long ms = result.toMillis();
        double sec = ms / 1000.0;

        // 파일에 남길 내용을 미리 설계
        String record = input + " | 소요시간 : " + sec + "초 " + ms + "(ms)";

        // 도전과제 1 - 입력받은 문자열을 assets/typing.txt 파일에 바로 기록해주세요.
        // 도전과제 2 - 파일에 한 단어를 입력할 때 소요시간도 함꼐 표시하세요.

        try (FileOutputStream fos = new FileOutputStream("assets/typing.txt", true)) {
            fos.write(record.getBytes());
            fos.write("\n".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();

    }
}
