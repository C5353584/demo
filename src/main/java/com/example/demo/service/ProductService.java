package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
   
	
public List<Product> getAll();

	
	public Product getProductById(int productId);
	
	public void deleteById(int productId);
}
