package com.uusmonov.challenge.service;

import com.uusmonov.challenge.model.GatheredResponse;
import com.uusmonov.challenge.model.posts.Posts;
import com.uusmonov.challenge.model.users.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {
    private final WebClient usersWebClient;
    private final WebClient postsWebClient;

    public Mono<GatheredResponse> fetchData(int userId) {
        Mono<Users> usersMono = usersWebClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/{id}")
                        .build(userId))
                .retrieve()
                .bodyToMono(Users.class);

        Mono<Posts[]> postsMono = postsWebClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("userId", userId)
                        .build())
                .retrieve()
                .bodyToMono(Posts[].class);

        return usersMono
                .zipWith(postsMono)
                .map(tuple ->
                        new GatheredResponse(tuple.getT1(), tuple.getT2())
                );
    }
}
