package org.example;

public class JavaDerived extends KotlinBase{
    @Override
    public void displayText() {
        System.out.println("lalala");
    }

    public static void main(String[] args) {
        JavaDerived test = new JavaDerived();
        test.displayText();
    }
}
