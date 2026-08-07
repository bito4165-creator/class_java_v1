package com.oop7;

import java.util.Scanner;

// 코드를 실행해 보는 축
public class GoingToSchoolMenu {

    public static void main(String[] args) {

        // 준비물
        Scanner sc = new Scanner(System.in);
        final int EAT = 1;
        final int BUS = 2;
        final int SUBWAY = 3;
        final int MY_INFO = 4;
        final int ADDBALANCE = 5;
        final int END = 0;
        int select;

        System.out.println("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        // 객체 생성 (등장 인물 준비)
        Student student = new Student(name, 5_000);
        Rice rice = new Rice("김치볶음밤", 3_000);
        Bus bus133 = new Bus(133, 1_000);
        Subway line1 = new Subway(1, 1_400);



        while (true) {
            System.out.println();
            System.out.println("메뉴 선택");
            System.out.println("1. 밥먹기 2.버스타기 3.지하철타기 4.내상태 5.입금하기 0. 종료");
            select = sc.nextInt();
            sc.nextLine();
            if (select > 5 || select < 0) {
                System.out.println("잘못된 선택입니다 다시 입력해주세요");
                continue;
            } if (select == END) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } if (select == EAT) {
                student.eat(rice);
            } if (select == BUS) {
                student.takeBus(bus133);
            } if (select == SUBWAY) {
                student.takeSubway(line1);
            } if (select == MY_INFO) {
                student.myInfo();
            } if (select == ADDBALANCE) {
                System.out.println("입금할 금액을 넣어주세요");
                Bank bank = new Bank(student.balance,sc.nextInt());
                sc.nextLine();
                student.addBalance(bank);
            }
            // 직접 실행 흐름 만들어 보기
        }


    } // end of main

} // end of class
