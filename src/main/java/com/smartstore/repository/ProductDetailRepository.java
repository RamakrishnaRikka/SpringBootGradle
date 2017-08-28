package com.smartstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartstore.entity.Product;
import com.smartstore.entity.ProductDetail;
import com.smartstore.model.ProductModel;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {

	@Query(value = "Select new com.smartstore.model.ProductModel(pd.product.productId,pd.productName,pd.productPrice,pd.productWeight,pd.unitsInStock,pd.productDescription,pd.productExpiryDate,pd.product.picture) from ProductDetail pd Where pd.product.productId = :productId")
	List<ProductModel> getProductDetailById(@Param("productId") int productId);
	
}
