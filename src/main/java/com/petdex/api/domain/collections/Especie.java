package com.petdex.api.domain.collections;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "especies")
public class Especie {
    @Id
    private Raca id;
    @NotBlank(message = "Nome não pode ser nulo ou vazio")
    private Raca nome;

    public Especie() {
    }

    public Especie(Raca nome) {
        this.nome = nome;
    }

    public Especie(Raca id, Raca nome) {
        this.id = id;
        this.nome = nome;
    }

    public Raca getId() {
        return id;
    }

    public void setId(Raca id) {
        this.id = id;
    }

    public Raca getNome() {
        return nome;
    }

    public void setNome(Raca nome) {
        this.nome = nome;
    }
}
