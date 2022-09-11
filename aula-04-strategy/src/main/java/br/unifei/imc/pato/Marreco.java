package br.unifei.imc.pato;

import br.unifei.imc.quack.QuackPadrao;
import br.unifei.imc.voar.VoarComAsas;

public class Marreco extends Pato {
    @Override
    public void mostrar() {
        System.out.println("Eu sou o marreco!");
    }

    public Marreco(){
        this.voar = new VoarComAsas();
        this.quack = new QuackPadrao();
    }

}