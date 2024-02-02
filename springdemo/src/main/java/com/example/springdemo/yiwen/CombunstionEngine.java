package com.example.springdemo.yiwen;

public class CombunstionEngine implements Engine {
    //凸轮轴
    private Camshaft camshaft;

    //机轴
    private Crankshaft crankshaft;

    public CombunstionEngine(Camshaft camshaft, Crankshaft crankshaft) {

        this.camshaft = camshaft;

        this.crankshaft = crankshaft;
    }
    @Override
    public void turnOn() {
        System.out.println("燃油引擎启动");
    }
}
