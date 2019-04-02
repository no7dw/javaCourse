package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.User;
/**
 * Created by dengwei on 2019/4/2.
 */
@RestController //Rest + Json
public class HelloController {

    @RequestMapping("/Hey")
    public User index(){
        User user = new User();
        user.setName("aaa");
        return user;
    }
}
