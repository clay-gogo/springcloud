package com.czx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@SpringCloudApplication相当于@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker三个功能
@SpringCloudApplication
//开启zuul路由网关
@EnableZuulProxy
public class ZuulSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulSpringCloudApplication.class, args);
	}
}
