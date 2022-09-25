package br.unifei.imc.biblioteca;

import br.unifei.imc.ordenacao.BubbleSort;
import br.unifei.imc.ordenacao.Ordenacao;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class BibliotecaService {

    @Getter @Setter
    Ordenacao ordenacao;

    public BibliotecaService(){
        this.ordenacao = new BubbleSort();
    }

    public void apresentarNotasOrdenadas(double[] notasAlunos){
        ordenacao.ordenar(notasAlunos);
        for(double notas : notasAlunos){
            System.out.println(notas);
        }
    }
}