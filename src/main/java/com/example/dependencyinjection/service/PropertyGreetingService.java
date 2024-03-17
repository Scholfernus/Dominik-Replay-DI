package com.example.dependencyinjection.service;

import com.example.dependencyinjection.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Hello from fieldGreeting";
    }
}
