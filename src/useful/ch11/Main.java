package useful.ch11;

public class Main {
    public static void main(String[] args) {
        // 10만 원
        BankAccount bankAccount = new BankAccount();
        // 1만원 입금
        Father father = new Father(bankAccount);
        father.start();
        // 5천원 출금
        Mother mother = new Mother(bankAccount);
        mother.start();
        // 기대값 : 10만 5천원
        // 11만원 -> 의도하지 않은 동작이 발생됨.

        // 위 해결 방안은 자바에서 동기화 처리로 해결 할 수 있다.
        // 키워드 synchronized 사용, synchronized 메서드로 만들 수 있다.

    }
}
