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

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

}
