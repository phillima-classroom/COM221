package br.unifei.imc.pato;

import br.unifei.imc.quack.Quack;

public class NaoFazQuack implements Quack {
    @Override
    public void quack() {
        System.out.println("Não faço quack");
    }
}
