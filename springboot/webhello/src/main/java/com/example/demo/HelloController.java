package com.example.demo;

import com.example.demo.common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.User;
/**
 * Created by dengwei on 2019/4/2.
 */
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
        throw new MyException(envCode);

    }
}
