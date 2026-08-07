package com.oop16;

public class AnimalTest1 {

    public static void main(String[] args) {

        // 1. 자기 타입으로 바라보기
        Animal animal1 = new Animal();
        animal1.move();
        animal1.eating();
        System.out.println("----------------");

        // 2. 부모 타입으로 자식 객체 바라보기 (업캐스팅)
        Animal animal2 = new Tiger(); // 업캐스팅 된 상태 - 0생략 가능
        animal2.move();
        animal2.eating();
        // 3. 다운 캐스팅 작성해보기
        Tiger tiger = (Tiger) animal2; // 강제 형변환
        tiger.hunting();

        System.out.println("-------------------");

        // 2.1 부모 타입으로 자식 객체 바라보기 (업캐스팅)
        Animal animal3 = new Human();
        animal3.move();
        animal3.eating();

        // 3. 문제 확인
        // Human 객체에는 readBook() 메서드가 호출 될까?
        // animal3.readBook()  <---- 에러 발생 : 실재 객체 Human이 맞지만 컴파일 시점에 readBook()을 호출 할 수 없음.
        // 왜? 현재 부모 타입으로 바라보고 있기 때문이다.

        // 핵심 - 컴파일 시점에는 타입만 바라보고 런 타임 시점에는 실제 동작하는 객체의 행위가 실행된다.
    }

}
