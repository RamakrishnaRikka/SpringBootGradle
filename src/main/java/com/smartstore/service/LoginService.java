package com.smartstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartstore.entity.Login;
import com.smartstore.entity.User;
import com.smartstore.repository.LoginRepository;
import com.smartstore.repository.RegistrationRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository  loginRepository;
	
	public boolean getProductbyId(String name, String password) {
		 Login login = loginRepository.findByNamePassword(name);
		 if (login==null)
			 return false;
		 return true;
		 
	}
}
