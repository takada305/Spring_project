package com.example.demo.animalsAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.repository.AnimalRepository;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<AnimalData> getAllAnimals() {
        return animalRepository.getAnimals();
    }

    public AnimalData getAnimalById(int id) {
        return animalRepository.getAnimalById(id);
    }
}
