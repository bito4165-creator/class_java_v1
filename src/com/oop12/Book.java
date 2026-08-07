package com.oop12;

public class Book {
    private String title;
    private String author;
    private int totalPage; //0
    // 대문자로 시작한느 타입 -> 참조 변수 (null로 초기화)

    // 이 생성자는 외부에서 호출 불가 private이기 떄문
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    // getter (read only)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPage() {
        return totalPage;
    }


    public void showInfo() {
        System.out.println(">>> 책정보 <<<");
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        if (totalPage != 0){
            System.out.println("총 페이지 수 : " + totalPage);
        }
    }



}
