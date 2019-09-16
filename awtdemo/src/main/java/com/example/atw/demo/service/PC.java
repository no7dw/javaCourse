package com.example.atw.demo.service;

//@Component("PC")
public class PC extends Computer {
//    private String author ;

    public PC(String author){
        this.author = author;
        System.out.println("PC created");
    }
    public void show(){
        System.out.println("pc show");
    }
}
