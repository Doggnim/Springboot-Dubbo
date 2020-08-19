package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Author Chuming Huang
 * @Date 2020/8/19
 */
@Service
public interface ResponseService {
    /**
     * 根据输入数字返回对应字符串
     * @param num
     * @return string
     */
    String getResponseByNum(int num);
}
