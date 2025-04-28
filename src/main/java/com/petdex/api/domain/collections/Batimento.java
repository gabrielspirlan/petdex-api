package com.petdex.api.domain.collections;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "batimentos")
public class Batimento {
    @Id
    private String id;

    @NotBlank(message = "Data não pode ser nulo ou vazio")
    private Date data;

    @PositiveOrZero(message = "Frequência deve ser um número positivo")
    @NotBlank(message = "Frequência Média não pode ser nulo ou vazio")
    private Integer frequenciaMedia;

    @NotBlank(message = "animalId não pode ser nulo ou vazio")
    private String animalId;

    @NotBlank(message = "coleiraId não pode ser nulo ou vazio")
    private String coleiraId;
}
