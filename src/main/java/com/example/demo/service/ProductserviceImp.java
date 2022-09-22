package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;


@Service
public class ProductserviceImp implements ProductService{

	
	@Autowired
    ProductRepository prepo;
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return prepo.findById(productId).get();
	}

	@Override
	public void deleteById(int productId) {
		// TODO Auto-generated method stub
		prepo.deleteById(productId);;
	}
	
	
}
