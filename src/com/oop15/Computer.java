package com.oop15;

public class Computer {
    private String name;
    private Cpu cpu;

    public Computer(String name) {
        this.name = name;
        this.cpu = new Cpu("intel");
    }

    public void use() {
        System.out.println("컴퓨터가 켜집니다.");
        cpu.use();
    }

    public void stop() {
        System.out.println("컴퓨터를 끕니다");
        cpu.stop();
    }

}
