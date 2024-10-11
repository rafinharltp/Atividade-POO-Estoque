public class Tenis extends Produto {
    public Tenis(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularDesconto(double porcentagem) {
        double descontoFinal = (porcentagem > 30) ? 30 : porcentagem;
        return preco - (preco * descontoFinal / 100);
    }
}
