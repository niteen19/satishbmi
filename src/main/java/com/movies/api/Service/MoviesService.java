package com.movies.api.Service;

import com.movies.api.Model.Movies;
import com.movies.api.Repository.MoviesRepo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Optional;

public class MoviesService {
    @Autowired
    private MoviesRepo moviesRepo;


}
