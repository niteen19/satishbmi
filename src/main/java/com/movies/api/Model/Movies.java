package com.movies.api.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movies")
public class Movies {
        @Id
        private String _id;
        @Field("title")
        private String title;
        @Field("imdb_id")
        private String imdb_id;
        private String poster_path;
        private String wiki_link;
}
