package ch08;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuChoiceTest {
    // CRUD
    // 변수 name을 사용해서 CRUD를 구현을 해보자.
    public static void main(String[] args) {
        // 준비물
        Scanner scanner = new Scanner(System.in);
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;

        String[] names = new String[5];
        int count = 0;

        while (true) {
            System.out.println("\n메뉴선택");
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료;");
            System.out.print("선택 : ");
            // 개행 문자 소비
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == END) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (choice == CREATE) {
                if (count >= names.length) {
                    System.out.println("더이상 등록 할 수 없습니다.");
                } else {
                    System.out.println("등록할 이름을 입력하세요");
                    String inputName = scanner.nextLine();

                    names[count] = inputName;
                    count++;
                    System.out.println(inputName + " 등록 완료" );
                }

            } else if (choice == READ) {
                if (count == 0) {
                    System.out.println("조회할 이름이 없습니다.");
                } else {
                    System.out.println("-------[회원 목록]-------");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + names[i]);
                    }
                }

            } else if (choice == UPDATE) {
                if (count == 0) {
                    System.out.println("수정해야할 값이 없습니다. 등록부터 해주세요");
                } else {
                    System.out.println("수정할 이름의 번호를 입력하세요");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (index >= 0 && index < count) {
                        System.out.println("새로운 이름을 입력하세요");
                        String newName = scanner.nextLine();
                        System.out.println(names[index] + "을 -> " + newName + "으로 수정완료");
                        names[index] = newName;
                    } else {
                        System.out.println("잘못된 번호입니다.");
                    }
                }

            } else if (choice == DELETE) {
                if (count == 0) {
                    System.out.println("등록된 데이터가 없습니다.");
                } else {
                    System.out.println("삭제할 이름의 번호를 입력해주세요");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (index >= 0 && index < count) {
                        String deleteName = names[index];

                        for (int i = index; i < count - 1; i++) {
                            names[i] = names[i + 1];
                        }
                        names[count - 1] = null;
                        count--;
                        System.out.println(deleteName + "삭제 완료");
                    } else {
                        System.out.println("잘못된 번호입니다.");
                    }
                }

            } else {
                System.out.println("**잘못된 입력입니다. 다시 선택해주세요.**");
            }
        }
        scanner.close();

    } // end of main


}// end of class

