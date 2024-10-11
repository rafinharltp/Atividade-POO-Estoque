import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void exibirPrecosComDesconto(double porcentagemDesconto) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagemDesconto);
            System.out.println("Preço de " + produto.getNome() + " com desconto: R$ " + precoComDesconto);
        }
    }
}


