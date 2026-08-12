package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TypingRecord_2 {
    public static void main(String[] args) {
        // 키보드에서 값을 입력 받아서 내가 정의한 파일에 그대로 저장 시키는 기능을 구현해 보자.
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 타자 연습 기록기 =====");
        System.out.println("연습한 문장을 입력하세요 : ");
        LocalTime start = LocalTime.now();
        String input = sc.nextLine();

        // 도전과제 1 - 입력받은 문자열을 assets/typing.txt 파일에 바로 기록해주세요.
        // 도전과제 2 - 파일에 한 단어를 입력할 때 소요시간도 함꼐 표시하세요.
        try (FileOutputStream fos = new FileOutputStream("assets/typing")) {
            fos.write(input.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LocalTime end = LocalTime.now();

        Duration duration = Duration.between(start, end);

        System.out.println("걸린 시간: " + duration.toNanos() + " ns");

    }
}
