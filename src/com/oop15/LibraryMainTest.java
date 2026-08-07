package com.oop15;

import javax.crypto.spec.PSource;

public class LibraryMainTest {

    public static void main(String[] args) {
        // 1. 책 객체를 밖에서 먼저 생성한다 (독립적인 존재)
        Book b1 = new Book("자바의 정석");
        Book b2 = new Book("이펙트브 자바");

        // 2. 도서관을 만들고 책을 넣을 수 있다.
        Library library = new Library(5);
        library.addBook(b1);
        library.addBook(b2);
        library.showBooks();

        System.out.println("도서관 폐관 ---------------");

        // 3. 도서관 객체를 가리키던 참조를 끊는다.
        // 주의 : 이 순간 객체가 사라지는 것이 아니라, GC의 수거 대상이 될 뿐이다.
        library = null;

        // 4. 도서관은 사라졌지만 b1, b2는 여전히 살아있다.
        // 즉, b1, b2 변수가 각 Book 객체를 계속 붙잡고 있기 때문에 GC 대상이 안된다.
        b1.display();
        b2.display();

    }

}
