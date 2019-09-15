package com.example.atw.demo.service;


import lombok.AllArgsConstructor;
import ch.qos.logback.core.boolex.EvaluationException;
import com.sun.xml.internal.rngom.digested.DValuePattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@AllArgsConstructor
@Component
@Setter
@Getter
//@Scope(value = "prototype")
public class Hello {
    private Computer computer;

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
//    public Hello(String author){
//        this.author = author;
//        System.out.println("constructor created with author");
//    }
    public void Echo(){
        System.out.println("echo");
        computer.show();
    }
}
