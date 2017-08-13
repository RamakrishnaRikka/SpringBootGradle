package com.smartstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {


	@Id
	@Column(name = "id")
	public int id;

	@Column(name = "name")
	public String name;
	@Column(name = "password")
	public String password;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login() {
		super();
	}

	public Login(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	
}
