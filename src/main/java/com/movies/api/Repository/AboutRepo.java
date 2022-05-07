package com.movies.api.Repository;

import com.movies.api.Model.About;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepo extends MongoRepository<About,String> {
}
