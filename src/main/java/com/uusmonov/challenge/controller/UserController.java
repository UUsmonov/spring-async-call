package com.uusmonov.challenge.controller;

import com.uusmonov.challenge.model.GatheredResponse;
import com.uusmonov.challenge.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;


    @GetMapping("/v1/{userId}")
    public Mono<GatheredResponse> getPostsOfUser(@Validated @PathVariable("userId") int userId) {
        return userService.fetchData(userId);
    }
}
