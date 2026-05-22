package com.resgatapet.pet_adoption_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.resgatapet.pet_adoption_api.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
