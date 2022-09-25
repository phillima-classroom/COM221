package br.unifei.imc.ordenacao;

import java.util.List;

public class BubbleSort implements Ordenacao{
    @Override
    public void ordenar(double[] notas) {

        double aux, fim = notas.length;
        boolean continua = false;
        do {
            continua = false;
            for(int i = 0; i < fim-1; i++) {
                if(notas[i] > notas[i+1]){
                    aux = notas[i];
                    notas[i] = notas[i+1];
                    notas[i+1] = aux;
                    continua = true;
                }
            }
            fim--;
        }while(continua != false);
    }
}