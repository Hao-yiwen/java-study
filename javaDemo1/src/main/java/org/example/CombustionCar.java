package org.example;

import org.example.yiwen.CombunstionEngine;

public class CombustionCar extends Car{
    public CombustionCar(){
        super(new CombunstionEngine());
    }
}
