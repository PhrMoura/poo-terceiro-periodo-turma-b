package segundob.listas.listaDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Atividade 1

        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(10);
        listaNumeros.add(16);
        listaNumeros.add(31);
        listaNumeros.add(44);
        listaNumeros.add(55);
        listaNumeros.add(77);
        listaNumeros.add(80);

        List<Integer> numerosPares = listaNumeros.stream()
            .filter(numero -> numero % 2 == 0)
            .toList();

        numerosPares.forEach(numero -> System.out.println(numero));

        System.out.println("-------------------");
        // Atividade 2

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("roberto");
        listaNomes.add("josé");
        listaNomes.add("caio");
        listaNomes.add("vinicius");

        List<String> nomesMaiusculos = listaNomes.stream()
            .map(String::toUpperCase)
            .toList();

        System.out.println(nomesMaiusculos);

        System.out.println("-------------------");
        //Atividade 3

        List<String> listaPalavras = new ArrayList<>();

        listaPalavras.add("se");
        listaPalavras.add("talvez");
        listaPalavras.add("hoje");
        listaPalavras.add("sábado");
        listaPalavras.add("se");
        listaPalavras.add("quarta");
        listaPalavras.add("sábado");

        Map<String, Long> palavrasContadas = listaPalavras.stream()
            .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        palavrasContadas.forEach((palavra, contagem) -> System.out.println(palavra + ": " + contagem));

        System.out.println("-------------------");
        //Atividade 4

        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Café", 150.0));
        listaProdutos.add(new Produto("Chá", 90.0));
        listaProdutos.add(new Produto("Capuccino", 175.0));
        listaProdutos.add(new Produto("Mochaccino", 200.0));

        List<Produto> produtosCaros = listaProdutos.stream()
            .filter(produto -> produto.getPreco() > 100.0)
            .toList();

        produtosCaros.forEach(produto -> System.out.println(produto));

        System.out.println("-------------------");
        //Atividade 5

        Double somaPreco = produtosCaros.stream()
            .mapToDouble(produto -> produto.getPreco())
            .sum();

        System.out.println("Soma do valor dos produtos: R$" + somaPreco);

        System.out.println("-------------------");
        //Atividade 6 

        List<String> listaLinguagens = new ArrayList<>();

        listaLinguagens.add("Java");
        listaLinguagens.add("Python");
        listaLinguagens.add("C");
        listaLinguagens.add("JavaScript");
        listaLinguagens.add("Ruby");

        List<String> linguagensOrdenadas = listaLinguagens.stream()
            .sorted((linguagem1, linguagem2) -> Integer.compare(linguagem1.length(), linguagem2.length()))
            .toList();

        linguagensOrdenadas.forEach(linguagem -> System.out.println(linguagem));

    }
}
