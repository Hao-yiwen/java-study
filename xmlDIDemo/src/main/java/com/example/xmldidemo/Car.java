package com.example.xmldidemo;

import com.example.xmldidemo.yiwen.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.turnOn();
    }
}
