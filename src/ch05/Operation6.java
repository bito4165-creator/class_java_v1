package ch05;

public class Operation6 {

    // 코드 실행의 시작점
    public static void main(String[] args) {
        // 논리 연산자 (&& , ||, ! )
        int num1 = 100;
        int num2 = 200;

        // 1. 논리곱 ( && )
        //                  T              T
        boolean flag1 = (num1 > 0) && (num2 > 0); // true
        System.out.println("flag1 : " + flag1);
        //                  T              F
        boolean flag2 = (num1 > 0) && (num2 < 0); // false
        System.out.println("flag2 : " +flag2);

        // 2. 논리함 ( || )
        boolean flag3 = (num1 > 0) || (num2 > 0); // true
        System.out.println("flag3 : " + flag3);

        boolean flag4 = (num1 < 0) || (num2 > 0); // true
        System.out.println("flag4 : " + flag4);

        // 정리
        // 논리 곱 - 둘다 참(true)일 때 true 반환
        // 논리 합 - 둘중 하나라도 참(true)일 때 true 반환

        // 부정 논리 연산자 확인
        System.out.println(!true);






    } // end of main

} // end of class
