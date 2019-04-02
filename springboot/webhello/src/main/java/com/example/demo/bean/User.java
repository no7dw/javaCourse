package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by dengwei on 2019/4/2.
 */

public class User {
    @JsonProperty("name")
    private String name;
    public void setName(String name){
        this.name = name;
    }

}
