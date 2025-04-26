package com.petdex.api.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "localizacoes")
public class Localizacao {
    @Id
    private String id;
    private Date data;
    private Double latitude;
    private Double longitude;
    private String animalId;
    private String coleiraId;
}
