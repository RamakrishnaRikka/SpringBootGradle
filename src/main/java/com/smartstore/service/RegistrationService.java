package com.smartstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartstore.entity.User;
import com.smartstore.repository.ProductRepository;
import com.smartstore.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;
	
	public String registerUser(User user) {
		registrationRepository.save(user);
		return "User resistered successfully";
	}
	
	public String loginUser(User user) {
		System.out.println("name====="+user.name);
		User user1 = registrationRepository.findByName(user.name);
		System.out.println("User exist and here is the details"+user1);
		if(user1==null)
			return "false";
		else
			return "true";
		//return "User exist and here is the details"+user1;
	}
	
}
