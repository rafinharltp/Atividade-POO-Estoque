public class Camiseta extends Produto {
    public Camiseta(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularDesconto(double porcentagem) {
        double descontoFinal = (porcentagem > 40) ? 40 : porcentagem;
        return preco - (preco * descontoFinal / 100);
    }
}
