package br.unifei.imc.gerador;

import br.unifei.imc.model.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GeradorJSON implements GeradorArquivo{
    @Override
    public void gerarArquivo(List<Pessoa> pessoas) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(pessoas);

        try {
            Files.writeString(Path.of("pessoas.json"),json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}