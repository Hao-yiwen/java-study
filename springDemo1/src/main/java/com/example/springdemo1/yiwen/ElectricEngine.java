package com.example.springdemo1.yiwen;

public class ElectricEngine implements Engine {
    @Override
    public void turnOn() {
        System.out.println("电动引擎启动");
    }
}
