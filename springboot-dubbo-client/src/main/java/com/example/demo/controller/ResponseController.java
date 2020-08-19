package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.ResponseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chuming Huang
 * @Date 2020/8/19
 */
@RestController
public class ResponseController {

    @Reference
    ResponseService responseService;

    @GetMapping
    public String getResponseByNum(@RequestParam("num") int num) {
        return responseService.getResponseByNum(num);
    }


}
