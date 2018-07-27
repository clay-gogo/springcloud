package com.czx.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductionController {

	//简单计算两个数字的和,转换为字符串返回
    @RequestMapping(value = "/add/{a}/{b}")
    public String add(@PathVariable("a") int a, @PathVariable("b") int b) {
        return (a + b) + "";
    }
}
