package segundob.listas.listadois;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // ATV1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Numeros Pares: " + numerosPares);

        // ATV2
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
        List<String> nomesMaiusculos = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Nomes Maiusculos: " + nomesMaiusculos);

        // ATV3
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        Map<String, Long> contagemPalavras = palavras.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Contagem de Palavras: " + contagemPalavras);

        // ATV4
        List<Produto> produtos = Arrays.asList(
                new Produto("Produto1", 50.0),
                new Produto("Produto2", 150.0),
                new Produto("Produto3", 200.0),
                new Produto("Produto4", 80.0));
        List<Produto> produtosCaros = produtos.stream()
                .filter(p -> p.getPreco() > 100.0)
                .collect(Collectors.toList());
        System.out.println("Produtos com preço maior que R$ 100,00: " + produtosCaros);

        // ATV5
        double somaPrecos = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
        System.out.println("Soma dos preços dos produtos: R$ " + somaPrecos);

        // ATV6
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> linguagensOrdenadas = linguagens.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Linguagens ordenadas pelo tamanho: " + linguagensOrdenadas);
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
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
