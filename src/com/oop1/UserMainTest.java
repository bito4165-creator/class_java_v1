package com.oop1;

public class UserMainTest {

    public static void main(String[] args) {

        User user = new User();
        user.name = "홍길동";
        user.age = 20;
        user.ID = "HKD4165";
        user.password = "12345678";

        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.ID);
        System.out.println(user.password);


    }

}
