package com.petdex.api.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coleiras")
public class Coleira {
    @Id
    private String id;
    private String descricao;
    private String animalId;
}
