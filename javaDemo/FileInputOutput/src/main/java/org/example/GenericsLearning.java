package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericsLearning {
    class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    class Dog extends Animal {

        public void eat() {
            System.out.println("Dog is eating");
        }

        public void bark() {
            System.out.println("Dog is barking");
        }
    }

    class Cat extends Animal {
        public void eat() {
            System.out.println("Cat is eating");
        }

        public void meow() {
            System.out.println("Cat is meowing");
        }
    }

    public void main(String[] args) {
        List<? super Animal> list = new ArrayList<Animal>();
        Dog dog = new Dog();
        list.add(dog);
        list.add(new Cat());
        for (Object animal : list) {
            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Cat) {
                ((Cat) animal).meow();
            }
        }
    }
}
