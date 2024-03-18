package com.example.dependencyinjection.service;

import com.example.dependencyinjection.repository.PetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("pet")
@Profile("cat")
public class CatPetService implements PetRepository {
    @Override
    public String checkPet() {
        return "Cat";
    }
}
