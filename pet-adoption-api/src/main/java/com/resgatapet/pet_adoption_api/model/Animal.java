package com.resgatapet.pet_adoption_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Animal {
    private Long id;
    private String nome;
    private Integer idade;
    private String especie;
    private String porte;
    private String descricao;
    private Boolean adotado;

}
