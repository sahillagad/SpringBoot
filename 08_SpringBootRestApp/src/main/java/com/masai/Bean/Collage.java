package com.masai.Bean;

import java.util.ArrayList;
import java.util.List;

public class Collage {

	private int collageId;
	private String collageName;
	private String address;
	
	
	private List<Student> list=new ArrayList<>();


	public Collage(int collageId, String collageName, String address, List<Student> list) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.address = address;
		this.list = list;
	}


	public Collage() {
		super();
	}


	public int getCollageId() {
		return collageId;
	}


	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}


	public String getCollageName() {
		return collageName;
	}


	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Student> getList() {
		return list;
	}


	public void setList(List<Student> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", address=" + address + ", list="
				+ list + "]";
	}
	
	
	
}
