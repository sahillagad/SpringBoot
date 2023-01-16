package com.masai.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	@Autowired
	private B b;

	
	public void funA() {
		
		System.out.println("B Address : "+b);
		b.funB();
		
	}
}
