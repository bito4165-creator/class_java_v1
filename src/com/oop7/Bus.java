package com.oop7;

public class Bus {
    int busNumber;
    int price;

    public Bus() {

    }

    public Bus(int number, int p) {
        busNumber = number;
        price = p;
    }

    public boolean takeBus(int money) {
        if (money > price) {
            return true;
        } else {
            return false;
        }

    }

}
