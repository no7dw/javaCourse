package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping(path = "health")
    @ResponseBody
    public ResponseEntity<String> index123(){
        return ResponseEntity.ok("ok");
    }
    @RequestMapping(path = "healths")
    @ResponseBody
    public String index1(){
        return "oks";
    }
    @RequestMapping(path = "health", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> index(){
//        return ResponseEntity.ok("okp");
        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).build();
    }
}
