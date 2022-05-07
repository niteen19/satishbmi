package com.movies.api.Repository;

import com.movies.api.Model.Writer_meta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Writer_metaRepo extends MongoRepository<Writer_meta, String> {
}
