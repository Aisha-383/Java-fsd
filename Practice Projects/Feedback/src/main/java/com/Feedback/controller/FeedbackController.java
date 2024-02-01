package com.Feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Feedback.entity.Feedback;
import com.Feedback.repo.FeedbackRepo;

@RestController
public class FeedbackController {

    @Autowired
    private FeedbackRepo feedbackRepository;

    
        
        @PostMapping("/feedback")
        public void addFeedback(@RequestBody Feedback feedback) {
            feedbackRepository.save(feedback);
        }

    }

