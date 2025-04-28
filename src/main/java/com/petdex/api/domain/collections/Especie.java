package com.petdex.api.domain.collections;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "especies")
public class Especie {
    @Id
    private String id;
    @NotBlank(message = "Nome não pode ser nulo ou vazio")
    private String nome;
}
