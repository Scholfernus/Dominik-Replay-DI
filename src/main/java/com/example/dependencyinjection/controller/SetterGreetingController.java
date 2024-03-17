package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterGreetingController {
    private GreetingRepository greetingRepository;

    @Autowired

    public void setGreetingRepository(@Qualifier("setterGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
        return greetingRepository.sayGreeting();
    }
}
