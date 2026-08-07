package com.oop1;

public class OrderMainTest {

    public static void main(String[] args) {

        Order order = new Order();
        order.menu = "아메리카노";
        order.price = 2500;
        order.quantity = 5;

        System.out.println(order.menu);
        System.out.println(order.price);
        System.out.println(order.quantity);

    }

}
