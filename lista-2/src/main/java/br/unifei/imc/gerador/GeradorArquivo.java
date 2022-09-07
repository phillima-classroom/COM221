package br.unifei.imc.gerador;

import br.unifei.imc.model.Pessoa;

import java.util.List;

public interface GeradorArquivo {

    void gerarArquivo(List<Pessoa> pessoas);

}
