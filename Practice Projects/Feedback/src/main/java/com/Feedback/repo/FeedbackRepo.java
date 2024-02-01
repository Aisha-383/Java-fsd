package com.Feedback.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Feedback.entity.Feedback;

public interface FeedbackRepo extends CrudRepository<Feedback, Long> {
	  List<Feedback> findByUserName(String userName);
}

