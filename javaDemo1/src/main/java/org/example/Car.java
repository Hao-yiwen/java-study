package org.example;

import org.example.yiwen.ElectricEngine;
import org.example.yiwen.Engine;

public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.turnOn();
    }
}
