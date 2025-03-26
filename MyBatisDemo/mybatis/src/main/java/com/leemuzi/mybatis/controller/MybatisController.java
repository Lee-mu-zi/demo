package com.leemuzi.mybatis.controller;

import com.leemuzi.mybatis.domain.User;
import com.leemuzi.mybatis.service.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 李Muzi
 * @Date 2025/3/22 14:28
 * @Description
 */
@RestController
public class MybatisController {

    @Autowired
    private MybatisService mybatisService;

    @GetMapping("/count")
    public int count() {
        return mybatisService.count();
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id) {
        return mybatisService.getUser(id);
    }

    @PostMapping("/createUser")
    public boolean createUser(@RequestBody User user) {
        return mybatisService.createUser(user);
    }

    @PutMapping("/updateUser")
    public boolean updateUser(@RequestBody User user) {
        return mybatisService.updateUser(user);
    }

}
