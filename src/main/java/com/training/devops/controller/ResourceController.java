package com.training.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ResourceController {

    @GetMapping("/api")
    public Mono<String> getMonoResult() {
        return Mono.just("Hello, EveryOne God is with us");
    }


}
