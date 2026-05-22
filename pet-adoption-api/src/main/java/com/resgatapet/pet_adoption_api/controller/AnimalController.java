package com.resgatapet.pet_adoption_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.resgatapet.pet_adoption_api.model.Animal;
import com.resgatapet.pet_adoption_api.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService service;

    @PostMapping
    public Animal cadastrarAnimal(@RequestBody Animal animal) {
        return service.cadastrarAnimal(animal);
    }

    @GetMapping
    public List<Animal> listarAnimais() {
        return service.listarAnimais();
    }

}