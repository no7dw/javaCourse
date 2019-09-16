package com.example.atw.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

//@Component("laptop")
//@AllArgsConstructor
public class Laptop extends Compute {
//    public int cid;
//    private String author ;
    public Laptop(String author){
        this.author = author;
        System.out.println("Laptop created");
    }
    public void show(){
        System.out.println("laptop show");
    }

}
