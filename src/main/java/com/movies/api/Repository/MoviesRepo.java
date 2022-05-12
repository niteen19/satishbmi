package com.movies.api.Repository;

import com.movies.api.Model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ExecutableAggregationOperation;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.sun.xml.internal.ws.api.client.ServiceInterceptor.aggregate;

@Repository
public interface MoviesRepo extends MongoRepository<Movies, String> {
    public Optional<Movies> findBytitle(String title);



}
