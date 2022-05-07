package com.movies.api.Controller;

import com.movies.api.Model.About;
import com.movies.api.Repository.AboutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AboutController {
    @Autowired
    private AboutRepo aboutRepo;

    @GetMapping("/movies/about")
    public List<About> getdata() {
        return aboutRepo.findAll();

    }

}
