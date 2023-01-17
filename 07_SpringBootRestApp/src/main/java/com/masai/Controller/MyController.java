package com.masai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

	 
	
	
	@RequestMapping("/welcome")
	public String myWelcome() {
		
		
		return "Welcome to Spring Boot";
		
	}
	
	@RequestMapping("/Hello")
	public String helloService() {
		
	
		return "Hello Sahil lagad";
	}
	
	@RequestMapping("/car")
	public String CarService() {
		
	
		return "Ignis";
	}
	
	@RequestMapping("/Student")
	public Student getstudent() {
		
		
		Student student=new Student(1, "Sahil","Mumbai", 780);
		
		return student;
	}
	
}
