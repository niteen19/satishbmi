package com.movies.api.Controller;

import com.movies.api.Model.About;
import com.movies.api.Repository.AboutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AboutController {
    @Autowired
    private AboutRepo aboutRepo;

    @GetMapping("/movies/about")
    public List<About> getdata() {
        return aboutRepo.findAll();

    }

    @GetMapping("/movies/about/{actors}")
    public List<About> getactors(@PathVariable String actors) {
        return aboutRepo.findAboutByactors(actors);

    }

}
