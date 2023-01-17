package com.masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Bean.Product;

@RestController
public class MyController {

	@RequestMapping(value = "/products",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProducts(){
		List<Product> list=new ArrayList<>();
		list.add(new Product(1, "Lux",160));
		list.add(new Product(2, "Pen",100));
		list.add(new Product(3, "Laptop",45000));
		list.add(new Product(4, "TV",10000));
		list.add(new Product(5, "Speaker",2100));

		return list;
	}
	
	
	@RequestMapping("/GetProduct")
	public Product getproductBYId() {
		return new Product(1,"LUX",230);		

	}
	

	
	
	@RequestMapping(value = "/GetProduct2",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getproductBYId2() {
		return new Product(1,"LUX",230);		
	}
	
	
	@GetMapping(value =  "/GetProduct3",produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getproductBYId3() {
		return new Product(1,"LUX",230);		
	}

	
	@GetMapping(value =  "/GetProduct4",produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getproductBYId4() {
		
		return new Product(1,"LUX",230);		
	
	}


}
