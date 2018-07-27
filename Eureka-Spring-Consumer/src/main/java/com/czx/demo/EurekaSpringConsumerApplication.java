package com.czx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//开启Feign时，也开启断路器
@EnableFeignClients
@EnableDiscoveryClient
public class EurekaSpringConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSpringConsumerApplication.class, args);
	}
}
