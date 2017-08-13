package com.smartstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartstore.entity.User;


public interface RegistrationRepository extends JpaRepository<User, Integer> {

	@Query(value = "Select id, name from User Where name = :name", nativeQuery = true)
	User findByName(@Param("name") String name);

}
