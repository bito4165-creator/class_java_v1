package com.oop7;

public class Subway {
    int line;
    int price;

    public Subway() {

    }

    public Subway(int l, int p) {
        line = l;
        price = p;
    }

    public boolean takeSubway(int money) {
        if (money > price) {
            return true;
        } else {
            return false;
        }
    }

}
