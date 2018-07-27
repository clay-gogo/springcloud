package com.czx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaSpringProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSpringProviderApplication.class, args);
	}
}
