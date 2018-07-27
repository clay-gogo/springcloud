package com.czx.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.czx.demo.hystrix.ConsumerServiceHystrix;

//name对应的是服务提供应用名
//fallback对应的回调的接口
@FeignClient(name = "provider",fallback = ConsumerServiceHystrix.class)
public interface ConsumerService {
    @RequestMapping(value = "/add/{a}/{b}")
    String add(@PathVariable("a") int a, @PathVariable("b") int b);
}
