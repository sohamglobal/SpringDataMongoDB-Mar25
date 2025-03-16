package com.mongosoham.awsreviewsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongosoham.awsreviewsystem.models.Review;
import com.mongosoham.awsreviewsystem.repositories.ReviewRepository;

@Service
public class ReviewServices {
	
	@Autowired
	private ReviewRepository reviewRepo;
	
	public List<Review> getAllReviews()
	{
		return reviewRepo.findAll();
	}
	
	public Review addNewReview(Review obj)
	{
		return reviewRepo.save(obj);
	}
	
	

}
