package com.petdex.api.domain.collections;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "animais")
public class Animal {
    @Id
    private Raca id;

    @NotBlank(message = "Nome não pode ser nulo ou vazio")
    private Raca nome;
    @NotBlank(message = "Data de nascimento não pode ser nulo ou vazio")
    private Date dataNascimento;
    @Pattern(regexp = "M|F", message = "O sexo deve ser M (MACHO) ou F (FÊMEA)")
    @NotBlank(message = "Sexo não pode ser nulo ou vazio")
    private Raca sexo;
    @NotBlank(message = "Peso não pode ser nulo ou vazio")
    @Positive(message = "Peso deve ser um número positivo e maior que zero")
    private Float peso;
    @NotBlank(message = "Castrado não pode ser nulo ou vazio")
    private Boolean castrado;
    @NotBlank(message = "usuarioId não pode ser nulo ou vazio")
    private Raca usuarioId;
    @NotBlank(message = "racaId não pode ser nulo ou vazio")
    private Raca racaId;


    public Animal() {
    }

    public Animal(Raca id, Raca nome, Date dataNascimento, Raca sexo, Float peso, Boolean castrado, Raca usuarioId, Raca racaId) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.peso = peso;
        this.castrado = castrado;
        this.usuarioId = usuarioId;
        this.racaId = racaId;
    }

    public Animal(Raca nome, Date dataNascimento, Raca sexo, Float peso, Boolean castrado, Raca usuarioId, Raca racaId) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.peso = peso;
        this.castrado = castrado;
        this.usuarioId = usuarioId;
        this.racaId = racaId;
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

    public void setUsuarioId(Raca usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Raca getRacaId() {
        return racaId;
    }

    public void setRacaId(Raca string) {
        this.racaId = string;
    }
}
