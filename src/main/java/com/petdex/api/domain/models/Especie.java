package com.petdex.api.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "especies")
public class Especie {
    @Id
    private String id;
    private String nome;
}
