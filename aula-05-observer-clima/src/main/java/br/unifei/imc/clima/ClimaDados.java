package br.unifei.imc.clima;

import br.unifei.imc.observer.Observador;
import br.unifei.imc.observer.Observavel;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ClimaDados implements Observavel {

    private double temp,umidade,pressao;
    private List<Observador> observadores;

    public ClimaDados(){
        observadores = new ArrayList<>();
    }

    @Override
    public void registrar(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void cancelarRegistro(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificaAssinantes() {
        observadores.forEach(obs -> obs.atualiza(temp,pressao,umidade));
    }

    public void setMudancas(double temp, double pressao, double umidade){
        this.temp = temp;
        this.pressao = pressao;
        this.umidade = umidade;
        notificaAssinantes();
    }
}