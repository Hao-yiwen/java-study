package org.example.abstractTest;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void MakeSound() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("hhhhah");
        dog.MakeSound();
    }

    public void a(){
        System.out.println("a");
    }

    public final void b(){
        System.out.println("a");
    }
}
