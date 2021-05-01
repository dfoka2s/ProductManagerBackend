package com.mytool.productmanager.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mytool.productmanager.exceptions.ProductNotFoundException;
import com.mytool.productmanager.repository.ProductRepository;
import com.mytool.productmanager.model.Product;

@Service
@Transactional
@CrossOrigin(origins = "http://localhost:4200")
//@RestController
@RequestMapping("/product")
public class ProductService {
	
private final ProductRepository productRepo;
    
    @Autowired
    public ProductService (ProductRepository productRepo) {
    	this.productRepo = productRepo;
    }
    
    public Product addProduct( Product product) {
//    	product.setID(UUID.randomUUID().toString());
    	return  productRepo.save(product);
    	
    }
    

    public List<Product> findAllProducts(){
    	return productRepo.findAll();
    }
    
    public Product updateProduct(Product product) {
    	return productRepo.save(product);
    }
    
    public Product findProductById(Long id) throws ProductNotFoundException {
    	return productRepo.findProductById(id).orElseThrow(() -> new ProductNotFoundException("Das Produkt mit dem ID " +id+ " wurde nicht gefunden"));
    }
    
    public void deleteProduct(Long id) {
    	productRepo.deleteProductById(id);
    	
    }


}
