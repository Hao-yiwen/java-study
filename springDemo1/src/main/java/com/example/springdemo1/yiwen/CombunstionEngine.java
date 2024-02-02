package com.example.springdemo1.yiwen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CombunstionEngine implements Engine {
    //凸轮轴
    private Camshaft camshaft;

    //机轴
    private Crankshaft crankshaft;

    @Autowired

    public CombunstionEngine(Camshaft camshaft, Crankshaft crankshaft) {

        this.camshaft = camshaft;

        this.crankshaft = crankshaft;
    }
    @Override
    public void turnOn() {
        System.out.println("燃油引擎启动");
    }
}
