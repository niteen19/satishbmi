package com.movies.api.Controller;

import com.movies.api.Model.Rating;
import com.movies.api.Repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    private RatingRepo ratingRepo;

    @GetMapping("/movies/rating")
    public List<Rating> getRating() {
        return ratingRepo.findAll();
    }
}
