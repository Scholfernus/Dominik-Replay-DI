package com.example.dependencyinjection.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository {
    String checkPet();
}
