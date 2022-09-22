package com.example.demo;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@SpringBootTest
@ActiveProfiles(profiles = "test")
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	ProductRepository prepo;
	
	@Autowired
	ProductService pservice;
	
	@Test
	void getAll() {
		List<Product> products=pservice.getAll();
		Assertions.assertThat(products).size().isGreaterThan(0);
	}

}
