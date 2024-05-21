import java.util.*;
import java.util.function.Function;
import java.util.stream.*;


public class Lista2 {
    public static void main(String[] args) {
        // Atividade 1
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        List<Integer> numerosPares = numeros.stream()
                                            .filter(num -> num % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("Números pares: " + numerosPares);


        // Atividade 2
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
        List<String> nomesMaiusculos = nomes.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());
        System.out.println("Nomes em maiúsculas: " + nomesMaiusculos);


        // Atividade 3
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        Map<String, Long> contagemPalavras = palavras.stream()
                                                      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Contagem de palavras: " + contagemPalavras);


        // Atividade 4
        List<Produto> produtos = Arrays.asList(
            new Produto("Produto1", 50.0),
            new Produto("Produto2", 150.0),
            new Produto("Produto3", 200.0),
            new Produto("Produto4", 80.0)
        );
        List<Produto> produtosCaros = produtos.stream()
                                              .filter(produto -> produto.getPreco() > 100.0)
                                              .collect(Collectors.toList());
        System.out.println("Produtos com preço maior que R$100,00: " + produtosCaros);


        // Atividade 5
        double somaPrecos = produtos.stream()
                                    .mapToDouble(Produto::getPreco)
                                    .sum();
        System.out.println("Soma dos preços dos produtos: R$" + somaPrecos);


        // Atividade 6
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> linguagensOrdenadas = linguagens.stream()
                                                     .sorted(Comparator.comparingInt(String::length))
                                                     .collect(Collectors.toList());
        System.out.println("Linguagens ordenadas por tamanho: " + linguagensOrdenadas);
    }
}


class Produto {
    private String nome;
    private double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    @Override
    public String toString() {
        return nome + ": R$" + preco;
    }
}


