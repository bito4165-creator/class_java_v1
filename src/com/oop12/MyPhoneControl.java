package com.oop12;

import java.util.Scanner;

public class MyPhoneControl {
    static int lastPhoneNum = 0;

    // 저장
    public static void save(Scanner sc, Phone[] phones) {
        System.out.println("전화번호 저장하기");

        // 1. 배열이 가득 찼는지 검사 (>= 연산자 사용)
        if (lastPhoneNum >= phones.length) {
            System.out.println("전화번호부가 가득 찼습니다.");
            return;
        }

        System.out.println("이름을 입력해주세요");
        String name = sc.nextLine();

        System.out.println("전화번호를 입력해주세요");
        String phoneNum = sc.nextLine();

        // 2. 하이픈(-) 포함 여부 검사
        if (!phoneNum.contains("-")) {
            System.out.println("'-' 를 넣어서 전화번호를 입력해주세요.");
            return; // 잘못 입력되었으므로 메서드 종료
        }

        // 3. 객체 생성 및 배열에 저장 후 인덱스 증가
        Phone phone = new Phone(name, phoneNum);
        phones[lastPhoneNum] = phone;
        lastPhoneNum++;

        System.out.println("전화번호가 성공적으로 저장되었습니다.");
    }

    // 조회
    public static void searchAll(Phone[] phones) {
        System.out.println("전체 전화번호부 조회하기");
        if (lastPhoneNum == 0) {
            System.out.println("조회할 전화번호가 존재하지 않습니다.");
            return;
        }
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] == null) {
                break;
            }
            System.out.println(phones[i].getName() + ", " + phones[i].getPhoneNum());
        }

    }

    // 수정
    public static void update(Scanner sc, Phone[] phones) {
        System.out.println("전화번호 수정하기");
        if (lastPhoneNum == 0) {
            System.out.println("수정할 전화번호부가 없습니다.");
            return;
        }

        System.out.println("수정할 사람의 이름을 입력해주세요");
        String targetName = sc.nextLine().trim();

        int targetIndex = -1;

// 1. 수정할 대상의 인덱스 찾기
        for (int i = 0; i < lastPhoneNum; i++) {
            if (phones[i] != null && phones[i].getName().equals(targetName)) {
                targetIndex = i;
                break; // 첫 번째로 찾은 대상을 수정하고 반복문 탈출 (동명이인 처리 고려)
            }
        }

// 2. 대상을 찾지 못한 경우 처리
        if (targetIndex == -1) {
            System.out.println("일치하는 이름의 전화번호를 찾을 수 없습니다.");
            return;
        }

// 3. 전화번호 입력 및 수정 처리
        System.out.println("새로운 전화번호를 입력해주세요 (예: 010-1234-5678)");
        String updatePhoneNum = sc.nextLine().trim();

// 하이픈(-) 유효성 검사 추가 (선택 사항이지만 권장)
        if (!updatePhoneNum.contains("-")) {
            System.out.println("'-' 를 넣어서 전화번호를 입력해주세요. 수정이 취소됩니다.");
            return;
        }

        phones[targetIndex] = new Phone(targetName, updatePhoneNum);
        System.out.println("전화번호가 성공적으로 수정되었습니다.");
    }

    // 삭제
    public static void delete(Scanner sc, Phone[] phones) {
        System.out.println("전화번호 삭제하기");
        if (lastPhoneNum == 0) {
            System.out.println("삭제해야할 전화번호가 없습니다");
            return;
        }
        System.out.println("삭제할 사람의 이름을 입력해주세요");
        String targetName = sc.nextLine();
        int targetIndex = -1;
        for (int i = 0; i < lastPhoneNum; i++) {
            if (phones[i] != null && phones[i].getName().equals(targetName.trim())) {
                targetIndex = i;
                phones[i] = null;
                for (int a = targetIndex; a < lastPhoneNum; a++) {
                    phones[a] = phones[a + 1];
                }
                lastPhoneNum--;
            }

        }
        if (targetIndex == -1) {
            System.out.println("삭제할 이름의 사람이 없습니다.");
        }

    }

    // 선택 조회
    static void searchSelect(Scanner sc, Phone[] phones) {
        System.out.println("선택한 전화번호 조회하기");
        if (lastPhoneNum == 0) {
            System.out.println("조회해야할 전화번호가 없습니다");
            return;
        }

        System.out.println("조회할 사람의 이름을 입력해주세요");
        String targetName = sc.nextLine();
        int targetIndex = -1;
        for (int i = 0; i < lastPhoneNum; i++) {
            if (phones[i] != null && phones[i].getName().equals(targetName.trim())) {
                targetIndex = i;
                phones[i].showInfo();
            }

        }
        if (targetIndex == -1) {
            System.out.println("조회할 사람의 전화번호가 존재하지않습니다.");
        }
    }

    //- **Scanner 활용, 입력 받는 데이터 타입은 전부 String 으로 처리**
    //- **전화번호 저장은 100까지 한정.**

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[100];
        boolean flag = true;


        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_SELCET = "3";
        final String UPDATE = "4";
        final String DELETE = "5";
        final String END = "0";

        while (flag) {
            System.out.println("-- 전화번호관리시스템 --");
            System.out.println("1. 저장 2.전체조회 3.선택조회 4.수정 5.선택 삭제 0.종료");
            String select = sc.nextLine();
            if (select.equals(SAVE)) {
                save(sc, phones);
            } else if (select.equals(SEARCH_ALL)) {
                searchAll(phones);
            } else if (select.equals(SEARCH_SELCET)) {
                searchSelect(sc, phones);
            } else if (select.equals(UPDATE)) {
                update(sc, phones);
            } else if (select.equals(DELETE)) {
                delete(sc, phones);
            } else if (select.equals(END)) {
                flag = false;
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }


    }

}
