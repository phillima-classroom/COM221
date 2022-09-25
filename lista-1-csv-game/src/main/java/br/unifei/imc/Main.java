package br.unifei.imc;

import br.unifei.imc.model.Game;
import br.unifei.imc.model.Platform;
import br.unifei.imc.model.Publisher;
import br.unifei.imc.service.ServiceGame;
import br.unifei.imc.util.CsvUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Path arquivo = Paths.get("vendas-games.csv");

        List<Game> allGamesList = CsvUtils.readGameCsv(arquivo);

        List<Game> ps4Games = ServiceGame.getListByPlatform(allGamesList, Platform.PS4);

        ps4Games.forEach(game -> System.out.println(game.getName()));

        List<Game> x360Games = ServiceGame.getListByPlatform(allGamesList, Platform.X360);

        x360Games.forEach(game -> System.out.println(game.getName()));

        List<Game> activisionGames = ServiceGame.getByPuBlisher(allGamesList, Publisher.Activision);

        List<Game> microsoftGames = ServiceGame.getByPuBlisher(allGamesList, Publisher.MicrosoftGameStudios);


    }

}
