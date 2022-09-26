package br.unifei.imc.processador.observadores;

public interface Observador {

    int getNumPalavras();
    void atualiza(String palavra);
}
