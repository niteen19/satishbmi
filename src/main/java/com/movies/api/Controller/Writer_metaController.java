package com.movies.api.Controller;

import com.movies.api.Model.Writer_meta;
import com.movies.api.Repository.Writer_metaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Writer_metaController {
    @Autowired
    private Writer_metaRepo writer_metaRepo;

    @GetMapping("/movies/writer_meta")
    public List<Writer_meta> getData() {
        return writer_metaRepo.findAll();
    }
}
