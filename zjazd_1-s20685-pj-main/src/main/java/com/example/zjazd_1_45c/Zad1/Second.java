package com.example.zjazd_1_45c.Zad1;


import org.springframework.stereotype.Component;

@Component
public class Second {

    public Second(First first){
        System.out.println("I wanna pass this subject");
        first.printlnHelloMessage();

    }
    public void Zad2_1(){
        System.out.println("Nazwa komponentu to: Second, Nazwa metody to Second");
    }
}
