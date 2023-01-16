package com.masai.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootBasicApp1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootBasicApp1Application.class, args);
	     
	  Collage collage=context.getBean("collage",Collage.class);
	  
	  collage.showCollage();
	 
		
	
	}


	 
}
