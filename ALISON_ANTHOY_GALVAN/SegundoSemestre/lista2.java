import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Atv 4
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
}

public class lista2 {
    public static void main(String[] args) {

        //Atv 1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                                            .filter(num -> num % 2 == 0)
                                            .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);


        //Atv 2
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");

        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());

        System.out.println("Nomes em maiúsculas: " + nomesMaiusculos);


        //Atv 3
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        Map<String, Long> contagemPalavras = palavras.stream()
                                                    .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        System.out.println("Contagem de palavras:");
        contagemPalavras.forEach((palavra, contagem) -> System.out.println(palavra + ": " + contagem));


        //Atv 4
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto1", 50.0));
        produtos.add(new Produto("Produto2", 120.0));
        produtos.add(new Produto("Produto3", 80.0));
        produtos.add(new Produto("Produto4", 150.0));

        List<Produto> produtosCaros = produtos.stream()
                                             .filter(produto -> produto.getPreco() > 100.0)
                                             .collect(Collectors.toList());

        System.out.println("Produtos com preço maior que R$ 100,00:");
        produtosCaros.forEach(produto -> System.out.println(produto.getNome() + ": R$ " + produto.getPreco()));


        //Atv 5
        double somaTotal = produtos.stream()
                                   .mapToDouble(Produto::getPreco)
                                   .sum();

        System.out.println("Valor total dos produtos: R$ " + somaTotal);


        //Atv 6
        List<String> lista = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> listaOrdenada = lista.stream()
                                          .sorted((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                                          .collect(Collectors.toList());

        System.out.println("Lista ordenada pelo tamanho das palavras:");
        listaOrdenada.forEach(System.out::println);
    }
}
