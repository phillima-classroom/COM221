package br.unifei.imc.asteroides;

public class AsteroideFogo extends Asteroide{

    public AsteroideFogo(double dificuldade) {
        super(dificuldade);
        this.nome = "Asteroide de Fogo";
        this.tipoDanoColisao = "Fogo";
    }

    @Override
    protected void defineMultiplicador() {
        this.multiplicadorTipo = 7;
    }

}