package com.masai.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Demo {

	@Autowired
	private B b;
	
	@PostConstruct
	public void initMethod() {
	
		System.out.println("I am Inside the Init Method");
	
	}
	

	
	public void funDemo() {
		System.out.println("I am inside the Demo class FunDemo");
		b.funB();
		
	}
	
	
}
