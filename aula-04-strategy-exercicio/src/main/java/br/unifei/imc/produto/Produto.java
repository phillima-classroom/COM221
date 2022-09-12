package br.unifei.imc.produto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {

    private String nome;
    private double preco;

}
