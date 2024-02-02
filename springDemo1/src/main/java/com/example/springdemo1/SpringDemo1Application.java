package com.example.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDemo1Application {

    public static void main(String[] args) {
//        SpringApplication.run(SpringDemo1Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Car car = context.getBean(Car.class);
        car.start();
    }

}
