package com.oop3;

// 버스 클래스 설계
// 속성과 행위를 설계
// BusMainTesr1 파일 생성(객체를 2개 이상 생성하고 결과 출력 해보기)
public class Bus {
    String busName;
    int busCode;
    int makeYear;

    void drive() {
        System.out.println(busCode + "번 버스가 운행중입니다.");
    }

    void busInfo() {
        System.out.println("-----버스정보-----");
        System.out.println("버스 이름 : " + busName);
        System.out.println("버스 번호 : " + busCode);
        System.out.println("생산년도 : " + makeYear);
    }


}
