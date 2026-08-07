package useful.ch02;

public class ReplaceMain {

    public static void main(String[] args) {
        String text = "Big Apple";

        // 문자 치환
        String result1 = text.replace("A", "a");

        // 문자열 치환
        String result2 = text.replace("Apple", "Banana");

        System.out.println(result1);
        System.out.println(result2);


    }

}
