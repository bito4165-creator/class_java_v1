package exercise;

public class Exercise3 {
    public static void main(String[] args) {
        // 할인된 가격을 화면에 출력하는 코드 작성
        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.30; // 30퍼센트 할인
        // DISCOUNT_RATE 는 추후 변경될 수 있따 (변경 되더라도 코드를 동작 해야 한다.)

        // 할인 계산식 찾아서 준비 (할인된 금액 = 원가 - 원가 * 할인율)
        // 힌트 1
        // 할인된 금액이 얼마인지 구하고, 그 금액을 원본 가격에서 빼기 해주면 된다.
        // 방식 1: 할인 금액을 먼저 구한 뒤 빼기
        double discountAmount = ORIGINAL_PRICE * DISCOUNT_RATE;
        double finalPrice = ORIGINAL_PRICE - discountAmount;
        System.out.println("할인된 금액 : " + (int) finalPrice);

        // 힌트 2
        // 한번에 계산하는것도 가능 (할인된 금액 = 원가 * (1 - 할인율) )
        // 방식 2: 남는 비율(1 - 할인율)을 한 번에 곱하기
        double resultPrice = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);
        // 할인된 계산 금액을 변수에 담아서 화면에 출력(단 정수값으로 출력하시오)
        System.out.println("할인된 금액 : " + (int) resultPrice);

    }
}
