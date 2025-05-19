package com.petdex.api.domain.contracts.dto.raca;

import com.petdex.api.domain.collections.Especie;

public class RacaResDTO {

    private String id;
    private String nome;
    private Especie especie;

    public RacaResDTO() {
    }

    public RacaResDTO(Especie especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    public RacaResDTO(Especie especie, String nome, String id) {
        this.especie = especie;
        this.nome = nome;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
