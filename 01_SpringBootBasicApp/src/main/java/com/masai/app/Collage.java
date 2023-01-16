package com.masai.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Collage {

	 @Value("${collageId}")
	 private Integer collageId;
	
	 @Value("${Collagename}")
	 private String Collagename;

	 @Value("${address}")
	 private String address;
	
	 
	 @Autowired()
	 @Qualifier("sl")
     private List<Student> students=new ArrayList<>();


	public Integer getCollageId() {
		return collageId;
	}


	public void setCollageId(Integer collageId) {
		this.collageId = collageId;
	}


	public String getCollagename() {
		return Collagename;
	}


	public void setCollagename(String collagename) {
		Collagename = collagename;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}

	 
    
    public void showCollage() {
    
    	System.out.println("Collage Id      : "+collageId);
    	System.out.println("Collage Name    : "+Collagename);
    	System.out.println("Collage Address : "+address);
    
    	for(Student student:students) {
    		
    		System.out.println(student);
    		
    		
    	}
    	
    }
    
	
	
	
	
}
