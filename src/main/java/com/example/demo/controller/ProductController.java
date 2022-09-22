package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/details")
public class ProductController {

	
	@Autowired
	 ProductService proservice;
	 
	 @GetMapping("/")
	public String show() {
		return "Hello";
	}
	
	@GetMapping("/pro")
	public List<Product> getAll(){
		return proservice.getAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id){
		Product product= proservice.getProductById(id);
		
		return product;
	}
	
	@DeleteMapping("/Product/{id}")
	public String deleteById(@PathVariable int id){
		Product product= proservice.getProductById(id);
		
		return "Deleted the Product";
	}
}
