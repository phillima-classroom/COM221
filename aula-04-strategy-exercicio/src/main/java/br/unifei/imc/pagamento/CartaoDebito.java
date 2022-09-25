package br.unifei.imc.pagamento;

import br.unifei.imc.produto.Produto;

import java.util.List;

public class CartaoDebito implements Pagamento {

    private double precoTotal;

    @Override
    public double calcularPreco(List<Produto> produtos) {
        produtos.forEach(produto -> precoTotal+= produto.getPreco());
        precoTotal = precoTotal*0.98;
        return precoTotal;
    }
}
