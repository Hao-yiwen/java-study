package org.example.interfaceTest;

public abstract class Animal implements AbstactAnimal {

    @Override
    public void bark() {
        System.out.println("dasdas");
    }

    public abstract void test();
}
