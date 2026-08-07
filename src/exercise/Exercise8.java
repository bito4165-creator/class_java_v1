package exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise8 {
    // 함수 만들기 1
    static void greet(String name) {
        System.out.println("안녕하세요." +name+"님!");
    }

    // 함수 만들기 2
    static int square(int a) {
        int result;
        result = a * a;
        return result;
    }
    // 함수 만들기 3
    static String signOfNumber(int a) {
        if (a > 0) {
            return "positive";
        } else if (a < 0) {
            return "negative";
        } else {
            return "zero";
        }

    }
    // 함수 만들기 4
    static Boolean checkAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // 함수 만들기 5
    private static int findMax (int[] numbers){
        int max = 0;
        for(int i = 0; i <numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }


    // 코드의 시작점(메인 함수)
    public static void main(String[] args) {
        greet("홍길동");

        System.out.println(square(5));

        System.out.println(signOfNumber(2));
        System.out.println(signOfNumber(-1));
        System.out.println(signOfNumber(0));

        System.out.println(checkAdult(18));
        System.out.println(checkAdult(17));

        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[4] = 40;
        System.out.println(findMax(numbers));
    }

}
