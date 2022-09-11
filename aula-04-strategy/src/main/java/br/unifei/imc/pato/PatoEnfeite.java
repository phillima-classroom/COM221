package br.unifei.imc.pato;

import br.unifei.imc.quack.QuackBrincadeira;
import br.unifei.imc.voar.NaoSabeVoar;

public class PatoEnfeite extends Pato{
    @Override
    public void mostrar() {
        System.out.println("Eu sou de enfeite");
    }

    public PatoEnfeite(){
        this.voar = new NaoSabeVoar();
        this.quack = new NaoFazQuack();
    }
}