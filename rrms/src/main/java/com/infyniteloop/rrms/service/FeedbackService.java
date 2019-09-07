package com.infyniteloop.rrms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infyniteloop.rrms.model.Feedback;
import com.infyniteloop.rrms.repository.FeedbackRepository;

@Service
public class FeedbackService {
	
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	
	public List<Feedback> getAllFeedback()
	{
		List<Feedback> feedback = new ArrayList<>();
		
		feedbackRepository.findAll().forEach(feedback::add);
		return feedback;
	}
	
	
	public Feedback getFeedback(String id)
	{
		return feedbackRepository.findById(id).get();
	}
	
	public void addFeedback(Feedback Feedback)
	{
		feedbackRepository.save(Feedback);
	}
	
	
	public void updateFeedback(Feedback Feedback)
	{
		feedbackRepository.save(Feedback);
	}
	
	
	public void deleteFeedback(String id)
	{
		feedbackRepository.deleteById(id);
	}


}
