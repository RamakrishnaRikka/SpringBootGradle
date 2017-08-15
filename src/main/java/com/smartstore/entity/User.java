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
	@Column(name = "shopname")
	public String shopname;
	@Column(name = "Address")
	public String address;
	@Column(name = "role")
	public String role;
	@Column(name = "phoneNum1")
	public String phone1;
	@Column(name = "phoneNum2")
	public String phone2;
	@Column(name = "lnumber")
	public String lnumber;
	@Column(name = "salesPerson")
	public String salespersonname;
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

	public String getshopname() {
		return shopname;
	}

	public void setshopname(String shopname) {
		this.shopname = shopname;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getphone1() {
		return phone1;
	}

	public void setphone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getphone2() {
		return phone2;
	}

	public void setphone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getlnumber() {
		return lnumber;
	}

	public void setlnumber(String lnumber) {
		this.lnumber = lnumber;
	}

	public String getsalespersonname() {
		return salespersonname;
	}

	public void setsalespersonname(String salespersonname) {
		this.salespersonname = salespersonname;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	public User(int id, String name, String password,String shopname, String address, String role,
			String phone1, String phone2, String lnumber, String salespersonname, String typeOfUser, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.shopname = shopname;
		this.address = address;
		this.role = role;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.lnumber = lnumber;
		//this.typeOfUser = typeOfUser;
		this.email = email;
	}

	
	
}
