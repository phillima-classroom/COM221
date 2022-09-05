package br.unifei.imc.pilha;

import br.unifei.imc.pilha.exception.PilhaVaziaException;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class Pilha<T> {

    private List<T> elementos;
    @Getter
    private Integer qtdElementos;

    public Pilha(){
        elementos = new ArrayList<>();
        this.qtdElementos = 0;
    }

    public boolean isVazia(){
        return qtdElementos==0;
    }

    public void pushElemento(T elemento){
        elementos.add(elemento);
        qtdElementos++;
    }

    public T popElemento(){
        if(!isVazia()){
            T elemento = elementos.remove(qtdElementos-1);
            qtdElementos--;
            return elemento;
        }
        throw new PilhaVaziaException();
    }

    public T mostraTopo(){
        if(!isVazia()){
            T elemento = elementos.get(qtdElementos-1);
            return elemento;
        }else{
            throw new PilhaVaziaException();
        }
    }

}
