package com.oop12;

// 테스트 코드 작성해보기
public class BookTest {

    public static void main(String[] args) {
        Book[] books = new Book[10]; // [주소][주소][주소][주소][주소][null][null][null][nll][주소]
        books[0] = new Book("플러터UI실전", "김근호", 300);
        books[1] = new Book("무궁화꽃이피었습니다", "김진명", 500);
        books[2] = new Book("흐르는 강물처럼", "파울로코엘료", 450);
        books[3] = new Book("리딩으로리드하라", "이지성",400);
        books[4] = new Book("사피엔스", "유발하라리",850);

        books[9] = new Book("홍길동전", "허균", 350);

        // book[0] d인덱스에 있는 객체의 title 출력해
        // 객체 안에 접근해서 정렬로 가져오기.
        String tile = books[0].getTitle();
        String author = books[0].getAuthor();
        int totalPage = books[0].getTotalPage();

        for (int i = 0; i < books.length; i++) {
            // books[i].getTitle();
            // 방어적 코드 작성이 필요하다 (배열)
            if(books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }


    }

}
// NullPointerException <- 객체를 생성하지 않았거나 가리키는 주소가 없을때 오류가 발생