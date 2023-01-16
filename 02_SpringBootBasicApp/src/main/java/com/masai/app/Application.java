package com.masai.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	
		
		ApplicationContext context=  SpringApplication.run(Application.class, args);
	     
	     A a= context.getBean("a",A.class);
        a.funA();
	
	}

}
