package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyGreetingController {
    @Autowired
    @Qualifier("propertyGreetingService")
    private GreetingRepository greetingRepository;

    public String getGreeting() {
        return greetingRepository.sayGreeting();
    }
}
