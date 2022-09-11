package br.unifei.imc.test;

import br.unifei.imc.pato.*;
import br.unifei.imc.quack.QuackBrincadeira;
import br.unifei.imc.voar.NaoSabeVoar;
import br.unifei.imc.voar.VoarComAsas;
import br.unifei.imc.voar.VoarFoguete;
import org.junit.Assert;
import org.junit.Test;

public class TestePato {

    Pato pato;

    @Test
    public void testePatoBorracha() {
        pato = new PatoBorracha();
        Assert.assertTrue(pato.getVoar() instanceof NaoSabeVoar);
        Assert.assertTrue(pato.getQuack() instanceof QuackBrincadeira);
    }

    @Test
    public void testePatoEnfeite() {
        pato = new PatoEnfeite();
        Assert.assertTrue(pato.getVoar() instanceof NaoSabeVoar);
        Assert.assertTrue(pato.getQuack() instanceof NaoFazQuack);
    }

    @Test
    public void testeMarreco() {
        pato = new Marreco();
        Assert.assertTrue(pato.getVoar() instanceof VoarComAsas);
        pato.setVoar(new VoarFoguete());
        Assert.assertTrue(pato.getVoar() instanceof VoarFoguete);
    }

}
