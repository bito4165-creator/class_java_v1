package ch03;

public class ConstantTest3 {

    // 코드 실행의 시작점
    public static void main(String[] args) {
        // 도전 과제 - 사각형의 면적을 구하는 코드를 작성해보시오 단, 상수를 선언해서 활용하세요
        System.out.println(5 * 5);
        System.out.println(5 + 5);
        // 가로 * 세로
        // tip
        // 상수 선언 1
        final int WIDTH = 10;
        // 상수 선언 2
        final int HEIGHT = 7;
        // 사각형 면적 계산 3
        double area = WIDTH * HEIGHT;
        // 결과 출력 4
        System.out.println("사각형의 면적 : " + area);


    } // end of main

} // end of class

