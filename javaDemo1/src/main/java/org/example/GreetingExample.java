package org.example;

public class GreetingExample {

    @Greeting(value = "您好")
    public void displayGreeting(){
        System.out.println("这是一个自定义注解的方法");
    }
}
