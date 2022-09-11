package br.unifei.imc.pato;

import br.unifei.imc.quack.QuackBrincadeira;
import br.unifei.imc.voar.NaoSabeVoar;

public class PatoBorracha extends Pato{
    @Override
    public void mostrar() {
        System.out.println("Eu sou pato borracha!");
    }

    public PatoBorracha(){
        this.quack = new QuackBrincadeira();
        this.voar = new NaoSabeVoar();
    }

}