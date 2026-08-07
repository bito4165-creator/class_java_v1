package com.coffee;

public abstract class Beverage {
    private String name;
    private int price;

    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void prepare() {
        System.out.println("에스프레소를 뽑습니다." );
    }

    public void serve() {
        System.out.println(name + "나왔습니다. 가격은 " + price +"원입니다.");
    }
}
