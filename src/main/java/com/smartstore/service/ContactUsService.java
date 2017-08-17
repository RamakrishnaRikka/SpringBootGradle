package com.smartstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartstore.entity.ContactUs;
import com.smartstore.entity.User;
import com.smartstore.repository.ContactUsRepository;
import com.smartstore.repository.ProductRepository;
import com.smartstore.repository.RegistrationRepository;

@Service
@SuppressWarnings("rawtypes")
public class ContactUsService {

	@Autowired
	ContactUsRepository contactUsRepository;

	public String contactUs(ContactUs contactUs) {
		contactUsRepository.save(contactUs);
		return "User registered successfully";
	}

}
