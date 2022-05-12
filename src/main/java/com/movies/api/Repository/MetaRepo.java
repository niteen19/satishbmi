package com.movies.api.Repository;


import com.movies.api.Model.Meta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MetaRepo extends MongoRepository<Meta, String> {
    @Query("{imdb_id:?0}")
    Optional<Meta> findByImdb_Id(String imdb_id);

}
