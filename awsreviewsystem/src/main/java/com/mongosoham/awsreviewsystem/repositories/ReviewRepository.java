package com.mongosoham.awsreviewsystem.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongosoham.awsreviewsystem.models.Review;

public interface ReviewRepository extends MongoRepository<Review, String> {

}
