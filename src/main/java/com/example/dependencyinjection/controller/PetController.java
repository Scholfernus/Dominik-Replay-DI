package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.repository.PetRepository;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetRepository petRepository;


    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
public String check(){
        return petRepository.checkPet();
}
}
