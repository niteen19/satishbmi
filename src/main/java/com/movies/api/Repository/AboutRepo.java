package com.movies.api.Repository;

import com.movies.api.Model.About;
import org.bson.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.sun.xml.internal.ws.api.client.ServiceInterceptor.aggregate;

@Repository
public interface AboutRepo extends MongoRepository<About, String> {
    @Query("{ 'actors':{'$regex':?0}}")
    List<About> findAboutByactors(String actors);

    @Query("aggregate([{$lookup:{ from:'movies',localField:'imdb_id',foreignField:'imdb_id',as:'post'}}])")
    Optional<Document> findActorsByMovie();


}
