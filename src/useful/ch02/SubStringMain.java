package useful.ch02;

public class SubStringMain {

    public static void main(String[] args) {
        String text = "big apple tree";

        // 1. 인덱스 부터 끝까지
        String result1 = text.substring(4);

        // 2. 인덱스 부터 인덱스까지
        String result2 = text.substring(0,4);

        // 2_1 중간부분 추출
        String result3 = text.substring(4,10);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}

