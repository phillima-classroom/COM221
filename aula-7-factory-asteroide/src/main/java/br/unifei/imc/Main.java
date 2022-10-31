package br.unifei.imc;

import br.unifei.imc.asteroides.Asteroide;
import br.unifei.imc.asteroides.AsteroideFogo;

public class Main {
    public static void main(String[] args) {

        Asteroide a = new AsteroideFogo(3);

        System.out.println(a.getPeso());

    }
}