package br.unifei.imc.display;

import br.unifei.imc.clima.ClimaDados;
import br.unifei.imc.observer.Observador;
import br.unifei.imc.observer.Observavel;

public class CondicoesCorrente implements Display, Observador {

    private double temp, umidade,pressao;
    private Observavel climaDados;

    public CondicoesCorrente(Observavel climaDados){
        this.climaDados = climaDados;
        climaDados.registrar(this);
    }

    @Override
    public void display() {
        System.out.println("Condições Climáticas: ");
        System.out.println("Temperatura: " + temp);
        System.out.println("Umidade: " + umidade);
        System.out.println("Pressao: " + pressao);
    }


    @Override
    public void atualiza(double temp, double pressao, double umidade) {
        this.temp = temp;
        this.umidade = umidade;
        this.pressao = pressao;
        display();
    }
}
