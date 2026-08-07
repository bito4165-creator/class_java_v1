package com.oop14;

public class CustomerTest {
    public static void main(String[] args) {
        // 일반 고객 생성
        Customer customerLee = new Customer(10010, "이순신");
        int priceLee = customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo() + " 지불 금액은 " + priceLee + "원입니다.");

        // VIP 고객 생성 (아이디: 10020, 이름: 김유신, 전담 상담원: 100번)
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 100);
        int priceKim = customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " + priceKim + "원입니다.");
    }
}
