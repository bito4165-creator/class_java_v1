package com.oop16;

public class Fruit {

    protected String name;
    protected int price;

    public void showInfo() {
        System.out.println("상품명 : "  + name);
        System.out.println("가격 : "  + price);
    }

    // 기본 sale 메서드 (하위 클래스에서 오버라이딩)
    public void sale() {
        // 기본 과일은 할인이 없거나 빈 상태로 둠
    }

    public void saleApple() {
        int discount = price / 10;
        price -= discount;
        System.out.println("사고가 10퍼센트 할인. 현재 가격 : " + price);
    }
}


