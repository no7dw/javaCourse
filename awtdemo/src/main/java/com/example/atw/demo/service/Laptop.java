package com.example.atw.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component("laptop")
@AllArgsConstructor
public class Laptop implements Computer {
//    public int cid;
    public void Laptop(){
        System.out.println("Laptop created");
    }
    public void show(){
        System.out.println("laptop show");
    }

}
