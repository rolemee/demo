package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
@RestController
public class HelloWebFluxController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, WebFlux !";
    }

    @GetMapping("/user")
    public Mono<User> getUser() {
        User user = new User();
        user.setName("rolemee");
        user.setDesc("asda");
        return Mono.just(user);
    }


}

