package com.oop10;

public class Card {
    // 카드회사에서 카드를 새로 발급할때마다 새로운 카드 번호를 부여
    private String name;
    private int cardNumber;

    public Card(String name) {
        cardNumber = Company.cardSerialNumber;
        System.out.println(name+"고객에게 "+ cardNumber+"번 카드 발급 성공");
        Company.cardSerialNumber++;
    }

}
