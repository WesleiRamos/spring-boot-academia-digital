package com.dio.academia.service.impl;

import com.dio.academia.entity.Aluno;
import com.dio.academia.entity.AvaliacaoFisica;
import com.dio.academia.entity.form.AlunoForm;
import com.dio.academia.infra.utils.JavaTimeUtils;
import com.dio.academia.repository.AlunoRepository;
import com.dio.academia.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());
        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataNacimento) {
        if (dataNacimento == null) {
            return repository.findAll();
        } else {
            LocalDate data = LocalDate.parse(dataNacimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataNascimento(data);
        }
    }

    @Override
    public Aluno update(Long id, AlunoForm form) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacoes(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }
}
