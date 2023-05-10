package com.example.zjazd_1_45c.Zad4;

import com.example.zjazd_1_45c.Zad2_25_03_2023.SecondTask;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MyFourthJob2 {

    @Bean
    public MyFourthJob myFourthJob(@Value("${my.own.value}") String valueFromProprties){
     System.out.println(valueFromProprties);
        return new MyFourthJob();

    }

    @Bean
    public List<String> defaultData(SecondTask secondTask) {
        System.out.println(secondTask.getCredentials().getUser());
        System.out.println(secondTask.getCredentials().getPassword());
        System.out.println(secondTask.getLoginUrl());
        return List.of("Some String");
    }
}
