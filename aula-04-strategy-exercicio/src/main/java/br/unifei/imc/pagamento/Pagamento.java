package br.unifei.imc.pagamento;

import br.unifei.imc.produto.Produto;

import java.util.List;

public interface Pagamento {

    double calcularPreco(List<Produto> produtos);
}
