package com.ayna.aynaproduct.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.ayna.aynaproduct.entity.Product;
import com.ayna.aynaproduct.repo.ProductRepo;

import jakarta.annotation.PostConstruct;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepo productRepo;
	
    
    
    
    
    
    
    
	
	public Product saveProduct(Product Product) {
		// TODO Auto-generated method stub
		return productRepo.save(Product);
	}

	
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	
	public void deleteProduct(Long ProductId) {
		productRepo.deleteById(ProductId);
		
	}
	
	
}
