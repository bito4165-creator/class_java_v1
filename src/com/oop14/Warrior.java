package com.oop14;

public class Warrior extends Hero {

    //부모 클래스의 사용자 정의 생성자가 있따면 반드시 부도 생성자를 호출해야 사용할 수 있다.
    public Warrior(String name, int hp) {
        super(name, hp);
    }

    void comboAttack() {
        System.out.println("전사가 콤보어택을 씁니다.");
    }

}
