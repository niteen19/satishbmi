package com.movies.api.Service;

import com.movies.api.Model.Movies;
import com.movies.api.Repository.MoviesRepo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepo moviesRepo;

    public String getStory(String title) {
        return moviesRepo.findBytitle(title).get().getImdb_id();
    }


}
