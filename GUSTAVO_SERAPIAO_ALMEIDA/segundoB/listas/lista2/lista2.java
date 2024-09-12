package listas.lista2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Map;

public class lista2 {

    public static void main(String[] args) {
        // atividade 1
        System.out.println("Atividade 1");

        /*Escreva um programa que receba uma lista de números inteiros e retorne uma lista contendo 
        apenas os números pares usando a Stream API. A lista deve ter ao menos 8 números. */

        List<Integer> numeros = new ArrayList<>();

        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);

        List<Integer> numerosPares = numeros.stream()
        .filter(x -> x % 2 == 0)
        .collect(Collectors.toList());

        System.out.println(numerosPares);

        //atividade 2
        System.out.println("\nAtividade 2");

        /*  Dada a seguinte lista de nomes("roberto", "josé", "caio", "vinicius"), 
            escreva um programa que converta todos os nomes para letras maiúsculas usando a Stream API. */

        List<String> nomes = new ArrayList<>();

        nomes.add("roberto");
        nomes.add("josé");
        nomes.add("caio");
        nomes.add("vinicius");

        List<String> nomesMaiusculos = nomes.stream()
        .map(nome -> nome.toUpperCase())
        .collect(Collectors.toList());

        System.out.println(nomesMaiusculos);

        //atividade 3
        System.out.println("\nAtividade 3\n");

        /*
        * Crie um programa que conte quantas vezes cada palavra única aparece em uma lista de strings. 
        * Utilize a Stream API para processar os dados. Lista de palavras("se", "talvez", "hoje" "sábado", "se", "quarta", "sábado")
        */

        List<String> palavras = new ArrayList<>();

        palavras.add("se");
        palavras.add("talvez");
        palavras.add("hoje");
        palavras.add("sábado");
        palavras.add("se");
        palavras.add("quarta");
        palavras.add("sábado");

        Map<String, Long> palavrasRepetidas = palavras.stream()
        .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        palavrasRepetidas.forEach((palavra, contagem) -> System.out.println(palavra + " : " + contagem));

        //atividade 4
        System.out.println("\nAtividade 4\n");

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Playstation 5", 99.99));
        produtos.add(new Produto("Xbox Series X", 95.55));
        produtos.add(new Produto("Xbox Series S", 100.00));
        produtos.add(new Produto("Jogo do Mario de 1945", 1900.99));

        List<Produto> produtosFiltrados = produtos.stream()
            .filter(x -> x.getPreco() >= 100)
            .collect(Collectors.toList());

        produtosFiltrados.forEach(System.out::println);

        //Atividade 5

        System.out.println("\nAtividade 5\n");

        double total = produtos.stream()
            .mapToDouble(Produto::getPreco)
            .sum();


        produtos.forEach(System.out::println);

        System.out.println("\nTotal dos produtos R$" + formatador(total));

        //Atividade 6

        System.out.println("\nAtividade 6\n");

    List<String> linguagensProgramacao = new ArrayList<>();

    linguagensProgramacao.add("Java");
    linguagensProgramacao.add("Python");
    linguagensProgramacao.add("C");
    linguagensProgramacao.add("JavaScript");
    linguagensProgramacao.add("Ruby");

    List<String> menorParaMaior = linguagensProgramacao.stream()
        .sorted(Comparator.comparingInt(String::length))
        .collect(Collectors.toList());

    menorParaMaior.forEach(System.out::println);

    /*System.out.println("");

    Teste pra ver se ele respeita ordem alfabética ou a ordem que foi colocado

    List<String> teste = new ArrayList<>();

    teste.add("Ruby");
    teste.add("Java");

    //teste.add("Java");
    //teste.add("Ruby");

    List<String> testePequeno = teste.stream()
        .sorted(Comparator.comparingInt(String::length))
        .collect(Collectors.toList());

    testePequeno.forEach(System.out::println);*/
    }

    public static String formatador(double valor){
        return String.format("%.2f", valor);
    }
}
