package com.oop7;

public class Rice {
    String menu;
    int price;

    public Rice() {

    }

    public Rice(String name,int p) {
        menu = name;
        price = p;
    }

    public boolean eat(int money) {
        if (money > price) {
            return true;
        } else {
            return false;
        }
    }

}
