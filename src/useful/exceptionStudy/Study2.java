package useful.exceptionStudy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Study2 {
    //문제 2. 정수 입력 예외 처리
    //
    //사용자로부터 정수를 입력받아 2배를 출력하는 프로그램을 작성하세요.
    //
    //조건
    //
    //숫자가 아닌 값을 입력하면 "정수만 입력하세요."를 출력하세요.
    //정상 입력이면 입력한 수의 2배를 출력하세요.
    public int multiply(int n) {
        return 2*n;
    }

    public static void main(String[] args) {
        Study2 multiply1 = new Study2();
        Scanner sc = new Scanner(System.in);
        int result;
        try {
            System.out.println("숫자 입력해주세요.");
            int i = sc.nextInt();
            result = multiply1.multiply(i);
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력하세요");
        }
    }
}
