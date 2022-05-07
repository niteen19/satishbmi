package com.movies.api.Controller;

import com.movies.api.Model.Crew_meta;
import com.movies.api.Repository.Crew_metaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Crew_metaController {
    @Autowired
    private Crew_metaRepo crew_metaRepo;

    @GetMapping("/movies/crew_meta")
    public List<Crew_meta> getData() {
        return crew_metaRepo.findAll();
    }
}
