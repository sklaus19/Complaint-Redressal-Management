package com.complaint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complaint.entity.User;



public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByEmail(String email);
}
