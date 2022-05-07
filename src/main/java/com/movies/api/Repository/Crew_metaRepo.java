package com.movies.api.Repository;

import com.movies.api.Model.Crew_meta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Crew_metaRepo extends MongoRepository<Crew_meta, String> {
}
