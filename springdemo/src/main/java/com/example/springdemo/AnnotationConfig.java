package com.example.springdemo;

import com.example.springdemo.yiwen.Camshaft;
import com.example.springdemo.yiwen.CombunstionEngine;
import com.example.springdemo.yiwen.Crankshaft;
import com.example.springdemo.yiwen.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    @Bean
    public Car car(Engine engine){
        return new Car(engine);
    }

    @Bean
    public Engine engine(Camshaft camshaft, Crankshaft crankshaft){
        return new CombunstionEngine(camshaft, crankshaft);
    }

    @Bean
    public Camshaft camshaft(){
        return new Camshaft();
    }

    @Bean
    public Crankshaft crankshaft(){
        return new Crankshaft();
    }
}
