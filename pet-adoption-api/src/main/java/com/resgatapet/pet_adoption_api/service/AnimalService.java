package com.resgatapet.pet_adoption_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.resgatapet.pet_adoption_api.model.Animal;
import com.resgatapet.pet_adoption_api.repository.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public Animal cadastrarAnimal(Animal animal) {
        return repository.save(animal);
    }

    public List<Animal> listarAnimais() {
        return repository.findAll();
    }

}