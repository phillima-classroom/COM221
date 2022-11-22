package br.unifei.imc.app;

import br.unifei.imc.app.pojo.BoardGame;
import br.unifei.imc.framework.gerador.Gerador;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        BoardGame bg = new BoardGame("Lord of Hellas",4,799.90);

        Map<String,Object> mapa = Gerador.gerarMapa(bg);

        mapa.forEach((k,v) -> {
            System.out.println(k + " : " + v);
        });
    }
}