package com.oop10;

public class MainTest1 {

    public static void main(String[] args) {

        Employee emp1 = new Employee("홍길동", "개발팀");
        Employee emp2 = new Employee("이순신","디자인팀");
        Employee emp3 = new Employee("유관순","경영팀");

        System.out.println(emp1.employeeNumber);
        System.out.println(emp2.employeeNumber);
        System.out.println(emp3.employeeNumber);

        Card card1 = new Card("마커스최");
        Card card2 = new Card("스마트리");



    }
}
