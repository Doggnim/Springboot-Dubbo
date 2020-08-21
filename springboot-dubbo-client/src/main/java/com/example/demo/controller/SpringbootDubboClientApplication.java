package com.example.demo.controller;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
@EnableDubbo
public class SpringbootDubboClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboClientApplication.class, args);
    }
}
