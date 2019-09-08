package com.example.demo.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public final class CommonResult<T> {

    private int status = HttpStatus.OK.value();
    private String errMsg = "";
    private T dataBody;
    public CommonResult(){}
    public CommonResult(int status , T body){
        this.status = status;
        this.dataBody = body;
    }

}
