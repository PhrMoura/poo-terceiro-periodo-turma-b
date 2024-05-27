package segundob.listas.lista2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SegundaLista {
    public static void main(String[] args) {

        // Atividade 1

        List<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);
        listNumbers.add(6);
        listNumbers.add(7);
        listNumbers.add(8);

        System.out.println("Lista de Numeros: ");
        listNumbers.forEach(number -> System.out.println(number));

        System.out.println("Lista de Numeros Pares: ");
        listNumbers.stream().filter(number -> number % 2 == 0)
                            .forEach(number -> System.out.println(number));

        System.out.println("----------------------------------------------------------------");

        // Atividade 2

        List<String> listNames = new ArrayList<>();
        
        listNames.add("roberto");
        listNames.add("josé");
        listNames.add("caio");
        listNames.add("vinicius");

        System.out.println("Lista de Nomes Minúsculas: ");
        listNames.forEach(name -> System.out.println(name));

        System.out.println("Lista de Nomes Maiúsculas: ");
        listNames.stream()
            .map(name -> name.toUpperCase())
            .forEach(name -> System.out.println(name));

        System.out.println("----------------------------------------------------------------");

        // Atividade 3

        List<String> listWords = new ArrayList<>();

        listWords.add("se");
        listWords.add("talvez");
        listWords.add("hoje");
        listWords.add("sábado");
        listWords.add("se");
        listWords.add("quarta");
        listWords.add("sábado");

        System.out.println("Lista de Palavras: ");
        listWords.forEach(word -> System.out.println(word));

        Map<String, Long> listWordsAndCounts = listWords.stream()
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println();

        listWordsAndCounts.forEach((words, counts) -> System.out.printf("Palavra: %7s - Repetições na Frase: %3d \n", words, counts));

        System.out.println("----------------------------------------------------------------");

        // Atividade 4

        List<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("Lego", 101.99));
        listProduct.add(new Product("Figure Kirito", 50.99));
        listProduct.add(new Product("Pião com LED", 40.99));
        listProduct.add(new Product("Miniatura Enzo", 399.99));

        System.out.println("Lista de Produtos: ");
        listProduct.forEach(product -> System.out.printf("Produto: %15s - Preço: %.2f\n", product.getName(), product.getPrice()));

        var listProductFilter = listProduct.stream()
            .filter(product -> product.getPrice() > 100)
            .collect(Collectors.toList());

        System.out.println();

        System.out.println("Lista de Produtos com valor acima de 100: ");
        listProductFilter.forEach(product -> System.out.printf("Produto: %15s - Preço: %.2f\n", product.getName(), product.getPrice()));
        
        System.out.println("----------------------------------------------------------------");

        // Atividade 5

        double sumTotal = listProduct.stream()
            .mapToDouble(product -> product.getPrice())
            .reduce(0, (sum, productPrice) -> sum + productPrice);

        System.out.println("Preço Total da Lista: " + sumTotal);

        System.out.println("----------------------------------------------------------------");


        // Atividade 6

        List<String> listLanguage = new ArrayList<>();

        listLanguage.add("Java");
        listLanguage.add("Python");
        listLanguage.add("C");
        listLanguage.add("JavaScript");
        listLanguage.add("Ruby");

        System.out.println("Lista sem ordenação: ");
        listLanguage.forEach(language -> System.out.println(language));
        
        System.out.println();

        var listLanguageOrderly = listLanguage.stream()
            .sorted(Comparator.comparing(language -> language.length()));

        System.out.println("Lista ordenada: ");
        listLanguageOrderly.forEach(language -> System.out.println(language));

    }   
    
}
