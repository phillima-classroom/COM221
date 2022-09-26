package br.unifei.imc.test;

import br.unifei.imc.processador.observadores.*;
import br.unifei.imc.processador.ProcessadorFrase;
import br.unifei.imc.processador.exception.SemProcessadoresException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProcessadorFrase {

    private final String FRASE1 = "Eu quero tomar Café";
    private final String FRASE2 = "eu quero programar jogos com unity";

    private ProcessadorFrase processadorFrase;

    @Before
    public void init(){
        processadorFrase = new ProcessadorFrase();
    }

    @Test(expected = SemProcessadoresException.class)
    public void testeSemProcessadores(){
        processadorFrase.processar(FRASE1);
    }

    @Test
    public void testeContaTodasAsPalavras(){
        processadorFrase.registrar(new ContaTodasPalavras());
        processadorFrase.processar(FRASE1);
        Assert.assertEquals(4,processadorFrase.getObservadores().get(0).getNumPalavras());
    }

    @Test
    public void testeContaPalavrasPares(){
        processadorFrase.registrar(new ContaPalavrasPares());
        processadorFrase.processar(FRASE1);
        Assert.assertEquals(2,processadorFrase.getObservadores().get(0).getNumPalavras());
    }

    @Test
    public void testeContaPalavrasImpares(){
        processadorFrase.registrar(new ContaPalavrasImpares());
        processadorFrase.processar(FRASE2);
        Assert.assertEquals(5,processadorFrase.getObservadores().get(0).getNumPalavras());
    }

    @Test
    public void testeContaPalavrasLetraMaiuscula(){
        processadorFrase.registrar(new ContaPalavrasMaiuscula());
        processadorFrase.processar(FRASE2);
        Assert.assertEquals(0,processadorFrase.getObservadores().get(0).getNumPalavras());
        processadorFrase.processar(FRASE1);
        Assert.assertEquals(2,processadorFrase.getObservadores().get(0).getNumPalavras());
    }

    @Test
    public void testeTodosObservadores(){
        processadorFrase.registrar(new ContaPalavrasMaiuscula());
        processadorFrase.registrar(new ContaPalavrasImpares());
        processadorFrase.registrar(new ContaTodasPalavras());
        processadorFrase.registrar(new ContaPalavrasPares());
        processadorFrase.processar(FRASE2);
        Assert.assertEquals(0,processadorFrase.getObservadores().get(0).getNumPalavras());
        Assert.assertEquals(5,processadorFrase.getObservadores().get(1).getNumPalavras());
        Assert.assertEquals(6,processadorFrase.getObservadores().get(2).getNumPalavras());
        Assert.assertEquals(1,processadorFrase.getObservadores().get(3).getNumPalavras());
    }

    @Test
    public void testeRemoveObservador(){
        Observador obs = new ContaTodasPalavras();
        processadorFrase.registrar(new ContaPalavrasMaiuscula());
        processadorFrase.registrar(new ContaPalavrasImpares());
        processadorFrase.registrar(obs);
        processadorFrase.registrar(new ContaPalavrasPares());
        processadorFrase.processar(FRASE2);
        Assert.assertEquals(0,processadorFrase.getObservadores().get(0).getNumPalavras());
        Assert.assertEquals(5,processadorFrase.getObservadores().get(1).getNumPalavras());
        Assert.assertEquals(6,processadorFrase.getObservadores().get(2).getNumPalavras());
        Assert.assertEquals(1,processadorFrase.getObservadores().get(3).getNumPalavras());

        processadorFrase.cancelar(obs);
        Assert.assertEquals(0,processadorFrase.getObservadores().get(0).getNumPalavras());
        Assert.assertEquals(5,processadorFrase.getObservadores().get(1).getNumPalavras());
        Assert.assertEquals(1,processadorFrase.getObservadores().get(2).getNumPalavras());
        Assert.assertEquals(3,processadorFrase.getObservadores().size());
    }

}