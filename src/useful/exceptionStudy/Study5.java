package useful.exceptionStudy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5 {
    //여러 예외 처리하기
    //
    //사용자로부터 두 개의 값을 입력받아 첫 번째 값을 두 번째 값으로 나누는 프로그램을 작성하세요.
    //
    //조건
    //
    //숫자가 아닌 값을 입력하면 "숫자만 입력하세요."를 출력하세요.
    //0으로 나누려고 하면 "0으로 나눌 수 없습니다."를 출력하세요.
    //정상 입력이면 나눗셈 결과를 출력하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 첫 번째 값 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            // 두 번째 값 입력
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            // 나눗셈 연산 및 결과 출력
            int result = num1 / num2;
            System.out.println("나눗셈 결과: " + result);

        } catch (InputMismatchException e) {
            // 숫자가 아닌 값을 입력한 경우
            System.out.println("숫자만 입력하세요.");
        } catch (ArithmeticException e) {
            // 0으로 나누려고 한 경우
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            scanner.close();
        }
    }
}
