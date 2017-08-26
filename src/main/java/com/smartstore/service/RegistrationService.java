package com.smartstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartstore.entity.User;
import com.smartstore.repository.ProductRepository;
import com.smartstore.repository.RegistrationRepository;

@Service
@SuppressWarnings("rawtypes")
public class RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;

	public String registerUser(User user) {
		registrationRepository.save(user);
		return "User registered successfully";
	}

	@SuppressWarnings("unchecked")
	public String loginUser(User user) {
		System.out.println("name=====" + user.getName());
		List user1 = registrationRepository.findByName(user.getName());

		if (user1.isEmpty()) {
			System.out.println("User does not exist -" + user1);
			return "false";
		} else {
			System.out.println("User exist and here is the details" + user1);
			return "true";
		}
	}

}
