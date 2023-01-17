package com.masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Bean.Employee;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {


	 List<Employee> employees=new ArrayList<>();
	 
	 @PostConstruct
	 public void initMethod() {
		 
		 employees.add(new Employee(1,"Ram", 45000, "HR"));
		 employees.add(new Employee(2,"Rani", 55000, "IT"));
		 employees.add(new Employee(3,"Tom", 55000, "IT"));
		 employees.add(new Employee(4,"Raj", 85000, "IT"));
		 employees.add(new Employee(5,"Sahil", 35000, "IT"));
	 }

	 @RequestMapping(value = "/getEmployee",produces = MediaType.APPLICATION_XML_VALUE)
	 public Employee getEmployee() {
		 
		 return new Employee(1,"Ram", 45000, "HR");
		 
	 }
	
	 @RequestMapping("/getEmployees")
	 public  List<Employee> getEmployees() {
		 
		 return employees;
		 
	 }
	 
	  
	 
}
