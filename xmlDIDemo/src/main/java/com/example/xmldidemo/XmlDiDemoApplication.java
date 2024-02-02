package com.example.xmldidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XmlDiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic-config.xml");
        Car car = context.getBean(Car.class);
        car.start();

    }

}
