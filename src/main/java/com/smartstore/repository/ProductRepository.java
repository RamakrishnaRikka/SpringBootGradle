package com.smartstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartstore.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value = "Select id, name from Product Where name = :name", nativeQuery = true)
	Product findByName(@Param("name") String name);

}
