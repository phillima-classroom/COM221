package br.unifei.imc.test;

import br.unifei.imc.exceptions.OpcaoErradaException;
import br.unifei.imc.service.OpcaoArquivo;
import br.unifei.imc.service.PessoaService;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestPessoaService {

    static PessoaService service;

    @BeforeClass
    public static void setup(){
        service = new PessoaService();
        service.gerarArquivo(OpcaoArquivo.CSV);
        service.gerarArquivo(OpcaoArquivo.JSON);
    }

    @Test
    public void testCriarCSV(){
        Assert.assertTrue(Files.exists(Path.of("pessoas.csv")));
    }

    @Test
    public void testeValidaCSV(){

        try {
            String arquivo = Files.readString(Path.of("pessoas.csv"));
            Assert.assertEquals(ConstFileInfo.CSV,arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testeValidaJSON(){
        try {
            String arquivo = Files.readString(Path.of("pessoas.json"));
            Assert.assertEquals(ConstFileInfo.JSON,arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testCriarJSON(){
        Assert.assertTrue(Files.exists(Path.of("pessoas.json")));
    }

    @Test(expected = OpcaoErradaException.class)
    public void testeOpcaoErrada(){
        service.gerarArquivo(null);
    }

    @AfterClass
    public static void cleanup() throws IOException {
        Files.deleteIfExists(Path.of("pessoas.csv"));
        Files.deleteIfExists(Path.of("pessoas.json"));
    }
}