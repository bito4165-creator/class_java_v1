package com.oop7;

public class Student {
    private String name;
    int balance;

    public Student() {

    }

    public Student(String n) {
        name = n;
    }

    public Student(String n, int b) {
        name = n;
        balance = b;
    }

    public void eat(Rice rice) {
        if (rice.eat(balance)) {
            System.out.println(name + " 학생은 " + rice.menu + "를 먹었습니다.");
            balance = balance - rice.price;
        } else {
            System.out.println(name + " 학생은 " + rice.menu + "를 먹지못했습니다.");
        }
    }

    public void takeBus(Bus bus) {
        if (bus.takeBus(balance)) {
            System.out.println(name + " 학생은 " + bus.busNumber + "번 버스를 탑승했습니다.");
            balance = balance - bus.price;
        } else {
            System.out.println(name + " 학생은 버스에 탑승하지못했습니다.");
        }
    }

    public void takeSubway(Subway subway) {
        if (subway.takeSubway(balance)) {
            System.out.println(name + " 학생은 " + subway.line + "호선 지하철을 탑승했습니다.");
            balance = balance - subway.price;
        } else {
            System.out.println(name + " 학생은 기차에 탑승하지 못했습니다.");
        }
    }

    public void myInfo() {
        System.out.println("------상태창-----");
        System.out.println("학생 이름 : " + name);
        System.out.println("잔액 : " + balance);
    }

    public void addBalance(Bank bank) {
        if (bank.isAdd(bank.money)) {
            balance = balance + bank.money;
            System.out.println(bank.money+"원 입금하셨습니다.");
        } else {
            System.out.println("금액을 잘못 입력하셨습니다. 다시 입력해주세요");
        }
    }

}
