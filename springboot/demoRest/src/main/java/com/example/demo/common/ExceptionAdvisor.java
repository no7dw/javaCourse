package com.example.demo.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionAdvisor {
    @ResponseBody
    @ResponseStatus
    @ExceptionHandler(value = Exception.class)
    public CommonResult exceptionHandler(Exception e){
        return new CommonResult(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

}
