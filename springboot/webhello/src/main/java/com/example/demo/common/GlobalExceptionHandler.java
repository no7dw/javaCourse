package com.example.demo.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by dengwei on 2019/4/2.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorMsg ErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        ErrorMsg er = new ErrorMsg();
        er.setCode(503);
        er.setMessage(e.getMessage().toString());
        return er;
        //er.exceptionHandler(e);
    }
}
