package com.leemuzi.httpclientdemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/get")
    public String getClient(){
        return "Hello Http Client : getClient";
    }

    @PostMapping("/post")
    public String postClient(){
        return "Hello Http Client : postClient";
    }
}
