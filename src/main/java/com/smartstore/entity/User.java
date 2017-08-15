package com.smartstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "id")
	public int id;

	@Column(name = "name")
	public String name;

	@Column(name = "password")
	public String password;

	@Column(name = "shopname")
	public String shopName;

	// @Column(name = "\"address\"")
	@Column(name = "address")
	public String address;

	@Column(name = "role")
	public String role;

	@Column(name = "phonenum1")
	public String phoneNum1;

	@Column(name = "phonenum2")
	public String phoneNum2;

	@Column(name = "licensenumber")
	public String licenseNumber;

	@Column(name = "salesperson")
	public String salesPerson;

	@Column(name = "typeofuser")
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
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getTypeOfUser() {
		return typeOfUser;
	}

	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", shopName=" + shopName + ", address="
				+ address + ", role=" + role + ", phoneNum1=" + phoneNum1 + ", phoneNum2=" + phoneNum2
				+ ", licenseNumber=" + licenseNumber + ", salesPerson=" + salesPerson + ", typeOfUser=" + typeOfUser
				+ ", email=" + email + "]";
	}

}
