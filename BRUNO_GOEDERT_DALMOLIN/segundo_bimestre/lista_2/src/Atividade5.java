
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Atividade5 {

    public static class Produto {
        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        String nome;
        double preco;

    }

    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        List<Produto> lProdutos = Arrays.asList(new Produto("Tenis", 450), new Produto("Camisa", 120),
                new Produto("Tapete", 20));

        double valorTotal = lProdutos.stream().mapToDouble(p -> p.preco).sum();

        System.out.println("Valor total: R$" + valorTotal);

        scanner.close();
    }

}
