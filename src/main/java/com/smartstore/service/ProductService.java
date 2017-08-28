package com.smartstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.smartstore.entity.Product;
import com.smartstore.model.ProductModel;
import com.smartstore.repository.ProductDetailRepository;
import com.smartstore.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productrepository;

	@Autowired
	ProductDetailRepository productDetailRepository;
	
	public String addProduct(Product product) {
		productrepository.save(product);
		return "Product added successfully";
	}

	public Product getProductbyId(Integer id) {
		return productrepository.findOne(id);
	}

	public Product getProductbyName(String name) {
		return productrepository.findByName(name);
	}

	public List<Product> getAllProduct() {
		return productrepository.findAll();
	}
	
	public List<ProductModel> getProductDetailById(Integer productId){
		
		return productDetailRepository.getProductDetailById(productId);
	}

}
