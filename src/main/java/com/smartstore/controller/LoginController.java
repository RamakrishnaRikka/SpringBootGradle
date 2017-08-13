package com.smartstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartstore.entity.Login;
import com.smartstore.entity.User;
import com.smartstore.service.LoginService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	LoginService loginService;


	@PostMapping("/user")
	public Login getProductbyId(@RequestBody Login login) {
		//return loginService.getProductbyId(login);
		return new Login();
	}

	
	
	/*
	@GetMapping("/products/{name}")
	public Product getProductbyName(@PathVariable String name) {
		return productService.getProductbyName(name);
	}

	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
	*/
}
