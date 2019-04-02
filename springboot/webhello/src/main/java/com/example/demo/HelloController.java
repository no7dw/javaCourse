package com.example.demo;

import com.example.demo.common.MyException;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.User;
/**
 * Created by dengwei on 2019/4/2.
 */
@Slf4j
@RestController //Rest + Json
public class HelloController {
    @Autowired
    Environment environment;
    @RequestMapping("/Hey")

    public User index() throws MyException{
//        User user = new User();
//        user.setName("aaa");
//        return user;
        String envCode = environment.getProperty("spring.profiles.active");
        log.debug("Something else is wrong here", envCode);
        throw new MyException("5000033333 啊");
    }
}
