package com.example.atw.demo.service;

//@Component("laptop")
//@AllArgsConstructor
public class Laptop extends Computer {
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
