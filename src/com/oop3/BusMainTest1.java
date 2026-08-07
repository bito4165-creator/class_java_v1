package com.oop3;

public class BusMainTest1 {
    public static void main(String[] args) {
        Bus bus1 = new Bus();

        // 1. 속성
        // 버스 번호
        // 탑승 수(현재)
        // 최대 탑승 수
        // 정거장 (현재 정거장 위치)
        // 결제 방법(카드, 현금)
        // 현재 수익금

        // 2. 행위
        // 카드를 찍게 하다
        // 승객을 태운다.
        // 승객을 내려준다.
        // 전진, 후진, 좌회전, 우회전


        bus1.busName = "시내버스";
        bus1.busCode = 1200;
        bus1.makeYear = 2010;

        bus1.drive();
        bus1.busInfo();

    }
}
