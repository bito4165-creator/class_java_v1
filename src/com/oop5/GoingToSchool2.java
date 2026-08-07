package com.oop5;

public class GoingToSchool2 {
    public static void main(String[] args) {
        // 객체를 다양하게 생성해서 동작시켜보고 상요작용하는지 확인해보자.
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
