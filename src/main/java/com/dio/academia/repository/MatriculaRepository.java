package com.dio.academia.repository;

import com.dio.academia.entity.Matricula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    /**
     * @param bairro bairro para pesquisa
     * @return lista de alunos matriculados que residem no bairro informado
     */
    @Query(value = "SELECT * FROM matriculas AS M " +
                   "INNER JOIN alunos AS A ON A.id = M.aluno_id " +
                   "WHERE A.bairro = :bairro", nativeQuery = true)
    List<Matricula> findAlunosMatriculadosBairro(String bairro);
}
