package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chuming Huang
 * @Date 2020/8/19
 */
@RestController
public class UserController {

    @DubboReference
    UserService userService;

    @GetMapping("/user")
    public User getUserById(@RequestParam("id") int id) {
        return userService.findUserById(id);
    }

}
