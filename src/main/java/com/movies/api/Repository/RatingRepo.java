package com.movies.api.Repository;

import com.movies.api.Model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends MongoRepository<Rating, String> {
}
