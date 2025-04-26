package com.petdex.api.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "racas")
public class Raca {

    @Id
    private String id;
    private String nome;
    private Especie especie;
}
