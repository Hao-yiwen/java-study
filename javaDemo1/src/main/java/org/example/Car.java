package org.example;

import org.example.yiwen.ElectricEngine;
import org.example.yiwen.Engine;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        List a = new ArrayList();
        engine.turnOn();
    }
}
