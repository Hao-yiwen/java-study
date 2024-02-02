package com.example.springdemo;

import com.example.springdemo.yiwen.Engine;

public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.turnOn();
    }
}
