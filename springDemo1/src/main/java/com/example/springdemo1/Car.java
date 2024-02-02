package com.example.springdemo1;

import com.example.springdemo1.yiwen.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.turnOn();
    }
}
