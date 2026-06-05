package com.leemuzi.springaopdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get")
    public void get() {
        int a = 3 /0;
        System.out.println("Hello World");;
    }


}
