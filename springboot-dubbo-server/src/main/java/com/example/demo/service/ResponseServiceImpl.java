package com.example.demo.service;

/**
 * @Author Chuming Huang
 * @Date 2020/8/19
 */
public class ResponseServiceImpl implements ResponseService {
    @Override
    public String getResponseByNum(int num) {
        if (num == 233) {
            return "哈哈哈!";
        } else if (num == 886) {
            return "拜拜了~";
        }
        return "无法识别.";
    }
}
