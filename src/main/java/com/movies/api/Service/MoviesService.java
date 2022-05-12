package com.movies.api.Service;

import com.movies.api.Model.Movies;
import com.movies.api.Repository.MoviesRepo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface MoviesService {


    String getImdb_Id(String title);

    @Query("{imdb_id:?0}")
     Optional<Movies> findByimdb_id(String imdb_id);
}
