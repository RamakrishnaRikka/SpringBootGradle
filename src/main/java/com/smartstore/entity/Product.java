package com.smartstore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name = "products")
@NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "product_id")
	private int productId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_price")
	private float productPrice;

	@Column(name = "product_weight")
	private String productWeight;

	private String picture;

	// bi-directional many-to-one association to OrderDetail
	/*
	 * @OneToMany(mappedBy = "product") private List<OrderDetail> orderDetails;
	 */

	//bi-directional many-to-one association to ProductDetail
	/*	@OneToMany(mappedBy="product")
		private List<ProductDetail> productDetails;*/
	
	
	
	public Product() { }
	 

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	/*
	 * public List<OrderDetail> getOrderDetails() { return this.orderDetails; }
	 * 
	 * public void setOrderDetails(List<OrderDetail> orderDetails) {
	 * this.orderDetails = orderDetails; }
	 * 
	 * public OrderDetail addOrderDetail(OrderDetail orderDetail) {
	 * getOrderDetails().add(orderDetail); orderDetail.setProduct(this);
	 * 
	 * return orderDetail; }
	 * 
	 * public OrderDetail removeOrderDetail(OrderDetail orderDetail) {
	 * getOrderDetails().remove(orderDetail); orderDetail.setProduct(null);
	 * 
	 * return orderDetail; }
	 */
	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}

}