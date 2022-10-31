package br.unifei.imc.asteroides;

public class AsteroideCaos extends Asteroide{

    public AsteroideCaos(double dificuldade) {
        super(dificuldade);
        this.nome = "Asteroide do Caos";
        this.tipoDanoColisao = "Caótico";

    }

    @Override
    protected void defineMultiplicador() {
        this.multiplicadorTipo = 10;
    }

}
