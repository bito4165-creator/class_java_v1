package com.oop12;

import java.util.Scanner;

/**
 * 모든 프로그래밍의 기본은 C(Create), R(Read), U(Update), D(Delete) 이다
 * 배열을 활요한 간단한 데이터 관리 시스템
 */
public class MyBookStore {


    // 현재 저장된 실제 데이터 개수를 출력하는 공유 변수(static)
    static int lastIndexNumber = 0;

    // 전체 조회 하기
    public static void readAll(Book[] books) {
        System.out.println("-- 전체 조회 호출 됨 --");
        if (lastIndexNumber == 0) {
            System.out.println("아직 저장된 책이 없습니다.");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }

    }

    // 전체 삭제하기
    public static void deleteAll(Book[] books) {
        System.out.println("전체 삭제 호출 됨");
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
        lastIndexNumber = 0;
    }

    // 저장하기
    public static void save(Scanner sc,Book[] books) {
        System.out.println(">> 저장하기 호출 됨");

        if (lastIndexNumber >= books.length) {
            System.out.println("저장 공간이 가득 찼습니다.");
            return;
        }

        System.out.println("저장할 책의 제목을 입력해주세요.");
        String title = sc.nextLine();
        System.out.println("저장할 책의 저자를 입력해주세요");
        String author = sc.nextLine();

        Book book = new Book(title, author);
        books[lastIndexNumber] = book;
        lastIndexNumber++;
    }

    // 선택 조회 기능
    public static void searchByTitle(Scanner sc, Book[] books) {
        System.out.println("-- 선택 조회 호출 됨 --");
        System.out.println("조회할 책 제목 입력해주세요");
        String targetTitle = sc.nextLine();
        boolean isFine = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                // 문자열 비교는 반드시 equlas()사용
                // .trim(); <-- 문자열의 앞뒤 공백 제거
                if (books[i].getTitle().equals(targetTitle.trim())) {
                    System.out.println("[검색 결과 확인]");
                    books[i].showInfo();
                    isFine = true;
                    break;
                }
            }
        }
        // isFine -> true or false
        // if(isFine == false) {
        if (!isFine) { // 단독 if --> true 실행 / 반대로 false -> ! 부정
            System.out.println("조회된 책 결과가 없습니다.");
        }

    }

    // 도전 과제 1
    // 선택 삭제 하는 기능 만들 어보기
    public static void searchByDelete(Scanner sc, Book[] books) {
        System.out.println("-- 선택 삭제 호출 됨 --");
        System.out.println("삭제할 책 제목을 입력해주세요");
        String targetTitle = sc.nextLine();
        boolean isFind = false;
        for (int i = 0; i < lastIndexNumber; i++) {
            if (books[i].getTitle().equals(targetTitle.trim())) {
                books[i] = null;
                int targetNumber = i;
                for (int a = targetNumber; i < lastIndexNumber; i++) {
                    books[a] = books[i+1];
                }
                lastIndexNumber--;
                isFind = true;
            }
        }
        if (!isFind) {
            System.out.println("삭제할 제목의 책은 없습니다.");
        }
    }



    public static void main(String[] args) {
        // 준비물
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];
        boolean flag = true;

        // 샘플 데이터 만들어 놓기
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");

        // 샘플 데이터가 5개라 인덱스 관리 번호를 사용
        lastIndexNumber = 5;

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String SEARCH_BY_DELETE = "5";
        final String END = "0";

        // 2단계 실행의 흐름 만들어 보기
        while (flag) {
            System.out.println("** 메뉴 선택 **");
            System.out.println("1.저장 2.전체조회 3.선택조회 4.전체 삭제 5.조회 삭제 0.종료");
            String selectedNumber = sc.nextLine();
            if (selectedNumber.equals(SAVE)) {
                save(sc, books);
            } else if (selectedNumber.equals(SEARCH_ALL)) {
                readAll(books);
            } else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
                searchByTitle(sc,books);
            } else if (selectedNumber.equals(DELETE_ALL)) {
                deleteAll(books);
            } else if (selectedNumber.equals(END)) {
                System.out.println("<프로그램 종료>");
                flag = false;
            } else if(selectedNumber.equals(SEARCH_BY_DELETE)){
                searchByDelete(sc,books);
            } else {
                System.out.println(">>> 잘못된 선택입니다 <<<");
            }

        }


    } // end of main


    // 전체 조회 기능 (R)

    // 저장 기능(C)

    // 수정 기능(U)

    // 전체 삭제 기능 (D)


    // 심화
    // 선택 조회 기능
    // 선택 삭제 기능


} // end of class
