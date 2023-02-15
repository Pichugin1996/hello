package com.pichugin.hello;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
