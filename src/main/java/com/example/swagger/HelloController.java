package com.example.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static java.util.Objects.requireNonNullElse;

@RestController
public class HelloController {

    @GetMapping("/hello/get")
    public Mono<String> getHello() {
        return Mono.just("Getting back..");
    }

    @PostMapping("/hello/post")
    public Mono<String> postHello() {
        return Mono.just("Posting back..");
    }

    @GetMapping("/person")
    public Mono<Person> getPerson(String name, Integer age) {
        var personName = requireNonNullElse(name, "Anonymous");
        var personAge = requireNonNullElse(age, 21);
        var person = new Person(personName, personAge);

        return Mono.just(person);
    }
}
