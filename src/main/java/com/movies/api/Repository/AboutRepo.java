package com.movies.api.Repository;

import com.movies.api.Model.About;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AboutRepo extends MongoRepository<About, String> {
    @Query("{ 'actors':{'$regex':?0}}")
    List<About> findAboutByactors(String actors);


}
