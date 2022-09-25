package br.unifei.imc.pagamento;

import br.unifei.imc.produto.Produto;

import java.util.List;

public class CartaoCredito implements Pagamento {

    private double precoTotal;

    @Override
    public double calcularPreco(List<Produto> produtos) {
        produtos.forEach(produto -> precoTotal+= produto.getPreco());
        precoTotal = precoTotal*1.02;
        return precoTotal;
    }
}
