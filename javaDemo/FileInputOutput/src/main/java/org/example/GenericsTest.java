package org.example;

import java.util.ArrayList;

public class GenericsTest {
    class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    class Dog extends Animal {

        public void eat() {
            System.out.println("Dog is eating");
        }
    }

    public void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        Dog dog = new Dog();
        list.add(dog);
        list.add(new Animal());
    }
}
