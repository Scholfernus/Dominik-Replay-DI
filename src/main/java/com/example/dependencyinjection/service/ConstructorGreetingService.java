package com.example.dependencyinjection.service;

import com.example.dependencyinjection.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

//@Primary
public class ConstructorGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Hello from constructorGreeting";
    }
}
