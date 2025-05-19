package com.petdex.api.domain.contracts.dto.raca;

import com.petdex.api.domain.collections.Especie;

public class RacaReqDTO {

    private String nome;
    private Especie especie;

    public RacaReqDTO() {
    }

    public RacaReqDTO(String nome, Especie especie) {
        this.nome = nome;
        this.especie = especie;
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
