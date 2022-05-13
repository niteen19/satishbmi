package com.movies.api.Controller;

import com.movies.api.Model.Movies;
import com.movies.api.Repository.AboutRepo;
import com.movies.api.Repository.MetaRepo;
import com.movies.api.Repository.MoviesRepo;
import com.movies.api.Service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class MoviesControlller {
    @Autowired
    private MoviesRepo moviesRepo;
    @Autowired
    private AboutRepo aboutRepo;
    @Autowired
    private MetaRepo metaRepo;
    @Autowired
    private MoviesService moviesService;

    @GetMapping("/movies/{title}")
    public Optional<Movies> getMovies(@PathVariable("title") String title) {
        Optional<Movies> m = moviesRepo.findBytitle(title);
        return m;
    }

    @GetMapping("/movies/imdb/{imdb_id}")
    public Optional<Movies> getMoviesByImdb_id(@PathVariable("imdb_id") String imdb_id) {
        Optional<Movies> m = moviesService.findByimdb_id(imdb_id);
        return m;
    }

    @GetMapping("/movies/getStory/{movie_name}")
    public String getStoryByTitle(@PathVariable("movie_name") String movie_name) {
        String str = moviesService.getImdb_Id(movie_name);
        return aboutRepo.findAboutByImdb_id(str).get().getStory();
    }
   @GetMapping("/movies/findActors/{Movie_name}")
   public String getActorsByMovie(@PathVariable("Movie_name") String Movie_name){
       String str = moviesService.getImdb_Id(Movie_name);
       return aboutRepo.findAboutByImdb_id(str).get().getActors();
   }
   @GetMapping("/movies/getGenre/{movie_name}")
    public  String getGenre(@PathVariable("movie_name") String movie_name){
       String str = moviesService.getImdb_Id(movie_name);
       if(str != null){
       return metaRepo.findByImdb_Id(str).get().getGenres();}
       else return  "Wrong Input";

   }
}

 