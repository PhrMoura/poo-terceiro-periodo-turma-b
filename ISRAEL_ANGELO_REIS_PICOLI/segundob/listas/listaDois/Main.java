package segundob.listas.listaDois;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // ATV1

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        List<Integer> apenasPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(apenasPares);

        System.out.println("");

        // ATV2

        List<String> nomes = new ArrayList<>();
        nomes.add("roberto");
        nomes.add("josé");
        nomes.add("caio");
        nomes.add("vinicius");

        List<String> apenasMaiusculo = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(apenasMaiusculo);

        System.out.println("");

        // ATV3

        List<String> palavras = new ArrayList<>();
        palavras.add("se");
        palavras.add("talvez");
        palavras.add("hoje");
        palavras.add("sábado");
        palavras.add("se");
        palavras.add("quarta");
        palavras.add("sábado");

        Map<String, Long> palavrasRepetidas = palavras.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        palavrasRepetidas.forEach((palavra, numero) -> System.out.println(palavra + " -> " + numero + "x"));

        System.out.println("");

        // ATV4

        List<Produto> frutas = new ArrayList<>();

        Produto melancia = new Produto("🍉", 25.0);
        Produto uva = new Produto("🍇", 200.0);
        Produto tangerina = new Produto("🍊", 40.0);
        Produto morango = new Produto("🍓", 110.0);

        frutas.add(melancia);
        frutas.add(uva);
        frutas.add(tangerina);
        frutas.add(morango);

        List<Produto> maiorCem = frutas.stream()
                .filter(produto -> produto.getValor() > 100.0)
                .collect(Collectors.toList());

        for (Produto produto : maiorCem) {
            System.out.println(produto.getNome() + " R$" + produto.getValor());
        }
        System.out.println("");

        // ATV5

        double somaFrutas = frutas.stream()
                .mapToDouble(Produto::getValor)
                .sum();

        System.out.println("Soma do valor das frutas: R$" + somaFrutas);
        
        System.out.println("");

        // ATV6

        List<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C");
        linguagens.add("JavaScript");
        linguagens.add("Ruby");

        List<String> crescente = linguagens.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        crescente.forEach(ordenado -> System.out.println(ordenado));
    }
}
