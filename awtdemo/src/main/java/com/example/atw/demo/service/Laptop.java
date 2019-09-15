package com.example.atw.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

//@Component("lap1")
@Component
@AllArgsConstructor
public class Laptop {
//    public int cid;
    public void Laptop(){
        System.out.println("Laptop created");
    }
    public void show(){
        System.out.println("latop show");
    }

}
