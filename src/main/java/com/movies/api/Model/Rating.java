package com.movies.api.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "rating")
public class Rating {
    private String _id;
    private String imdb_id;
    private String imdb_rating;
    private String imdb_votes;

}
