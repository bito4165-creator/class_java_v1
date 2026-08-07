package ch08;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class MenuChoice5 {
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

        String name = "";
        boolean isRegistered = false;
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
                // 만약 name에 등록된 값이 있다면 이미 등록되어 있습니다.(등록x)
                // name 변수에 스캐너를 사용해서 이름을 등록하는 기능을 구현
                if (isRegistered) {
                    System.out.println("이미 이름이 등록이 되어있습니다.");
                } else {
                    System.out.println("등록을 선택했습니다.");
                    System.out.println("등록할 이름을 입력해주세요> ");
                    name = scanner.nextLine();
                    if (name.isEmpty()) {
                        System.out.println("아무것도 입력되지 않았습니다.");
                    } else if (name.length() < 2 || name.length() > 5){
                        System.out.println("이름은 2~5자 사이로 입력해주세요.");
                    } else {
                        isRegistered = true;
                    }
                }
            } else if (choice == READ) {
                // 만약 이름이 등록된 적이 없다면 조회할 이름이 없습니다.
                // name안에 담겨진 값을 출력하는 기능 구현
                if (isRegistered) {
                    System.out.println("조회를 선택했습니다.");
                    System.out.println("조회결과 : " + name);
                } else {
                    System.out.println("조회할 이름이 없습니다.");
                }
            } else if (choice == UPDATE) {
                // 수정해야할 값이 없습니다. 등록부터 해주세요.
                // name을 수정하는 기능 구현
                if (isRegistered) {
                    System.out.println("수정을 선택했습니다");
                    System.out.print("수정할 이름을 입력해주세요> ");
                    String changeName = "";
                    changeName = scanner.nextLine();
                    if (changeName.isEmpty()) {
                        System.out.println("아무것도 입력되지 않았습니다.");
                    } else if (changeName.length() > 5 || changeName.length() < 2 ){
                        System.out.println("이름은 2~5자 사이로 입력해주세요.");
                    } else {
                        System.out.println("수정 완료 : " + name);
                        name = changeName;
                    }
                } else {
                    System.out.println("수정해야할 값이 없습니다. 등록부터 해주세요");
                }
            } else if (choice == DELETE) {
                // name을 삭제 하는 기능 구현
                if (isRegistered) {
                    if (name.isEmpty()) {
                        System.out.println("삭제할 이름이 없습니다.");
                        isRegistered = false;
                    } else {
                        System.out.println("삭제를 선택했습니다.");
                        System.out.println(name + "이름 삭제 완료.");
                        name = "";
                        isRegistered = false;
                    }
                } else {
                    System.out.println("등록된 데이터가 없습니다. 삭제할 수 없음.");
                }
            } else {
                System.out.println("**잘못된 입력입니다. 다시 선택해주세요**.");
            }

        }


    } // end of main

} // end of class
