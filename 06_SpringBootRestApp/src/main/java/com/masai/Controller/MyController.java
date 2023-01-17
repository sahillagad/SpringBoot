package com.masai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class MyController {

	 
	
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String myWelcome() {
		
		
		return "Welcome to Spring Boot"; // row data
		
	}
	
	@RequestMapping("/Hello")
	@ResponseBody
	public String helloService() {
		
	
		return "Hello Sahil lagad";
	}
	
}
