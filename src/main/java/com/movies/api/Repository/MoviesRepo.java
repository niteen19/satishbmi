package com.movies.api.Repository;

import com.movies.api.Model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ExecutableAggregationOperation;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoviesRepo extends MongoRepository<Movies, String> {
 @Autowired
     public MongoTemplate mt = null;

    Optional<Movies> findBytitle(String title);

    @Query("{'imdb_id':?0}")
    Optional<Movies> findByimdb_id(String imdb_id);


}
