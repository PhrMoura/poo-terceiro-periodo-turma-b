package listas.lista2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // atv1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares: " + numerosPares);

        // ATV2
        System.out.println("\n");
        List<String> numerosMinusculo = Arrays.asList("roberto", "josé", "caio", "vinicius");
        List<String> numerosMaiusculo = numerosMinusculo.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Nomes em maiusculo" + numerosMaiusculo);

        // ATV3
        System.out.println("\n");
        List<String> palavra = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        Map<String, Long> contar = palavra.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Palavras contadas: " + contar);

        // ATV4
        System.out.println("\n");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Mesa", 500.00));
        produtos.add(new Produto("Cadeira gamer", 1500.00));
        produtos.add(new Produto("Computador gamer", 4500.00));
        produtos.add(new Produto("Perifericos", 2000.00));

        System.out.println("Lista de produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto.nome + " R$ " + produto.preco);
        }
        // ATV5
        double soma = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
        System.out.println("O valor total dos produtos é de: " + soma);

        // ATV6
        System.out.println("\n");
        List<String> lista = Arrays.asList("Java", "Python", "C", "Javascript", "Ruby");
        List<String> listaOrdenada = lista.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());

        System.out.println("Lista de linguagens ordenadas pelo tamamho da menor para a maior: " + listaOrdenada);
    }

}
