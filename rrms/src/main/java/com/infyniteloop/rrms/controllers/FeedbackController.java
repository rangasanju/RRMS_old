package com.infyniteloop.rrms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infyniteloop.rrms.model.Feedback;
import com.infyniteloop.rrms.service.FeedbackService;

@RequestMapping("/data")
@RestController
@CrossOrigin 
public class FeedbackController {
	
	
	@Autowired
	private FeedbackService feedbackService;

	
	// Get all Feedback
		@RequestMapping("/feedback/all")
		public List<Feedback> getAllFeedback() {
			return feedbackService.getAllFeedback();
		}
		
		
	// Get a single Feedback
	@RequestMapping("/feedback/{id}")
	public Feedback getFeedback(@PathVariable String id) {
		return feedbackService.getFeedback(id);
	}
	
	// Add anew Feedback
	@RequestMapping(method=RequestMethod.POST, value="/feedback")
	public void addFeedback(@RequestBody Feedback feedback) {
		
		System.out.println("Calling POST ...." + feedback);
		feedbackService.addFeedback(feedback);
	}
	
	// Update Feedback
	@RequestMapping(method=RequestMethod.PUT, value="/feedback")
	public void updateFeedback(@RequestBody Feedback feedback) {
		feedbackService.updateFeedback(feedback);
	}
	
	// Delete a Feedback
	@RequestMapping(method=RequestMethod.DELETE, value="/feedback/{id}")
	public void deleteFeedback(@PathVariable String id) {
		feedbackService.deleteFeedback(id);
	}



}
