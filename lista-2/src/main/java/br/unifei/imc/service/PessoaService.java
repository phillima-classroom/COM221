package br.unifei.imc.service;

import br.unifei.imc.exceptions.OpcaoErradaException;
import br.unifei.imc.gerador.GeradorArquivo;
import br.unifei.imc.gerador.GeradorCSV;
import br.unifei.imc.gerador.GeradorJSON;
import br.unifei.imc.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private GeradorArquivo gerador;
    private List<Pessoa> pessoas;

    void gerarMapaPessoa(){
        pessoas.add(new Pessoa(1,"Guts",39));
        pessoas.add(new Pessoa(2,"Casca",30));
        pessoas.add(new Pessoa(3,"Andreas",60));
    }

    public void gerarArquivo(OpcaoArquivo op){
        pessoas = new ArrayList<>();
        gerarMapaPessoa();
        if(op== OpcaoArquivo.CSV){
            gerador = new GeradorCSV();
            gerador.gerarArquivo(pessoas);
        } else if(op == OpcaoArquivo.JSON){
            gerador = new GeradorJSON();
            gerador.gerarArquivo(pessoas);
        } else{
            throw new OpcaoErradaException("Opção Incorreta Para Geração de Arquivo");
        }
    }
}