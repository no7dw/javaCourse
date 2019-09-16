package com.example.atw.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
//    public Computer createComputer (String author){
    public Computer createComputer (){
        return new Laptop("Wade");
//        return new PC("Wade");
    }

}
