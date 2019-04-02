package com.example.demo.common;
import lombok.*;
//import java.util.HashMap;

/**
 * Created by dengwei on 2019/4/2.
 */

@Data
public class ErrorMsg {

//    public HashMap<String ,Object> exceptionHandler(Exception e) {
//        HashMap<String, Object> result = new HashMap<String, Object>() {
//        };
//        result.put("Code", "-1");
//        result.put("Msg", e.getMessage());
//        return result;
//    }

    private Integer code;
    private String message;

}
