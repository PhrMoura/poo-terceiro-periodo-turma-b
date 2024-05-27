package segundoB.listas.lista2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        // Atividade 1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Lista com ao menos 8 números

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra apenas os números pares
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);

        // Atividade 2
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");

        List<String> nomesMaiusculos = nomes.stream()
                .map(String::toUpperCase) // Converte cada nome para maiúsculas
                .collect(Collectors.toList());

        System.out.println("Nomes em maiúsculas: " + nomesMaiusculos);

        // Atividade 3
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        Map<String, Long> contagemPalavras = palavras.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        System.out.println("Contagem de palavras:");
        contagemPalavras.forEach((palavra, contagem) -> System.out.println(palavra + ": " + contagem));

        // Atividade 4
        List<Produto> produtos = Arrays.asList(
                new Produto("Arroz", 150.0),
                new Produto("Feijão", 80.0),
                new Produto("Luz", 120.0),
                new Produto("Agua", 90.0));

        List<Produto> produtosMaisCarosQue100 = produtos.stream()
                .filter(produto -> produto.getPreco() > 100.0)
                .collect(Collectors.toList());

        System.out.println("Produtos com preço maior que R$ 100,00:");
        produtosMaisCarosQue100.forEach(System.out::println);

        // Atividade 5
        double valorTotal = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();

        System.out.println("Valor total dos produtos: R$ " + valorTotal);

        // Atividade 6
        List<String> lista = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> listaOrdenada = lista.stream()
                .sorted((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                .collect(Collectors.toList());

        System.out.println("Lista ordenada pelo tamanho das palavras:");
        listaOrdenada.forEach(System.out::println);
    }
}
