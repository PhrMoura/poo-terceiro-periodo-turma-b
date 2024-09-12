package segundob.listas.lista2;

import java.util.*;
import java.util.stream.Collectors;

public class AtividadeDois {
  public static void main(String[] args) {

    System.out.println("---------- Atv 1 ----------");
    List<Integer> numerosInteiros = new ArrayList<>();

    numerosInteiros.add(1);
    numerosInteiros.add(8);
    numerosInteiros.add(10);
    numerosInteiros.add(43);
    numerosInteiros.add(27);
    numerosInteiros.add(30);
    numerosInteiros.add(70);
    numerosInteiros.add(06);

    List<Integer> numerosPares = numerosInteiros.stream()
        .filter(numeros -> numeros % 2 == 0)
        .toList();

    numerosPares.forEach(numeros -> System.out.println(numeros));

    System.out.println("---------- Atv 2 ----------");
    List<String> nomesMinusculos = new ArrayList<>();

    nomesMinusculos.add("roberto");
    nomesMinusculos.add("josé");
    nomesMinusculos.add("caio santos");
    nomesMinusculos.add("vinicius");

    nomesMinusculos.stream()
        .map(nomes -> nomes.toUpperCase())
        .forEach(nomes -> System.out.println(nomes));

    System.out.println("---------- Atv 3 ----------");
    List<String> listaDePalavras = new ArrayList<>();

    listaDePalavras.add("se");
    listaDePalavras.add("talvez");
    listaDePalavras.add("hoje");
    listaDePalavras.add("sabado");
    listaDePalavras.add("se");
    listaDePalavras.add("quarta");
    listaDePalavras.add("sabado");

    Map<String, Long> contadorDePalavras = listaDePalavras.stream()
        .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

    contadorDePalavras.forEach((palavra, contagem) -> System.out.println(String.format("%s = %d", palavra, contagem)));

    System.out.println("---------- Atv 4 ----------");
    List<Produto> produtos = new ArrayList<>();

    produtos.add(new Produto("Leite", 50.00));
    produtos.add(new Produto("Carro", 150.00));
    produtos.add(new Produto("Champions 2021", 1000.00));
    produtos.add(new Produto("Moto", 25.00));

    List<Produto> produtosFiltrados = produtos.stream()
        .filter(produto -> produto.getPreco() > 100.00)
        .toList();

    produtosFiltrados.forEach(produto -> System.out.println(produto));

    System.out.println("---------- Atv 5 ----------");
    Double somaDosProdutos = produtos.stream()
        .mapToDouble(produto -> produto.getPreco())
        .reduce(0, (valorAnterior, valorAtual) -> valorAnterior + valorAtual);

    System.out.println("R$ " + somaDosProdutos);

    System.out.println("---------- Atv 6 ----------");
    List<String> linguagensDeProgramacao = new ArrayList<>();

    linguagensDeProgramacao.add("Java");
    linguagensDeProgramacao.add("Python");
    linguagensDeProgramacao.add("C");
    linguagensDeProgramacao.add("JavaScript");
    linguagensDeProgramacao.add("Ruby");

    List<String> palabrasOrdenadas = linguagensDeProgramacao.stream()
        .sorted((string1, string2) -> Integer.compare(string1.length(), string2.length()))
        .toList();

    palabrasOrdenadas.forEach(palavras -> System.out.println(palavras));
  }
}
