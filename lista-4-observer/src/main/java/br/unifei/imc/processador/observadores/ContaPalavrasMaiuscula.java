package br.unifei.imc.processador.observadores;

public class ContaPalavrasMaiuscula implements Observador {

    private int numPalavras;

    @Override
    public int getNumPalavras() {
        return numPalavras;
    }

    @Override
    public void atualiza(String palavra) {
        if(Character.isUpperCase(palavra.charAt(0)))
            numPalavras++;
    }
}
