package com.czx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czx.demo.service.ConsumerService;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/getresult/{a}/{b}")
    public String getResult(@PathVariable("a") int a, @PathVariable("b") int b) {
        return consumerService.add(a, b);
    }
}
