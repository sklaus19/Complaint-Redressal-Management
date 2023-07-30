package com.complaint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complaint.entity.Engineer;
import com.complaint.entity.User;



public interface EngineerRepository extends JpaRepository<Engineer, Long>{

	List<Engineer> findByUser(User user);
	List<Engineer> findByZipcode(String zipcode);
}