package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author Chuming Huang
 * @Date 2020/8/19
 */
@SpringBootApplication
@ImportResource("classpath:consumer.xml") //加载xml配置文件
public class SpringbootDubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboClientApplication.class, args);
    }

}
