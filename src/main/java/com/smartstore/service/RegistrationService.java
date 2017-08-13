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
}
