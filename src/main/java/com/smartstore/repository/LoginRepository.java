package com.smartstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartstore.entity.Login;
import com.smartstore.entity.User;

public interface LoginRepository extends JpaRepository<User, Integer> {

	@Query(value = "Select id, name from Product Where name = :name", nativeQuery = true)
	Login findByName(@Param("name") String name);

	@Query(value = "Select id, name from User Where name = :name", nativeQuery = true)
	// Login findByNamePassword(@Param("name") String name,@Param("password")
	// String password);
	Login findByNamePassword(@Param("name") String name);
}
