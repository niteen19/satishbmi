package com.movies.api.Security;

import lombok.Data;

@Data
public class JwtAuthRequest {
    private String username;
    private String password;
}
