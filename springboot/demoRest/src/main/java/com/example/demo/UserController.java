package com.example.demo;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.User;

import java.util.Optional;

@RestController
public class UserController {
//    @Autowired
    private static UserService userService;
    UserController(){
        userService = new UserService();
    }
    @RequestMapping("/user/{id}")
    public User index(@PathVariable int id){
        Optional<User> user = userService.getById(id);
        System.out.println(id);
        return user.orElseGet(
        () -> new User(123, "non-existing-name"));
    }
}
