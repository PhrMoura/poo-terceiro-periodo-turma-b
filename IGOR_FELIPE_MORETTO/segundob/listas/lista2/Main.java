package segundob.listas.lista2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        //Att 1
        List <Integer> num = new ArrayList<>();

        num.add(10);
        num.add(11);
        num.add(18);
        num.add(5);
        num.add(20);
        num.add(28);
        num.add(3);
        num.add(8);

        List <Integer> soPares = num.stream()
        .filter(numero -> numero % 2 == 0)
        .toList();

        soPares.forEach(n -> System.out.println(n));

        System.out.println("-----------------------");

        //Att 2

        List <String> listaNomes = new ArrayList<>();

        listaNomes.add("roberto");
        listaNomes.add("josé");
        listaNomes.add("caio");
        listaNomes.add("vinicius");

        List <String> nomesMaisc = listaNomes.stream()
        .map(nomes -> nomes.toUpperCase())
        .toList();

        nomesMaisc.forEach(nome -> System.out.println(nome));

        System.out.println("-----------------------");

        //Att 3

        List <String> listaPalavras = new ArrayList<>();

        listaPalavras.add("se");
        listaPalavras.add("talvez");
        listaPalavras.add("hoje");
        listaPalavras.add("sábado");
        listaPalavras.add("se");
        listaPalavras.add("quarta");
        listaPalavras.add("sábado");

         Map<String, Long> contPalavras = listaPalavras.stream()
            .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        // Exibir o resultado
        contPalavras.forEach((word, count) -> {
            System.out.println(word + ": " + count);
        });

        System.out.println("-----------------------");

        //Att 4

        List <Produtos> listaProdutos = Arrays.asList(
            new Produtos("Tomate", 100.0),
            new Produtos("Laranja", 20.0),
            new Produtos("Abacate", 150.0),
            new Produtos("Limão", 50.0)
        );

        List <Produtos> produtoFilt = listaProdutos.stream()
        .filter(produto -> produto.getPreco() > 100.0)
        .toList();

        produtoFilt.forEach(prod -> System.out.println(prod));
    }

}
