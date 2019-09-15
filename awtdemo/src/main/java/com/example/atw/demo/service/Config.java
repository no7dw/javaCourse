package com.example.atw.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Computer createComputer1 (){
//        return new Laptop();
        return new PC();
    }

}
