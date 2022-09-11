package br.unifei.imc.pato;

import br.unifei.imc.quack.Quack;
import br.unifei.imc.voar.Voar;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Pato {

    Voar voar;
    Quack quack;

    public void nadar(){
        System.out.println("Pato Nadando");
    }

    public abstract void mostrar();

    public void voar(){
        voar.voar();
    }

    public void quack(){
        quack.quack();
    }
}
