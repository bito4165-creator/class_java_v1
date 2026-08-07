package com.oop6;

public class AccountMainTest {

    // 고드 시작의 기준점
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10_000);
        account.withdraw(6_000);
        account.showInfo();

        // 접근 제어 지시자가 필요한 이유
        // 가상 시나리오
        // 나는 객체의 행동인 입금하는 기능을 만들어 두었는데
        // 신입 개발자가 실수로 입금하는 기능이 아닌 직접 변수에 접근 값을 수정한다면
        // 의도 하지 않은 결과를 발생 시킬 수 있다

        account.balance = 10_000;
        // 변수에 직접 접근해서 값을 수정할 경우 길수할 가능성이 높다
        // 그래서 우리는 변수에 pirvate 사용새서 외부에서는 필드가 안보게 설정하는 것이 좋다.

        System.out.println("------------------------");

        account.showInfo();;


    } // end of main

} // end of calss
