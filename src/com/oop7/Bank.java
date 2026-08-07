package com.oop7;

public class Bank {
    int balance;
    int money;

    public Bank() {

    }
    public Bank(int b) {
        balance = b;
    }

    public Bank(int b, int m) {
        balance = b;
        money = m;
    }

    public boolean isAdd(int money) {
        if (money > 0) {
            return true;
        } else {
            return false;
        }
    }

}
