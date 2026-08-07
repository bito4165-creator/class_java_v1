package useful.exceptionStudy;

import java.util.Scanner;

public class Study3 {
    //문제 3. 리스트 인덱스 예외 처리
    //
    //다음 리스트가 있습니다.
    //
    //fruits = ["사과", "바나나", "포도"]
    //
    //사용자로부터 인덱스를 입력받아 해당 과일을 출력하는 프로그램을 작성하세요.
    //
    //조건
    //
    //존재하지 않는 인덱스를 입력하면 "잘못된 인덱스입니다."를 출력하세요.
    //숫자가 아닌 값을 입력하면 "숫자를 입력하세요."를 출력하세요.
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "포도"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("인덱스를 입력하세요: ");

        try {
            // 정수 입력 받기 (숫자가 아닌 경우 InputMismatchException 발생)
            int index = scanner.nextInt();

            // 존재하지 않는 인덱스 접근 시 ArrayIndexOutOfBoundsException 발생
            System.out.println("선택한 과일: " + fruits[index]);

        } catch (java.util.InputMismatchException e) {
            // 숫자가 아닌 값을 입력했을 때
            System.out.println("숫자를 입력하세요.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 범위를 벗어난 인덱스를 입력했을 때
            System.out.println("잘못된 인덱스입니다.");
        } finally {
            scanner.close();
        }
    }

}
