package com.pichugin.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello(){
        System.out.println("Hello");
        return "Hello";
    }
}
