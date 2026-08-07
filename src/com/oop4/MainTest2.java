package com.oop4;

public class MainTest2 {

    public static void main(String[] args) {
        // Bus 클래스의 사용자 정의 생성자 2개를 이용해서 객체를 메모리에 직접 올려 보자.
        Bus bus1 = new Bus(101);
        System.out.println(bus1.busNumber + "번 버스가 옵니다.");

        Bus bus2 = new Bus(53, 1600);
        System.out.println(bus2.busNumber + "번 버스 탑승 가격은 " + bus2.money + "원입니다.");


    } // end of main

} // end of class
