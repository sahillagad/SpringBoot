package com.masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masai.Bean.Collage;
import com.masai.Bean.Student;

@Controller
public class MyController {

//	http://localhost:8888/Students
	@RequestMapping("/Students")
	@ResponseBody
	public List<Student> getStudentList(){
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"Sahil", 764));
		list.add(new Student(2,"Ram", 666));
		list.add(new Student(3,"Rani", 567));
		list.add(new Student(4,"Raj", 456));
		list.add(new Student(5,"TOM", 432));
		list.add(new Student(6,"Manasi", 555));
		
	
		 return list;
		
	}
	
	
	
//	http://localhost:8888/Collage
	@RequestMapping("/Collage")
	@ResponseBody
	public Collage getcollage() {
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"Sahil", 764));
		list.add(new Student(2,"Ram", 666));
		list.add(new Student(3,"Rani", 567));
		list.add(new Student(4,"Raj", 456));
		list.add(new Student(5,"TOM", 432));
		list.add(new Student(6,"Manasi", 555));
		
		
		Collage collage=new Collage();
		collage.setCollageId(1);
		collage.setCollageName("Birla Collage");
		collage.setAddress("Mumbai");
		collage.setList(list);
		
		
	
		return collage;
		
	}
	
	
	
	
//	http://localhost:8888/Collages
	@RequestMapping("/Collages")
	@ResponseBody
	public List<Collage> getcollages() {
		List<Collage> collages=new ArrayList<>();
		
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"Sahil", 764));
		list.add(new Student(2,"Ram", 666));
		list.add(new Student(3,"Rani", 567));
		list.add(new Student(4,"Raj", 456));
		list.add(new Student(5,"TOM", 432));
		list.add(new Student(6,"Manasi", 555));
		
		
		Collage collage=new Collage();
		collage.setCollageId(1);
		collage.setCollageName("Birla Collage");
		collage.setAddress("Mumbai");
		collage.setList(list);
		
		
		
		List<Student> list1=new ArrayList<>();
		list1.add(new Student(1,"jjh", 764));
		list1.add(new Student(2,"uu", 666));
		list1.add(new Student(3,"nbni", 567));
		list1.add(new Student(4,"fshj", 456));
		list1.add(new Student(5,"Tyuytu", 432));
		list1.add(new Student(6,"ff", 555));
		
		Collage collage1=new Collage();
		collage1.setCollageId(2);
		collage1.setCollageName("M k Collage");
		collage1.setAddress("Nashik");
		collage1.setList(list1);

		
		
		
		
		List<Student> list2=new ArrayList<>();
		list2.add(new Student(1,"jjh", 764));
		list2.add(new Student(2,"uu", 666));
		list2.add(new Student(3,"nbni", 567));
		list2.add(new Student(4,"fshj", 456));
		list2.add(new Student(5,"Tyuytu", 432));
		list2.add(new Student(6,"ff", 555));
		
		Collage collage2=new Collage();
		collage2.setCollageId(3);
		collage2.setCollageName("N M Collage");
		collage2.setAddress("PUNE");
		collage2.setList(list2);
		
		collages.add(collage);
		collages.add(collage1);
		collages.add(collage2);
		
		return collages;
	}
	
	
}
