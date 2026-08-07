package exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // (설계 분석) 1.아메리카노의 단가는 2,500원입니다. 수량에 따른 총 금액을 계산하고, 3잔 이상 구매 시 '특별 스탬프'를 출력하는 로직을 구성하십시오.
        // (프로그램 구현) 2.Scanner를 사용하여 수량을 입력받고, if문과 이중 for문을 활용하여 다음을 출력하십시오.
        // (오류 수정 및 예외 처리) 3.사용자가 수량에 0 또는 음수를 입력할 경우, "1잔 이상 주문해야 합니다."라는 경고 메시지를 출력하고 다시 입력받을 수 있도록 처리하십시오.
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int price = 2500;

        // 코드 작성
        while (count == 0) {
            System.out.println("주문할 커피 수를 입력해주세요.");
            int coffee = sc.nextInt();
            sc.nextLine();

            if (coffee <= 0) {
                System.out.println("1잔 이상 주문해야합니다.");
                continue;
            }

            System.out.println("총 결제 금액 : " + (price * coffee));
            if (price*coffee >= 7500) {
                System.out.println("3잔 이상 구매 서비스 스탬프 발급 : ");
                for (int i = 0; i < 3; i++) {
                    for (int a = 0; a < 3; a++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            count++;
        }



    } // end of main

} // end of class
