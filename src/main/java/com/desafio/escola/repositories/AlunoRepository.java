package com.desafio.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.escola.models.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{
    
}
