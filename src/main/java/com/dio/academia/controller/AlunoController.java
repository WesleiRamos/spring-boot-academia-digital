package com.dio.academia.controller;

import com.dio.academia.entity.Aluno;
import com.dio.academia.entity.AvaliacaoFisica;
import com.dio.academia.entity.form.AlunoForm;
import com.dio.academia.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll(null);
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacoesFisica(@PathVariable Long id) {
        return service.getAllAvaliacoes(id);
    }

    @GetMapping(params = "dataNascimento")
    public List<Aluno> getAll(@RequestParam(value = "dataNascimento", required = false) String dataNascimento) {
        return service.getAll(dataNascimento);
    }
}
