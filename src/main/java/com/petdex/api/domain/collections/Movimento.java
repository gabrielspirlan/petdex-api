package com.petdex.api.domain.collections;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "movimentos")
public class Movimento {
    @Id
    private String id;

    @NotBlank(message = "Data não pode ser nulo ou vazio")
    private Date date;

    @NotBlank(message = "acelerometroX não pode ser nulo ou vazio")
    private Double acelerometroX;

    @NotBlank(message = "acelerometroY não pode ser nulo ou vazio")
    private Double acelerometroY;

    @NotBlank(message = "acelerometroZ não pode ser nulo ou vazio")
    private Double acelerometroZ;

    @NotBlank(message = "giroscopioX não pode ser nulo ou vazio")
    private Double giroscopioX;

    @NotBlank(message = "giroscopioY não pode ser nulo ou vazio")
    private Double giroscopioY;

    @NotBlank(message = "giroscopioZ não pode ser nulo ou vazio")
    private Double giroscopioZ;

    @NotBlank(message = "animalId não pode ser nulo ou vazio")
    private String animalId;

    @NotBlank(message = "coleiraId não pode ser nulo ou vazio")
    private String coleiraId;

}
