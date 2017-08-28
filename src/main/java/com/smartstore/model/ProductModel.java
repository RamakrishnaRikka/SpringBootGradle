package com.smartstore.model;

import java.io.Serializable;
import java.util.Date;
/**
 * This class represents the details of the product.
 * 
 */
public class ProductModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int productId;

	private String productName;

	private float productPrice;

	private int productWeight;

	private int unitsInStock;

	private String description;

	private Date productExpiryDate;

	private String picture;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getProductExpiryDate() {
		return productExpiryDate;
	}

	public void setProductExpiryDate(Date productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public ProductModel(int productId, String productName, float productPrice, int productWeight, int unitsInStock,
			String description, Date productExpiryDate, String picture) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productWeight = productWeight;
		this.unitsInStock = unitsInStock;
		this.description = description;
		this.productExpiryDate = productExpiryDate;
		this.picture = picture;
	}

}