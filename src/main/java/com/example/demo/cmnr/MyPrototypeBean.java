package com.example.demo.cmnr;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyPrototypeBean {
	
	@PostConstruct
	public void init() {
		System.out.println("New install prototype bean: " +this.getClass().getSimpleName());
	}
	@Autowired
	@Qualifier("service1")
	@Lazy
	private MyService myService;
	
	public void doSomething() {
		System.out.println(myService.getMessage());
	}
}
