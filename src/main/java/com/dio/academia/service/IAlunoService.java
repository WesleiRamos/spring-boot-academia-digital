package com.dio.academia.service;

import com.dio.academia.entity.Aluno;
import com.dio.academia.entity.AvaliacaoFisica;
import com.dio.academia.entity.form.AlunoForm;

import java.util.List;

public interface IAlunoService {
    /**
     * Cria um aluno a partir de um formulário e sala no banco.
     * @param form formulário com os dados do aluno.
     * @return Aluno recém-criado.
     */
    Aluno create(AlunoForm form);

    /**
     * Busca um aluno a partir do seu id.
     * @param id id do aluno.
     * @return Aluno encontrado.
     */
    Aluno get(Long id);

    /**
     * Retorna a lista de alunos cadastrados.
     * @return Aluno encontrado.
     */
    List<Aluno> getAll(String dataNacimento);

    /**
     * Atualiza um aluno a partir de um formulário e sala no banco.
     * @param id id do aluno.
     * @param form formulário com os dados do aluno.
     * @return Aluno recém-atualizado.
     */
    Aluno update(Long id, AlunoForm form);

    /**
     * Remove um aluno a partir do seu id.
     * @param id id do aluno.
     */
    void delete(Long id);

    /**
     * Retorna todas as avaliações com base em um id
     * @return Aluno encontrado.
     */
    List<AvaliacaoFisica> getAllAvaliacoes(Long id);
}
