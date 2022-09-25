package br.unifei.imc.carrinho;

import br.unifei.imc.pagamento.Boleto;
import br.unifei.imc.pagamento.Pagamento;
import br.unifei.imc.produto.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class CarrinhoCompra {
    @Setter
    private Pagamento tipoPagamento;
    private List<Produto> produtos;
    private double precoTotal;

    public CarrinhoCompra(){
        this.tipoPagamento = new Boleto();
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void calcularPreco() {
        this.precoTotal = this.tipoPagamento.calcularPreco(produtos);
    }
}
