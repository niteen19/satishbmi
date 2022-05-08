package com.movies.api.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "about")
public class About {
    private String _id;
    private String imdb_id;
    private String story;

    private String summary;
    @Field("actors")
    private String actors;
    private String wins_nominations;
    private String release_date;
}
