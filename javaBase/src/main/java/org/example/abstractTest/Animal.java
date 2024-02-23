package org.example.abstractTest;

public abstract class Animal {
    protected String name;

    protected Animal(String name){
        System.out.println(name);
        this.name = name;
    }

    public abstract void MakeSound();
}
