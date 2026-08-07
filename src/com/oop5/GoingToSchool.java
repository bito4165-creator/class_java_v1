package com.oop5;

// 객체를 사용하고 실행해보는 테스트 측 코드
public class GoingToSchool {

    public static void main(String[] args) {

        Bus bus133 = new Bus(133);
        Bus bus57 = new Bus(57);
        Student studentKIm = new Student("홍길동 ", 10000);
        Student studentLee = new Student("이순신 ", 10000);

        Subway subway1 = new Subway(1);

        studentKIm.takeBus(bus133);
        studentLee.takeBus(bus133);
        studentKIm.takeSubway(subway1);

        studentKIm.showInfo(); // 현재 소지금 확인
        studentLee.showInfo();
        System.out.println("----------------------");
        bus133.showInfo();

        // 밥 메모리에 생성 - 직접 실행 흐름 만들어서 테스트
        Rice rice1 = new Rice("noodle",1000);
        Rice rice2 = new Rice("pizza", 0);
        Student student1 = new Student("김일",20000);
        Student student2 = new Student("김이",10000);

        student1.riceEat(rice1);
        student2.riceEat(rice2);

        rice1.showInfo();
        rice2.showInfo();



    }

}
