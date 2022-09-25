package br.unifei.imc.pagamento;

import br.unifei.imc.produto.Produto;

import java.util.List;

public class Boleto implements Pagamento {

    double precoTotal = 0.0;
    @Override
    public double calcularPreco(List<Produto> produtos) {
        produtos.forEach(produto -> precoTotal+= produto.getPreco());
        precoTotal = precoTotal*0.9;
        return precoTotal;
    }
}
