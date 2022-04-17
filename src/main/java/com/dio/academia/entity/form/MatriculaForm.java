package com.dio.academia.entity.form;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {
    @NotNull(message = "Preencha os campos corretamente")
    @Positive(message = "O id do aluno deve ser positivo")
    private Long alunoId;
}
