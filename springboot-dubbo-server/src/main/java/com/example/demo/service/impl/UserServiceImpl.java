package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.selectUserById(id);
    }

}
