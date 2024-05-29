package segundob.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListaDois {
    public static void main(String[] args) {
        
        System.out.println("----- Atividade Um -----");

        List<Integer> numerosLista = new ArrayList<>();

        numerosLista.add(23);
        numerosLista.add(24);
        numerosLista.add(58);
        numerosLista.add(69);
        numerosLista.add(22);
        numerosLista.add(13);
        numerosLista.add(18);
        numerosLista.add(47);

        List<Integer> numeroPar = numerosLista.stream().filter(n -> n % 2 == 0).toList();

        System.out.println("Numeros pares da lista:");
        numeroPar.forEach(System.out::println);

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("---- Atividade Dois ----");

        List<String> nomesLista = new ArrayList<>();

        nomesLista.add("roberto");
        nomesLista.add("josé");
        nomesLista.add("caio");
        nomesLista.add("vinicius");

        List<String> nomesMaiusculo = nomesLista.stream().map(String::toUpperCase).toList();

        System.out.println("Nomes CAPSLOCK:");
        nomesMaiusculo.forEach(System.out::println);

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("---- Atividade Tres ----");

        List<String> stringLista = new ArrayList<>();

        stringLista.add("se");
        stringLista.add("talvez");
        stringLista.add("hoje");
        stringLista.add("sábado");
        stringLista.add("se");
        stringLista.add("quarta");
        stringLista.add("sábado");

        Map<String, Long> contaPalavra = stringLista.stream().collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        contaPalavra.forEach((palavra, contagem) -> System.out.println("Palavra: " + palavra + " Quantas vezes apareceu: " + contagem));

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--- Atividade Quatro ---");

        List<Produto> produtos = new ArrayList<>();
        
        produtos.add(new Produto("Paranga de 10", 10.00));
        produtos.add(new Produto("3 Galo", 150.00));
        produtos.add(new Produto("Aliança", 2000.00));
        produtos.add(new Produto("Caltao vermei", 11.50));

        List<Produto> filtroProdutos = produtos.stream().filter(produto -> produto.getPreco() > 100).toList();

        filtroProdutos.forEach(System.out::println);

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--- Atividade Cinco  ---");

        
        double somaProdutos = produtos.stream().mapToDouble(Produto::getPreco).sum();

        System.out.println("Valor total das parada $$$ " + somaProdutos);

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("---- Atividade Seis ----");
        
        List<String> linguagensLista = new ArrayList<>();

        linguagensLista.add("Java");
        linguagensLista.add("Python");
        linguagensLista.add("C");
        linguagensLista.add("JavaSricpt");
        linguagensLista.add("Ruby");

        List<String> tamanhoPalavras = linguagensLista.stream().sorted((p1, p2) -> Integer.compare(p1.length(), p2.length())).toList();

        tamanhoPalavras.forEach(System.out::println);

    }
}
