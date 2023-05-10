package com.example.zjazd_1_45c.Zad1;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MySecondJob {


    public MySecondJob(ApplicationContext applicationContext){

        First zad212 = applicationContext.getBean("first", First.class );
        Second zad213 = applicationContext.getBean("second", Second.class );
        zad212.Zad2_1();
        zad213.Zad2_1();
    }
}
