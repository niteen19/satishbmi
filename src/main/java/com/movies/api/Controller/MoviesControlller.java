package com.movies.api.Controller;

import com.movies.api.Model.Movies;
import com.movies.api.Repository.AboutRepo;
import com.movies.api.Repository.MoviesRepo;
import com.movies.api.Service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ExecutableAggregationOperation;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController

public class MoviesControlller {
    @Autowired
    private MoviesRepo moviesRepo;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private AboutRepo aboutRepo;
    @Autowired
    MoviesService moviesService;

    @GetMapping("/movies/{title}")
    public java.util.Optional<Movies> getMovies(@PathVariable("title") String title) {
        java.util.Optional<Movies> m = moviesRepo.findBytitle(title);
        return m;
    }

    @GetMapping("/movies/imdb/{imdb_id}")
    public java.util.Optional<Movies> getMoviesByImdb_id(@PathVariable("imdb_id") String imdb_id) {
        java.util.Optional<Movies> m = moviesRepo.findByimdb_id(imdb_id);
        return m;
    }

    @GetMapping("/movies/getStory/{movie_name}")
    public String getImdb_id(@PathVariable("movie_name") String movie_name) {
        String str = moviesService.getStory(movie_name);
        return aboutRepo.findAboutByImdb_id(str).get().getStory();
    }

}

