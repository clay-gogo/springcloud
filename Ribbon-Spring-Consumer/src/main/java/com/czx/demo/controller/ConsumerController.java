package com.czx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.czx.demo.servie.ConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/getOrderUser/{a}/{b}")
    public String getOrderUser(@PathVariable("a") int a, @PathVariable("b") int b) {
    	//  provider 对应的是服务提供者的项目名称application.name
        return consumerService.getOrderUser(a, b);
    }
    
}
