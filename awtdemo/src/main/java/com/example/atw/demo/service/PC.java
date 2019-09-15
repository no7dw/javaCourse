package com.example.atw.demo.service;

import org.springframework.stereotype.Component;

@Component("PC")
public class PC implements Computer {
    public void show(){
        System.out.println("pc show");
    }
}
