package com.oop15;

public class Cpu {
    private String name;

    public Cpu(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println(name + "이 사용되고 있습니다.");
    }

    public void stop() {
        System.out.println(name + "이 사용중지되었습니다.");
    }

}
