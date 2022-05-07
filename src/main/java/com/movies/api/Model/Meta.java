package com.movies.api.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "meta")
public class Meta {
    private String _id;
    private String imdb_id;
    private String title;
    private String original_title;
    private String is_adult;
    private String year_of_release;
    private String runtime;
    private String genres;
}
