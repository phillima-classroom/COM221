package br.unifei.imc.app.pojo;

import br.unifei.imc.framework.anotacoes.Ignorar;
import br.unifei.imc.framework.anotacoes.Nome;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardGame {

    private String nome;
    @Nome("Quantidade de Jogadores")
    private int qtdPlayers;
    @Ignorar
    private double preco;

}