package com.uusmonov.challenge.model;

import com.uusmonov.challenge.model.posts.Posts;
import com.uusmonov.challenge.model.users.Users;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GatheredResponse {
    private Users users;
    private Posts[ ] posts;
}
