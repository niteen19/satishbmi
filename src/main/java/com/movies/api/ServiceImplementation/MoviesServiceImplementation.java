package com.movies.api.ServiceImplementation;

import com.movies.api.Model.Movies;
import com.movies.api.Repository.MoviesRepo;
import com.movies.api.Service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public  class MoviesServiceImplementation implements MoviesService {
    @Autowired
    private MoviesRepo moviesRepo;


    @Override
    public String getImdb_Id(String title) {
        return moviesRepo.findBytitle(title).get().getImdb_id();
    }

    @Override
    @Query("{'imdb_id':?0}")
    public  Optional<Movies> findByimdb_id(String imdb_id){
        return null;
    }
    ;


}
