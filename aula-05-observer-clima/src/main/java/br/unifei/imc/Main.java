package br.unifei.imc;

import br.unifei.imc.clima.ClimaDados;
import br.unifei.imc.display.CondicoesCorrente;
import br.unifei.imc.display.Display;
import br.unifei.imc.display.PrevisaoDisplay;

public class Main {
    public static void main(String[] args) {


        ClimaDados clima = new ClimaDados();

        Display correnteDisplay = new CondicoesCorrente(clima);
        Display previsaoDisplay = new PrevisaoDisplay(clima,19);

        clima.setMudancas(15, 65, 30);
        clima.setMudancas(17, 90, 29.4);

    }
}