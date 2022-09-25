package br.unifei.imc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {
    private Integer id;
    protected String nome;
    private Integer idade;
}