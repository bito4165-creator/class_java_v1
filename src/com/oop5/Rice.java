package com.oop5;

public class Rice {
    String menu;
    int amount;

    public Rice() {

    }

    public Rice(String m, int a) {
        menu = m;
        amount = a;
    }

    // 먹은 만큼 줄어든다. 성공하면 true, 실패하면 false 반환
    boolean reduce(int a) {
        if (amount > 0 && amount > a) {
            amount -= a;
            return true;
        } else {
            return false;
        }
    }

    // showInfo
    void showInfo() {
        System.out.println("----잔반 현황----");
        System.out.println("메뉴 이름 : " + menu);
        System.out.println("남은 양 : " + amount);
    }
}
