import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);
        String adicionarMais = "";

        do {
            System.out.println("Qual o nome do Produto?");
            String nome = sc.nextLine();
            System.out.println("Quanto custa esse Produto?");
            double preco = sc.nextDouble();
            sc.nextLine(); // Consumir a nova linha pendente do Scanner
            System.out.println("Digite o tipo do produto (Camiseta/Tenis):");
            String tipoProduto = sc.nextLine();

            Produto produto;

            if (tipoProduto.equalsIgnoreCase("Camiseta")) {
                produto = new Camiseta(nome, preco);
            } else if (tipoProduto.equalsIgnoreCase("Tenis")) {
                produto = new Tenis(nome, preco);
            } else {
                System.out.println("Tipo de produto inválido!");
                continue;
            }

            estoque.adicionarProduto(produto);

            System.out.println("Deseja adicionar mais produtos? (sim/nao):");
            adicionarMais = sc.nextLine();

        } while (adicionarMais.equalsIgnoreCase("sim"));

        System.out.println("Digite a porcentagem de desconto a ser aplicada:");
        double porcentagemDesconto = sc.nextDouble();

        estoque.exibirPrecosComDesconto(porcentagemDesconto);

        sc.close();
    }
}
