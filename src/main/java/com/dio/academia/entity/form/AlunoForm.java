package com.dio.academia.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    @NotEmpty(message = "Preencha os campos corretamente")
    @Size(min = 3, max = 50, message = "'${validatedValue}' deve ter entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencha os campos corretamente")
    private String cpf;

    @NotEmpty(message = "Preencha os campos corretamente")
    @Size(min = 3, max = 50, message = "'${validatedValue}' deve ter entre {min} e {max} caracteres.")
    private String bairro;

    @NotNull(message = "Preencha os campos corretamente")
    @Past(message = "Data '${validatedValue}' é inválida.")
    private LocalDate dataNascimento;
}
