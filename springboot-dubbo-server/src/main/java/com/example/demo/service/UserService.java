package com.example.demo.service;

import com.example.demo.entity.User;

/**
 * @Author Chuming Huang
 * @Date 2020/8/19
 */
public interface UserService {
    /**
     * 根据输入用户id返回对应用户
     * @param id
     * @return user
     */
    User findUserById(int id);
}
