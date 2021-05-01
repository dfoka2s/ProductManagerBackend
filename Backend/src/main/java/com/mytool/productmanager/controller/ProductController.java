package com.mytool.productmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytool.productmanager.exceptions.ProductNotFoundException;
import com.mytool.productmanager.model.Product;
import com.mytool.productmanager.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/product")
public class ProductController {
//
	private final ProductService productService;

    @Autowired
    public ProductController (ProductService productService) {
    	this.productService = productService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts(){
    	List<Product> product = productService.findAllProducts();
    	return new ResponseEntity<>(product, HttpStatus.OK);
    }

    
    @GetMapping("/find/{id}")
    public ResponseEntity<Product> getProductsById(@PathVariable("id") Long id) throws ProductNotFoundException{
    	Product product = productService.findProductById(id);
    	return new ResponseEntity<>(product, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
    	Product newProduct = productService.addProduct(product);
    	return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
    	Product updateProduct = productService.updateProduct(product);
    	return new ResponseEntity<>(updateProduct, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id){
    	productService.deleteProduct(id);
    	return new ResponseEntity<>( HttpStatus.OK);
    }
}
