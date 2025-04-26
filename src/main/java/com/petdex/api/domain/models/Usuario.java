package com.petdex.api.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;
}
