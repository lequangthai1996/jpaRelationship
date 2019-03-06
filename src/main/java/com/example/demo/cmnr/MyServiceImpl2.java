package com.example.demo.cmnr;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyServiceImpl2 implements MyService{

	@PostConstruct
	public void init() {
		System.out.println("New Bean: "+ this.getClass().getSimpleName());
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
