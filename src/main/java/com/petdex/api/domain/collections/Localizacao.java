package com.petdex.api.domain.collections;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "localizacoes")
public class Localizacao {
    @Id
    private String id;

    @NotBlank(message = "Data não pode ser nulo ou vazio")
    private Date data;

    @NotBlank(message = "Latitude não pode ser nulo ou vazio")
    private Double latitude;

    @NotBlank(message = "Longitude não pode ser nulo ou vazio")
    private Double longitude;

    @NotBlank(message = "animalId não pode ser nulo ou vazio")
    private String animalId;

    @NotBlank(message = "coleiraId não pode ser nulo ou vazio")
    private String coleiraId;
}
