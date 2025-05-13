package com.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello-World mr pankaj sir";
    }
}
