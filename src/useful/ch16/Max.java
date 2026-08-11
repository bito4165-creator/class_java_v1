package useful.ch16;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2. 람다 표현식 설계
        MaxCalculator calculator = (a,b) -> a > b ? a : b;

        // 3. 데이터 입력후 결과 확인
        System.out.println("첫번째 숫자 : ");
        int num1 = sc.nextInt();

        System.out.println("두번째 숫자 : ");
        int num2 = sc.nextInt();

        int result = calculator.Max(num1,num2);

        System.out.println("큰 수 : " + result);

        sc.close();
    }
}
