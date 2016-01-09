package com.wade.Human;

public class Baby{
    public void sayHello(){
        System.out.println("My name is "+ this.name);
    } 
    public int age = 1;
    String name ;
    public Baby(){
        System.out.println("I'm born");
    }
    public Baby(String name){
       this.name = name; 
    }
}
