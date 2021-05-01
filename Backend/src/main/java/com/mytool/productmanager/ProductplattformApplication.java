package com.mytool.productmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mytool.productmanager.model.Product;
import com.mytool.productmanager.repository.ProductRepository;

@SpringBootApplication
public class ProductplattformApplication { // implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProductplattformApplication.class, args);
	}
	
	

//	@Autowired
//	private ProductRepository productRepo;
//	
//	@Override
//	public void run(String... args) throws Exception {
		
		
//		this.productRepo.save(new Product("Box", "Neue", "bjr", 50));
//		this.productRepo.save(new Product("Box", "Neue", "bjr", 20));
//		this.productRepo.save(new Product("Box", "Neue", "bjr", 30));
//		this.productRepo.save(new Product("Box", "Neue", "bjr", 40));
		
//	}

}
