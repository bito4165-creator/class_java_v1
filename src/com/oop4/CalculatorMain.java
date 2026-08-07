package com.oop4;

public class CalculatorMain {

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a + b;
    }

    // 두 숫자를 빼는 함수
    static int sub(int a, int b) {
        return a - b;
    }

    // 두 숫자를 곱하는 함수
    static int multply(int a, int b) {
        return a * b;
    }

    // 두 숫자를 나누는 함수
    static double divide(int a, int b) {
        // 방어적 코드
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        // 정수 / 정수 ----> 정수(소수점 버려짐)
        // (double) 둘 중 하나라도 실수 데이터 타입이어야 소수점을 반환 한다.
        return (double)a / b;
    }

    // 짝수인지 판별하는 함수
    static boolean checkEven(int a) {
        return a % 2 == 0;
    }


    // 홀수인지 판별하는 함수
    static boolean checkOdd(int a) {
        return  a % 2 != 0;
    }

    // 메인 함수
    public static void main(String[] args) {
        // 위 함수를 설계하고 테스트 코드 작성
        int num1 = 10;
        int num2 = 5;
        int testNumber = 6;

        System.out.println(add(num1, num2));

        System.out.println(sub(num1, num2));

        System.out.println(multply(num1, num2));

        System.out.println(divide(num1, num2));

        System.out.println(checkEven(testNumber));

        System.out.println(checkOdd(testNumber));
    }

}
