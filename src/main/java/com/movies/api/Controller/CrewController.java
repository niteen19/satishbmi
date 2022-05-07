package com.movies.api.Controller;

import com.movies.api.Model.Crew;
import com.movies.api.Repository.CrewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CrewController {
    @Autowired
    private CrewRepo crewRepo;

    @GetMapping("/movies/crew")
    public List<Crew> getCrewData() {
        return crewRepo.findAll();
    }
}
