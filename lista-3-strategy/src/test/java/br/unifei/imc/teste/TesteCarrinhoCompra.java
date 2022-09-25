package br.unifei.imc.teste;

import br.unifei.imc.carrinho.CarrinhoCompra;
import br.unifei.imc.pagamento.Boleto;
import br.unifei.imc.pagamento.CartaoCredito;
import br.unifei.imc.pagamento.CartaoDebito;
import br.unifei.imc.produto.Produto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoCompra {

    private CarrinhoCompra carrinho;

    @Before
    public void init(){
        carrinho = new CarrinhoCompra();
    }

    @Test
    public void testeCompraBoleto(){
        carrinho.addProduto(new Produto("AlienWare",10900.99));
        carrinho.addProduto(new Produto("Pen-drive 256GB",250.78));
        carrinho.calcularPreco();
        double preco = carrinho.getPrecoTotal();
        Assert.assertEquals(10036.59,preco,0.01);
        Assert.assertTrue(carrinho.getTipoPagamento() instanceof Boleto);
    }

    @Test
    public void testeCompraDebito(){
        carrinho.addProduto(new Produto("AlienWare",10900.99));
        carrinho.addProduto(new Produto("Pen-drive 256GB",250.78));
        carrinho.addProduto(new Produto("Cthulhu Death May Die",699.67));
        carrinho.setTipoPagamento(new CartaoDebito());
        carrinho.calcularPreco();
        double preco = carrinho.getPrecoTotal();
        Assert.assertEquals(11614.41,preco,0.01);
        Assert.assertTrue(carrinho.getTipoPagamento() instanceof CartaoDebito);
    }

    @Test
    public void testeCompraCredito(){
        carrinho.addProduto(new Produto("AlienWare",10900.99));
        carrinho.addProduto(new Produto("Pen-drive 256GB",250.78));
        carrinho.addProduto(new Produto("Cthulhu Death May Die",699.67));
        carrinho.setTipoPagamento(new CartaoCredito());
        carrinho.calcularPreco();
        double preco = carrinho.getPrecoTotal();
        Assert.assertEquals(12088.46,preco,0.01);
        Assert.assertTrue(carrinho.getTipoPagamento() instanceof CartaoCredito);
    }

}
