package br.unifei.imc.voar;

public class NaoSabeVoar implements Voar{
    @Override
    public void voar() {
        System.out.println("Não sabe voar");
    }
}
