package com.desafio.escola.models;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "alunos")
public class AlunoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    @NotBlank(message = "Nome é obrigatório.")
    private String name;

    @Column(name = "sobrenome")
    @NotBlank(message = "Sobrenome é obrigatório.")
    private String lastName;

    @Column(name = "email")
    @NotBlank(message = "Email é obrigatório.")
    private String email;

    @Column(name = "cpf")
    @NotBlank(message = "CPF é obrigatório.")
    @CPF(message = "CPF inválido.")
    private String cpf;

    @Column(name = "rg")
    @NotBlank(message = "RG é obrigatório.")
    @Pattern(regexp = "^[0-9]{2}\\.?[0-9]{3}\\.?[0-9]{3}-?[0-9Xx]{1}$", message = "RG inválido")
    private String rg;
}
