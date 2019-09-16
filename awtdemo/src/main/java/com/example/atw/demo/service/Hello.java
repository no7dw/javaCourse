package com.example.atw.demo.service;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@AllArgsConstructor
@Component
@Setter
@Getter
//@Scope(value = "prototype")
public class Hello {
//    @Autowired
    private Compute computer;

//    @Autowired
//    @Qualifier("laptop")
//    private Computer laptop;

//    @Autowired
//    @Qualifier("PC")
//    private Computer pc;


    //    private String author;
    public Hello(Computer computer) {
        this.computer = computer;
        System.out.println("constructor created");
    }
//    public Hello(){
//        System.out.println("constructor created with author");
//    }
    public void Echo(){
        System.out.println("echo");
        computer.show();
    }
}
