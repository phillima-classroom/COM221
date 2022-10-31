package br.unifei.imc.asteroides;

import lombok.Getter;

@Getter
public abstract class Asteroide {

    protected String nome;
    protected String tipoDanoColisao;
    protected double peso,velocidade,vida;
    protected int multiplicadorTipo;
    public Asteroide(double dificuldade){
        defineMultiplicador();
        this.peso = dificuldade*multiplicadorTipo;
        this.velocidade = dificuldade*multiplicadorTipo;
        this.vida = dificuldade*multiplicadorTipo;
    }

    protected abstract void defineMultiplicador();

    public void inicializa(){
        System.out.println("Inicializando Asteroide: " + this.nome);
        System.out.println("Peso: " + this.peso);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Vida: " + this.vida);
        System.out.println("Dano ao colidir: " + this.tipoDanoColisao);
    }

}