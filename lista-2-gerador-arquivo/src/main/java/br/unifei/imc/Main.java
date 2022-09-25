package br.unifei.imc;

import br.unifei.imc.service.OpcaoArquivo;
import br.unifei.imc.service.PessoaService;

public class Main {
    public static void main(String[] args) {

        PessoaService p = new PessoaService();
        p.gerarArquivo(OpcaoArquivo.CSV);
        p.gerarArquivo(OpcaoArquivo.JSON);

    }
}