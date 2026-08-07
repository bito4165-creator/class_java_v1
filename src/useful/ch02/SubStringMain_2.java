package useful.ch02;

public class SubStringMain_2 {

    public static void main(String[] args) {
        // 개념 정리 - substring은 문자열의 일부 구간을 잘라내어 새로운 문자열로 반환하는 메서드입니다.
        String text = "HelloWorld";

        // 1. 시작 위치 부터 끝까지 자르기
        String result1 = text.substring(5);
        System.out.println(result1);

        // 2. 시작 위치부터 끝 위치 "앞" 까지
        String result2 = text.substring(0, 5);
        System.out.println(result2);

        // 3. 만들어져 있는 모양 맞추기 개념 확인
        // end - start = 글자 수
        String result3 = text.substring(2, 6);
        System.out.println(result3);

        // 주의할 점 - 범위를 벗어나서 오류가 남 예외처리 해줘야됨.
        String result4 = text.substring(0, 20);
        System.out.println(result4);

    }

}

