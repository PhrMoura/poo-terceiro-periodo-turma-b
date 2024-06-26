package segundob.listas.listadois;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListaDoisMain {
    public static void main(String[] args) {

        // atividade 1
        System.out.println("-----ATIVIDADE 1-----");
        System.out.println();

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        List<Integer> numerosPares = numeros.stream()
                .filter(pares -> pares % 2 == 0)
                .toList();

        numerosPares.forEach(pares -> System.out.println(pares));
        System.out.println();

        System.out.println("-----Fim-----");

        // atividade 2
        System.out.println("-----ATIVIDADE 2-----");
        System.out.println();

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("roberto");
        listaNomes.add("josé");
        listaNomes.add("caio");
        listaNomes.add("vinicius");

        List<String> nomesMaiusculo = listaNomes.stream()
                .map(String -> String.toUpperCase())// .map(String::ToUpperCase) é a mesma coisa
                .toList();

        nomesMaiusculo.forEach(nomes -> System.out.println(nomes));
        System.out.println();

        System.out.println("-----Fim-----");

        // atividade 3
        System.out.println("-----ATIVIDADE 3-----");
        System.out.println();

        List<String> palavras = new ArrayList<>();

        palavras.add("se");
        palavras.add("talvez");
        palavras.add("hoje");
        palavras.add("sábado");
        palavras.add("se");
        palavras.add("quarta");
        palavras.add("sábado");

         Map<String, Long> contagemPalavras = palavras.stream()
          .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        contagemPalavras.forEach((palavra, contagem ) -> System.out.println(palavra + "-" + contagem));

        System.out.println();
        System.out.println("-----Fim-----");

        // atividade 4
        System.out.println("-----ATIVIDADE 4-----");
        System.out.println();
        
        List<Produto> listaProdutos =  List.of(
            new Produto("Manga", 3.0),
            new Produto("Helicoptero", 1000000.0),
            new Produto("Action Figure", 500.0),
            new Produto("Granola 1KG", 40.0)
        );

        List<Produto> produtosAcimaDeCemReais = listaProdutos.stream()
            .filter(produto -> produto.getPreco() > 100.0)
            .toList();
        
        produtosAcimaDeCemReais.forEach(produto -> System.out.println(produto.getNome() + ": R$" + produto.getPreco()));

        System.out.println();
        System.out.println("-----Fim-----");

        // atividade 5
        System.out.println("-----ATIVIDADE 5-----");
        System.out.println();

        Double valorProdutos = listaProdutos.stream()
            .mapToDouble(produto -> produto.getPreco())
            .sum();
        
        System.out.println(valorProdutos);

        System.out.println();
        System.out.println("-----Fim-----");

        // atividade 6
        System.out.println("-----ATIVIDADE 6-----");
        System.out.println();
        
        List<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("Ruby");

        List<String> linguagensOrdenadas = linguagens.stream()
            .sorted((l1, l2) -> Integer.compare(l1.length(), l2.length()))
            .toList();

            linguagensOrdenadas.forEach(linguas -> System.out.println(linguas));
            
        System.out.println();
        System.out.println("-----Fim-----");
    }
}
