package com.company_payable_2;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Manager("박팀장", 1002, 4000000, 500000);
        FullTimeEmployee employee1 = (FullTimeEmployee) employee;

        employee1.printInfo();
        System.out.println("급여 : " + employee1.calculatePay() + "원");
        System.out.println("보너스 : " + employee1.calculateBonus() + "원");

    }
}
