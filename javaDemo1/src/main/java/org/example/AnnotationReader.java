package org.example;

import java.lang.reflect.Method;

public class AnnotationReader {

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("org.example.GreetingExample");
        Object obj = cls.newInstance();

        for (Method method: cls.getDeclaredMethods()){
            Greeting greeting = method.getAnnotation(Greeting.class);

            System.out.println("Greeting message: " + greeting.value());

            method.invoke(obj);
        }
    }
}
