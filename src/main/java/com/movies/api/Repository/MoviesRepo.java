package com.movies.api.Repository;

import com.movies.api.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoviesRepo extends MongoRepository<Movies, String> {

    //Optional<Movies> findByimdb_id(String imdb_id);

    Optional<Movies> findBytitle(String title);

    @Query("{'imdb_id':?0}")
Optional<Movies> findByimdb_id(String imdb_id);

}
