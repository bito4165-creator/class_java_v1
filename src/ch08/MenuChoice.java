package ch08;

import java.util.Scanner;

public class MenuChoice {
    public static void main(String[] args) {
        // 1 , 2, 3, 4, 0 <-- 상수 선언하고 활용
        Scanner scanner = new Scanner(System.in);
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        while (true) {
            System.out.println("\n메뉴선택");
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료;");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();

            if (choice == END) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice == CREATE) {
                System.out.println("등록을 선택했습니다.");
            } else if (choice == READ) {
                System.out.println("조회를 선택했습니다.");
            } else if (choice == UPDATE) {
                System.out.println("수정을 선택했습니다");
            } else if (choice == DELETE) {
                System.out.println("삭제를 선택했습니다.");
            } else {
                System.out.println("**잘못된 입력입니다. 다시 선택해주세요**.");
            }

        }


    } // end of main

} // end of class
