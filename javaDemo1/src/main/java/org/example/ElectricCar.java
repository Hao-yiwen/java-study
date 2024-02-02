package org.example;

import org.example.yiwen.ElectricEngine;

public class ElectricCar extends Car {
    public ElectricCar(){
        super(new ElectricEngine());
    }
}
