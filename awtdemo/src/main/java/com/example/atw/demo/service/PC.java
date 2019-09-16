package com.example.atw.demo.service;

import org.springframework.stereotype.Component;

//@Component("PC")
public class PC extends Compute {
//    private String author ;

    public PC(String author){
        this.author = author;
        System.out.println("PC created");
    }
    public void show(){
        System.out.println("pc show");
    }
}
