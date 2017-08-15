package com.smartstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartstore.entity.Login;
import com.smartstore.service.LoginService;

@RestController
@CrossOrigin
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping("/user")
	public Login isUserExist(@RequestBody Login login) {
		// loginService.getProductbyId(login);
		return new Login();
		/*
		 * Login isExist =loginService.getProductbyId(login); if(isExist!=null)
		 * return true; return false;
		 */
	}

	/*
	 * @GetMapping("/products/{name}") public Product
	 * getProductbyName(@PathVariable String name) { return
	 * productService.getProductbyName(name); }
	 * 
	 * @GetMapping("/products") public List<Product> getAllProduct() { return
	 * productService.getAllProduct(); }
	 */
}
