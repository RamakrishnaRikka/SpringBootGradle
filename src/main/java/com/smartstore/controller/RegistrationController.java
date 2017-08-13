package com.smartstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartstore.entity.User;
import com.smartstore.service.RegistrationService;

@RestController
@CrossOrigin
@RequestMapping(value = "/registeruser")
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@PostMapping("/register/add")
	public String addProduct(@RequestBody User user) {
		System.out.println("addproduct--" + user);
		return registrationService.registerUser(user);
	}

	/*
	 * @GetMapping("/product/{id}") public Product getProductbyId(@PathVariable
	 * Integer id) { return productService.getProductbyId(id); }
	 * 
	 * @GetMapping("/products/{name}") public Product
	 * getProductbyName(@PathVariable String name) { return
	 * productService.getProductbyName(name); }
	 * 
	 * @GetMapping("/products") public List<Product> getAllProduct() { return
	 * productService.getAllProduct(); }
	 */
}
