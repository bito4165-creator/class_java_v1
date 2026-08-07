package com.oop4;

public class UserInfo {

    // 멤버 변수
    String userId;
    String userPassword;
    String userName;
    String userAddress;
    String phoneNumber;

    // tip - 객체가 생성될 때 가장 먼저 실행되는 부분은 생성자이다.
    //              매개변수
    public UserInfo(String id) {
        userId = id;
    }

    public UserInfo(String id, String password) {
        userId = id;
        userPassword = password;
    }

    public UserInfo(String id, String passwrod, String name) {
        userId = id;
        userPassword = passwrod;
        userName = name;
    }

    public UserInfo(String id, String password, String name, String address) {
        userId = id;
        userPassword = password;
        userName = name;
        userAddress = address;
    }

    public UserInfo(String id, String password, String name, String address, String number) {
        userId = id;
        userPassword = password;
        userName = name;
        userAddress = address;
        phoneNumber = number;
    }


}
