package com.czx.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.czx.demo.filters.AccessFilter;


//实例化该过滤器
@Configuration
public class ApiGatewayConfig {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
