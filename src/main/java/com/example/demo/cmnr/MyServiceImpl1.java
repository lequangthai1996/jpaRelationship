package com.example.demo.cmnr;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("service1")
public class MyServiceImpl1 implements MyService{
	@PostConstruct
	public void init() {
		System.out.println("New Bean : "+ this.getClass().getSimpleName());
	}
	
	@Override
	public String getMessage() {
		return "Message from " + this.getClass().getSimpleName();
	}
	
}