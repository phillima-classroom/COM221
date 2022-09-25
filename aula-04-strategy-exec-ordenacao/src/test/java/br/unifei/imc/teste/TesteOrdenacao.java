package br.unifei.imc.teste;

import br.unifei.imc.biblioteca.BibliotecaService;
import br.unifei.imc.ordenacao.BubbleSort;
import br.unifei.imc.ordenacao.InsertionSort;
import br.unifei.imc.ordenacao.SelectionSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteOrdenacao {

    BibliotecaService bibService;

    @Before
    public void init(){
        bibService = new BibliotecaService();
    }

    @Test
    public void testeBubbleSort(){
        var notasAlunos = new double[]{6.56,7.89,4.34,8.90,5.67,8.2};
        bibService.apresentarNotasOrdenadas(notasAlunos);
        Assert.assertEquals(4.34,notasAlunos[0],0.02);
        Assert.assertEquals(5.67,notasAlunos[1],0.02);
        Assert.assertEquals(6.56,notasAlunos[2],0.02);
        Assert.assertEquals(7.89,notasAlunos[3],0.02);
        Assert.assertEquals(8.2,notasAlunos[4],0.02);
        Assert.assertEquals(8.9,notasAlunos[5],0.02);
        Assert.assertTrue(bibService.getOrdenacao() instanceof BubbleSort);
    }

    @Test
    public void testeSelection(){
        var notasAlunos = new double[]{6.56,7.89,4.34,8.90,5.67,8.2};
        bibService.setOrdenacao(new SelectionSort());
        bibService.apresentarNotasOrdenadas(notasAlunos);
        Assert.assertEquals(4.34,notasAlunos[0],0.02);
        Assert.assertEquals(5.67,notasAlunos[1],0.02);
        Assert.assertEquals(6.56,notasAlunos[2],0.02);
        Assert.assertEquals(7.89,notasAlunos[3],0.02);
        Assert.assertEquals(8.2,notasAlunos[4],0.02);
        Assert.assertEquals(8.9,notasAlunos[5],0.02);
        Assert.assertTrue(bibService.getOrdenacao() instanceof SelectionSort);
    }

    @Test
    public void testeInsertion(){
        var notasAlunos = new double[]{6.56,7.89,4.34,8.90,5.67,8.2};
        bibService.setOrdenacao(new InsertionSort());
        bibService.apresentarNotasOrdenadas(notasAlunos);
        Assert.assertEquals(4.34,notasAlunos[0],0.02);
        Assert.assertEquals(5.67,notasAlunos[1],0.02);
        Assert.assertEquals(6.56,notasAlunos[2],0.02);
        Assert.assertEquals(7.89,notasAlunos[3],0.02);
        Assert.assertEquals(8.2,notasAlunos[4],0.02);
        Assert.assertEquals(8.9,notasAlunos[5],0.02);
        Assert.assertTrue(bibService.getOrdenacao() instanceof InsertionSort);
    }
}
