package com.petdex.api.domain.collections;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;

    @NotBlank(message = "nome não pode ser nulo ou vazio")
    private String nome;

    @Indexed(unique = true)
    @NotBlank(message = "cpf não pode ser nulo ou vazio")
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "O CPF deve estar no formato 000.000.000-00")
    private String cpf;

    @Pattern(regexp = "^\\(\\d{2}\\) \\d{5}-\\d{4}$", message = "O número de telefone deve estar no formato (00) 00000-0000")
    @NotBlank(message = "telefone não pode ser nulo ou vazio")
    private String whatsApp;

    @Indexed(unique = true)
    @Email(message = "O e-mail deve ser válido")
    @NotBlank(message = "email não pode ser nulo ou vazio")
    private String email;

    @NotBlank(message = "senha não pode ser nulo ou vazio")
    private String senha;
}
