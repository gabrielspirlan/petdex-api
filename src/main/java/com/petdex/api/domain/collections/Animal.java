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
    private String id;

    @NotBlank(message = "Nome não pode ser nulo ou vazio")
    private String nome;
    @NotBlank(message = "Data de nascimento não pode ser nulo ou vazio")
    private Date dataNascimento;
    @Pattern(regexp = "M|F", message = "O sexo deve ser M (MACHO) ou F (FÊMEA)")
    @NotBlank(message = "Sexo não pode ser nulo ou vazio")
    private String sexo;
    @NotBlank(message = "Peso não pode ser nulo ou vazio")
    @Positive(message = "Peso deve ser um número positivo e maior que zero")
    private Float peso;
    @NotBlank(message = "Castrado não pode ser nulo ou vazio")
    private Boolean castrado;
    @NotBlank(message = "usuarioId não pode ser nulo ou vazio")
    private String usuarioId;
    @NotBlank(message = "Raca não pode ser nulo ou vazio")
    private Raca raca;
}
