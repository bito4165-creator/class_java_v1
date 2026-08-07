package useful.exceptionStudy;

public class Study1 {
    //문제 1. 0으로 나누기 예외 처리
    //
    //사용자로부터 두 개의 정수를 입력받아 나눗셈 결과를 출력하는 프로그램을 작성하세요.
    //
    //조건
    //
    //0으로 나누는 경우 "0으로 나눌 수 없습니다."를 출력하세요.
    //그 외에는 나눗셈 결과를 출력하세요.
    public int divide(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Study1 study1 = new Study1();
        int result;
        try {
            result = study1.divide(100,2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0 으로 나눌 수 없습니다.");
        }

    }



}
