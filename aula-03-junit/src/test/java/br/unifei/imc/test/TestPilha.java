package br.unifei.imc.test;

import br.unifei.imc.pilha.Pilha;
import br.unifei.imc.pilha.exception.PilhaVaziaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPilha {

    private Pilha pilha;

    @Before
    public void setUp(){
        pilha = new Pilha<Integer>();
    }

    @Test
    public void testPilhaVazia(){
        boolean retorno = pilha.isVazia();
        Assert.assertTrue(retorno);
    }

    @Test
    public void testPushElementos(){
        pilha.pushElemento(2);
        int qtdElementos = pilha.getQtdElementos();
        Assert.assertEquals(1,qtdElementos);
        int topo = (int) pilha.mostraTopo();
        Assert.assertEquals(2,topo);
    }

    @Test
    public void testPush3Elementos(){
        pilha.pushElemento(2);
        pilha.pushElemento(3);
        pilha.pushElemento(4);
        int qtdElementos = pilha.getQtdElementos();
        Assert.assertEquals(3,qtdElementos);
        int topo = (int) pilha.mostraTopo();
        Assert.assertEquals(4,topo);
    }

    @Test
    public void testPop(){
        pilha.pushElemento(2);
        pilha.pushElemento(3);
        pilha.pushElemento(4);
        pilha.popElemento();
        int qtdElementos = pilha.getQtdElementos();
        Assert.assertEquals(2,qtdElementos);
        int topo = (int) pilha.mostraTopo();
        Assert.assertEquals(3,topo);
    }

    @Test(expected = PilhaVaziaException.class)
    public void testPopPilhaVazia(){
        pilha.popElemento();
    }

}
