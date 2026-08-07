package com.oop9;

public class Dog {


    // 1. 멤버 변수 (상태) - 외부 접근 차단
    private String name;    // 이름
    private int age;       // 나이
    private double weight;  // 몸무게 (kg)

    // 2. get, set 메서드 (행위)

    // 이름 관리
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // this는 인스턴스 자신의 주소를 가리킴
    }

    // 나이 관리 (방어적 코드 포함)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("경고: 나이는 0보다 작을 수 없습니다.");
        } else {
            this.age = age; // 객체 자신의 메모리에 값을 저장
        }
    }

    // 몸무게 관리 (방어적 코드 포함)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            System.out.println("경고: 몸무게는 0보다 커야 합니다.");
        } else {
            this.weight = weight;
        }
    }

    // 정보 출력 기능
    public void showInfo() {
        System.out.println("강아지 이름: " + name + ", 나이: " + age + ", 몸무게: " + weight + "kg");
    }

}
