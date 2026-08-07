package com.oop5;

public class Subway {
    int lineNumber;
    int count;
    int money;

    // 1. 생성자
    public Subway(int line) {
        lineNumber = line;
    }

    public Subway(int num, int c, int m) {
        lineNumber = num;
        count = c;
        money = m;
    }

    // 2. 승객을 태운다
    void take(int pay) {
        money += pay;
        count++;
    }

    // 3. 정보보기
    void showInfo() {
        System.out.println("지하철 호선 : "+ lineNumber);
        System.out.println("현재 승객 수 : "+ count);
        System.out.println("현재 수익 금액 : " + money);
    }

}
