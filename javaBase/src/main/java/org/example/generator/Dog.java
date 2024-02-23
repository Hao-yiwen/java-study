package org.example.generator;

public class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
