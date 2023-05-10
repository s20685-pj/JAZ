package com.example.zjazd_1_45c.Zad1;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class First {
    public First(){
        System.out.println("My first Component");

    }

    public void printlnHelloMessage(){
        System.out.println("Do I will pass this subject?");
    }
    public void Zad2_1(){
        System.out.println("Nazwa komponentu to: First, Nazwa metody to printHelloMessage");
    }

}
