package com.masai.Bean;


public class Product {

private int id;
private String name;
private double mrp;
public Product(int id, String name, double mrp) {
	super();
	this.id = id;
	this.name = name;
	this.mrp = mrp;
}
public Product() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMrp() {
	return mrp;
}
public void setMrp(double mrp) {
	this.mrp = mrp;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", mrp=" + mrp + "]";
}




}
