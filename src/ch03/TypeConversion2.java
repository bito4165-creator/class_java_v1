package ch03;

/**
 * 형변환이란?
 * 데이터의 타입을 다른 타입으로 변경 하는 것
 * - 자동 형변환, 강제 형변환
 */
public class TypeConversion2 {

    // 코드의 시작점
    public static void main(String[] args) {
        // 자동 형변환 코드 작성해보기
        int num = 2156;
        double number;
        number = num;
        System.out.println(number);

        // 강제 형변환 코드 작성해보기
        double discount = 20.125;
        int percenttage;
        percenttage = (int) discount;
        System.out.println(percenttage);

        // 결과 출력해보기

    } // end of main

} // end of class
