package com.mongosoham.awsreviewsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongosoham.awsreviewsystem.models.Review;
import com.mongosoham.awsreviewsystem.services.ReviewServices;

@RestController
public class ReviewController {
	
	@Autowired
	private ReviewServices reviewServ;
	
	@GetMapping("/allreviews")
	public List<Review> getAll()
	{
		return reviewServ.getAllReviews();
	}
	
	
	@PostMapping("/add")
	public Review newReview(@RequestBody Review obj)
	{
		return reviewServ.addNewReview(obj);
	}

}
