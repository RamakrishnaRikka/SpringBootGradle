package com.smartstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {


	@Id
	@Column(name = "id")
	public int id;

	@Column(name = "name")
	public String name;
	@Column(name = "password")
	public String password;
	@Column(name = "shopName")
	public String shopName;
	@Column(name = "Address")
	public String Address;
	@Column(name = "role")
	public String role;
	@Column(name = "phoneNum1")
	public String phoneNum1;
	@Column(name = "phoneNum2")
	public String phoneNum2;
	@Column(name = "licenseNumber")
	public String licenseNumber;
	@Column(name = "salesPerson")
	public String salesPerson;
	@Column(name = "typeOfUser")
	public String typeOfUser;
	@Column(name = "email")
	public String email;
	
	

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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhoneNum1() {
		return phoneNum1;
	}

	public void setPhoneNum1(String phoneNum1) {
		this.phoneNum1 = phoneNum1;
	}

	public String getPhoneNum2() {
		return phoneNum2;
	}

	public void setPhoneNum2(String phoneNum2) {
		this.phoneNum2 = phoneNum2;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}

	public String getType() {
		return typeOfUser;
	}

	public void setType(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
	}

	public User(int id, String name, String password,String shopName, String Address, String role,
			String phoneNum1, String phoneNum2, String licenseNumber, String salesPerson, String typeOfUser, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.shopName = shopName;
		this.Address = Address;
		this.role = role;
		this.phoneNum1 = phoneNum1;
		this.phoneNum2 = phoneNum2;
		this.licenseNumber = licenseNumber;
		this.typeOfUser = typeOfUser;
		this.email = email;
	}

	
}
