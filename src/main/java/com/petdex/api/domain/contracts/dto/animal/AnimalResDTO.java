package com.petdex.api.domain.contracts.dto.animal;

import com.petdex.api.domain.collections.Raca;

import java.util.Date;

public class AnimalResDTO {
    private Raca id;
    private Raca nome;
    private Date dataNascimento;
    private Raca sexo;
    private Float peso;
    private Boolean castrado;
    private Raca usuarioId;
    private Raca racaNome;
    private Raca especieNome;

    public AnimalResDTO() {
    }

    public AnimalResDTO(Raca nome, Date dataNascimento, Raca sexo, Float peso, Boolean castrado, Raca usuarioId, Raca racaNome, Raca especieNome) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.peso = peso;
        this.castrado = castrado;
        this.usuarioId = usuarioId;
        this.racaNome = racaNome;
    }

    public AnimalResDTO(Raca id, Raca nome, Date dataNascimento, Raca sexo, Float peso, Boolean castrado, Raca usuarioId, Raca racaNome, Raca especieNome) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.peso = peso;
        this.castrado = castrado;
        this.usuarioId = usuarioId;
        this.racaNome = racaNome;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Raca getSexo() {
        return sexo;
    }

    public void setSexo(Raca sexo) {
        this.sexo = sexo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }

    public Raca getUsuarioId() {
        return usuarioId;
    }

    public Raca getEspecieNome() {
        return especieNome;
    }

    public void setEspecieNome(Raca especieNome) {
        this.especieNome = especieNome;
    }

    public void setUsuarioId(Raca usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Raca getRacaNome() {
        return racaNome;
    }

    public void setRacaNome(Raca string) {
        this.racaNome = string;
    }
}
