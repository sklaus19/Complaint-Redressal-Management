package com.complaint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complaint.entity.Customer;
import com.complaint.entity.User;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByUser(User user);

}
