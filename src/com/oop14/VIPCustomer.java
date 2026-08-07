package com.oop14;

public class VIPCustomer extends Customer {
    private int agentID;
    private double salesRatio;

    // 생성자: 상속받은 필드와 VIP 전용 필드 초기화
    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); // 상위 클래스 생성자 호출
        customerGrade = "VIP";
        bonusRatio = 0.05; // VIP는 5% 적립
        salesRatio = 0.1;  // 10% 할인
        this.agentID = agentID;
    }

    // 메서드 오버라이딩(Overriding): VIP는 할인율을 적용하여 가격 계산
    @Override
    public int calcPrice(int price) {
        bonusPoint += (int)(price * bonusRatio);
        return price - (int)(price * salesRatio);
    }

    // 전담 상담원 ID 반환
    public int getAgentID() {
        return agentID;
    }
}