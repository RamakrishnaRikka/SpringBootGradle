package com.smartstore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the product_details database table.
 * 
 */
@Entity
@Table(name="product_details")
@NamedQuery(name="ProductDetail.findAll", query="SELECT p FROM ProductDetail p")
public class ProductDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="productdetails_id")
	private int productdetailsId;

	@Temporal(TemporalType.DATE)
	@Column(name="product_date")
	private Date productDate;

	@Column(name="product_description")
	private String productDescription;

	@Temporal(TemporalType.DATE)
	@Column(name="product_expiry_date")
	private Date productExpiryDate;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_price")
	private float productPrice;

	@Column(name="product_weight")
	private int productWeight;

	@Column(name="units_in_stock")
	private int unitsInStock;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public ProductDetail() {
	}

	public int getProductdetailsId() {
		return this.productdetailsId;
	}

	public void setProductdetailsId(int productdetailsId) {
		this.productdetailsId = productdetailsId;
	}

	public Date getProductDate() {
		return this.productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Date getProductExpiryDate() {
		return this.productExpiryDate;
	}

	public void setProductExpiryDate(Date productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
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

	public int getProductWeight() {
		return this.productWeight;
	}

	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}

	public int getUnitsInStock() {
		return this.unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}