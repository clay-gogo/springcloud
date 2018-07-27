package com.czx.demo.servie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumerService {

	@Autowired
    private RestTemplate restTemplate;
	
	//断路器注解
	@HystrixCommand(fallbackMethod = "serviceFallback")
	public String getOrderUser(int a, int b) {
    	//  provider 对应的是服务提供者的项目名称application.name
        return restTemplate.getForEntity("http://provider/add/"+a+"/"+b,String.class).getBody();
    }
	
	//断路时调用的方法
	//该方法中的参数格式要对应getOrderUser对应的参数
	public String serviceFallback(int a, int b) {
        return "hi,sorry,error!";
    }
}
