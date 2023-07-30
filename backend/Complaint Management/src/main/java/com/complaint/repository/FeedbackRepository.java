package com.complaint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complaint.entity.Feedback;
import com.complaint.entity.Ticket;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

	
	List<Feedback> findByTicket(Ticket ticket);
	
}
