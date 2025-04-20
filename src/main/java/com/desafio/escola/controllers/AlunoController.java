package com.desafio.escola.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.escola.models.AlunoModel;
import com.desafio.escola.repositories.AlunoRepository;


@RestController
@RequestMapping
@CrossOrigin("*")

public class AlunoController {
    
    private AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<AlunoModel>> pegarTodosOsAlunos(){
        return new ResponseEntity<>(alunoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/criar")
    public ResponseEntity<AlunoModel> criarNovoAluno(@RequestBody AlunoModel criarAluno){
        criarAluno.setId(null);
        return new ResponseEntity<>(alunoRepository.save(criarAluno),HttpStatus.OK);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<AlunoModel> atualizarAluno(@RequestBody AlunoModel atualizarAluno){
        return new ResponseEntity<>(alunoRepository.save(atualizarAluno),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<AlunoModel> deletarAluno(@PathVariable Long id){
        alunoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
