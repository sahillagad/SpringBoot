package com.masai.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ReferClass {

	
	@Bean("sl")
	public List<Student> getStudent(){
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"Ram", 546));
		list.add(new Student(2,"Sahil", 553));
		list.add(new Student(3,"Raj", 667));
		list.add(new Student(4,"Rani", 765));
		list.add(new Student(5,"Pramila",764));
		return list;
	}
}
