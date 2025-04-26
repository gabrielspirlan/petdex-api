package com.petdex.api.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "animais")
public class Animal {
    @Id
    private String id;
    private String nome;
    private Date dataNascimento;
    private String sexo;
    private Float peso;
    private Boolean castrado;
}
