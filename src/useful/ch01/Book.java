package useful.ch01;

// import java.lang.String;
// import java.lang.*; <-- 자동으로 가지고 오는 녀석이라 직접 명시할 필요가 없다.

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "[" + title + "," + author + "]";
    }

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만헤세");
        Book book2 = book;
        Book book3 = new Book("데미안", "헤르만헤세");
        System.out.println(book);
        System.out.println(book == book2); // true
        System.out.println(book.equals(book2)); // equals 기본 동작은 == 이다 true

        System.out.println("------------------");
        System.out.println("로깅1 - 책의 제목 : "+ book.title);

        // 논리적으로 같은 객체라고 판별하고 싶을 때 equals() 메서드를 재 정의해서 활욜 할 수 있다.
        // 단 . equals() 재정의 할때 반드시 해시코드도 함께 재정의해야한다.

        System.out.println(book.hashCode());

    }


}
