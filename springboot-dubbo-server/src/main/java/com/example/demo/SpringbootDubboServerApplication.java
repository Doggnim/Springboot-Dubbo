package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author Chuming Huang
 * @Date 2020/8/19
 */
@SpringBootApplication
@ImportResource("classpath:provider.xml")  //加载xml文件
public class SpringbootDubboServerApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringbootDubboServerApplication.class, args);
        Thread.sleep(Long.MAX_VALUE);
    }

}
