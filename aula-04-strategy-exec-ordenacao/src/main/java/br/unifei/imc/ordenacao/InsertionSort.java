package br.unifei.imc.ordenacao;

import java.util.List;

public class InsertionSort implements Ordenacao{
    @Override
    public void ordenar(double[] notas) {
        double atual;
        int j, tam = notas.length;
        for (int i = 1; i < tam; i++){
            atual = notas[i];
            for(j = i; (j > 0) && (atual < notas[j-1]); j--){
                notas[j] = notas[j-1];
            }
            notas[j] = atual;
        }
    }
}