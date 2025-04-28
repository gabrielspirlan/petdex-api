package com.petdex.api.domain.collections;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coleiras")
public class Coleira {
    @Id
    private String id;
    @NotBlank(message = "Descrição não pode ser nulo ou vazio")
    private String descricao;
    @NotBlank(message = "animalId não pode ser nulo ou vazio")
    private String animalId;
}
