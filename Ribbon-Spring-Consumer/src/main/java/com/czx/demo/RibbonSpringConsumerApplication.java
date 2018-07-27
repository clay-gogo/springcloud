package com.czx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//服务发现注解
@EnableDiscoveryClient
@SpringBootApplication
//开启断路器的注解
@EnableHystrix
public class RibbonSpringConsumerApplication {

	@Bean
	//该注解是为了客户端的负载均衡
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(RibbonSpringConsumerApplication.class, args);
	}
}
