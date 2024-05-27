package segundob;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atividade2 {
    public static void main(String[] args) {
        // Atividade 1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = numeros.stream()
                                            .filter(n -> n % 2 == 0)
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
        palavras.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .forEach((palavra, frequencia) -> System.out.println(palavra + ": " + frequencia));

        // Atividade 4
        List<Produto> produtos = Arrays.asList(
            new Produto("Produto1", 50.0),
            new Produto("Produto2", 150.0),
            new Produto("Produto3", 80.0),
            new Produto("Produto4", 200.0)
        );
        List<Produto> produtosMaisCaros = produtos.stream()
                                                  .filter(p -> p.getPreco() > 100.0)
                                                  .collect(Collectors.toList());
        System.out.println("Produtos com preço maior que R$ 100,00: " + produtosMaisCaros);

        // Atividade 5
        double total = produtos.stream()
                               .mapToDouble(Produto::getPreco)
                               .sum();
        System.out.println("Valor total dos produtos: R$ " + total);

        // Atividade 6
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> linguagensOrdenadas = linguagens.stream()
                                                     .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
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
        return nome + " - R$ " + preco;
    
    }
}
