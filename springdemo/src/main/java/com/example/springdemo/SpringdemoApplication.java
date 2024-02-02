package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringdemoApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Car car = context.getBean(Car.class);
        car.start();
    }

}
