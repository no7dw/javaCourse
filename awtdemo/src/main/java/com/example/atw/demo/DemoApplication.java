package com.example.atw.demo;

import com.example.atw.demo.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        Hello hello = context.getBean(Hello.class);
        hello.Echo();
//        Hello hello1 = new Hello();
//        hello1.Echo();
    }

}
