package com.oop12;

public class Phone {
    private String name;
    private String phoneNum;

    public Phone(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void showInfo( ) {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : "+ phoneNum);
    }

}
