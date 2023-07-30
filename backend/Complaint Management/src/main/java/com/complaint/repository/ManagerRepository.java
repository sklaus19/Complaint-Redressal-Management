package com.complaint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complaint.entity.Manager;
import com.complaint.entity.User;


public interface ManagerRepository extends JpaRepository<Manager, Long>{

	List<Manager> findByUser(User user);
}
