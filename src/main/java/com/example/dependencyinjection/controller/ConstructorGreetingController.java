package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorGreetingController {
    private final GreetingRepository greetingRepository;


    public ConstructorGreetingController(@Qualifier("constructorGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
        return greetingRepository.sayGreeting();
    }
}
