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
@Document(collection = "crew_meta")
public class Crew_meta {
    private String _id;
    private String crew_id;
    private String name;
    private String born_year;
    private String death_year;
    private String profession;
    private String known_for;
}
