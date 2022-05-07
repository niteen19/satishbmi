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

@Document(collection = "crew")
public class Crew {
    private String _id;
    private String imdb_id;
    private String directors;
    private String writers;

}
