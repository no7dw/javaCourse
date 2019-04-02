package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
//import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by dengwei on 2019/4/2.
 */
//@ExceptionHandler(value = Exception.class)
public class User {
    @JsonProperty("name")
    private String name;
    public void setName(String name){
        this.name = name;
    }

}
