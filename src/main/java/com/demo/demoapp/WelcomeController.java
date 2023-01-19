package com.demo.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome1")
    public String welcome(){
        return "Hello, User Welcome to my first Spring boot application";
    }
}
