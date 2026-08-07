package com.coffee;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Americano();
        Beverage beverage2 = new Latte();

        beverage1.prepare();
        beverage1.serve();
        System.out.println("-----------------");
        beverage2.prepare();
        beverage2.serve();

    }
}
