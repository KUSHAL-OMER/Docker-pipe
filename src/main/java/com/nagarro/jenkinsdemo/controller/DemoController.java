package com.nagarro.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
    @GetMapping("/hello")
    public String demoMethod() {
        return "Hello everyone";
    }
    
}
