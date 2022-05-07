package com.movies.api.Repository;

import com.movies.api.Model.Crew;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrewRepo extends MongoRepository<Crew, String> {
}
