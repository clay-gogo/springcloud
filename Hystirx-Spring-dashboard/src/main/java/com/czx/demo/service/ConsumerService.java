package com.czx.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumerService {

	@Autowired
	RestTemplate restTemplate;
	
	//断路器注解
	/**
     * 定义服务降级逻辑(serviceFallback)
     * 并且自动的实现了线程调用得依赖隔离-实现线程池的隔离，
     * 为每一个依赖服务创建一个独立的线程池，这样就算某一个依赖服务出现延迟过高
     * 的情况，也只是对该依赖服务的调用产生影响，而不会拖慢其他的服务。
     *
     * Hystrix会将请求结果放入缓存，默认缓存key既是请求参数
     */
	@HystrixCommand(fallbackMethod = "serviceFallback")
	public String add(int a, int b) {
	  	//  provider 对应的是服务提供者的项目名称application.name
	    return restTemplate.getForEntity("http://provider/add/"+a+"/"+b,String.class).getBody();
	}
		
	//断路时调用的方法
	//该方法中的参数格式要对应getOrderUser对应的参数
	public String serviceFallback(int a, int b) {
	    return "hi,sorry,error!";
	}
}
