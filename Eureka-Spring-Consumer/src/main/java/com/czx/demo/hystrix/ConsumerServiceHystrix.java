package com.czx.demo.hystrix;

import org.springframework.stereotype.Service;

import com.czx.demo.service.ConsumerService;

@Service
public class ConsumerServiceHystrix implements ConsumerService{

	@Override
	public String add(int a, int b) {
		// TODO Auto-generated method stub
		return "error,this is Hystrix return";
	}

}
