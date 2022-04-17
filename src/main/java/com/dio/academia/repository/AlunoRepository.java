package com.dio.academia.repository;

import com.dio.academia.entity.Aluno;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    /**
     * @param dataNascimento data de nascimento dos alunos
     * @return lista com todos os alunos com a data de nascimento passada como parâmetro da função
     */
    List<Aluno> findByDataNascimento(LocalDate dataNascimento);
}
