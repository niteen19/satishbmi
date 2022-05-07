package com.movies.api.Repository;

import org.springframework.data.mongodb.repository.Meta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaRepo extends MongoRepository<Meta, String> {
}
