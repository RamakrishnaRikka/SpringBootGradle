package com.smartstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartstore.entity.ContactUs;
import com.smartstore.entity.User;

public interface ContactUsRepository extends JpaRepository<ContactUs, Integer> {

	@Query(value = "Select id, name from User Where name = :name")
	List<Object> findByName(@Param("name") String name);

}
