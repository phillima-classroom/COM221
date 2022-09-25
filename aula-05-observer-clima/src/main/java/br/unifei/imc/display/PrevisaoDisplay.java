package br.unifei.imc.display;

import br.unifei.imc.observer.Observador;
import br.unifei.imc.observer.Observavel;

public class PrevisaoDisplay implements Observador,Display {

    private double temperaturaAntiga;
    private double temperaturaAtual;
    private Observavel climaDados;


    public PrevisaoDisplay(Observavel climaDados, double tempReferencia) {
        this.climaDados = climaDados;
        this.temperaturaAtual = tempReferencia;
        climaDados.registrar(this);
    }

    @Override
    public void display() {
        System.out.println("Temperatura mudou de "
                + temperaturaAntiga + " para " + temperaturaAtual);
        System.out.print("Previsão: ");
        if (temperaturaAtual > temperaturaAntiga) {
            System.out.println("Pode esquentar. Fique em casa jogando");
        } else if (temperaturaAntiga == temperaturaAtual) {
            System.out.println("Sem novidades. Mais do mesmo!");
        } else if (temperaturaAtual < temperaturaAntiga) {
            System.out.println("Pode esfriar. Fique em casa montando puzzle!");
        }
    }

    @Override
    public void atualiza(double temp, double pressao, double umidade) {
        temperaturaAntiga = temperaturaAtual;
        temperaturaAtual = temp;
        display();
    }
}
