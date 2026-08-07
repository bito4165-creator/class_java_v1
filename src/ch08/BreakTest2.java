package ch08;

import java.util.Scanner;

public class BreakTest2 {
    public static void main(String[] args) {

        // 문제  1. 1부터 100까지 반복문 진행
        //      2. 3의 배수만 화면에 출력
        //      3. 50 이상이면 반복문을 종료시키세요
        //      4. for 구문으로 코드 작성
        int start = 1;
        int end = 100;
        while (start <= 100) {
            if(start % 3 ==0){
                System.out.println("3의 배수 : " + start);
            }
            if (start >= 50) {
                break;
            }
            start++;
        }
        System.out.println("-------------------------");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("3의 배수 : " + i);
            }
            if (i >= 50) {
                break;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입렵해주세요 : ");
        int max = sc.nextInt();
        System.out.print("기준숫자를 입력해주세요");
        int flag = sc.nextInt();
        for (int i = 1; i <= max; i++) {
            if(i % flag == 0) {
                System.out.println(flag+"의 배수 :" + i);
            }
        }

        int fisrt = 1;
        while (fisrt <= max) {
            if (fisrt % flag == 0) {
                System.out.println(flag+"의 배수 "+ fisrt);
            }
            fisrt++;
        }

    } // end of main

} // end of class
