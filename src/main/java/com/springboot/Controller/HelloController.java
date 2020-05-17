package com.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/user")
    public String sayHello() {
        return "Hello From Spring Boot Security !!!";
    }
}
