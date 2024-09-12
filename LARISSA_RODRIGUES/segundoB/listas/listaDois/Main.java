package segundoB.listas.listaDois;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        // ATV1
        System.out.println("---------- ATV1 ----------\n");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(78);
        numeros.add(30);
        numeros.add(2);
        numeros.add(3);
        numeros.add(69);
        numeros.add(16);

        System.out.println("Lista de números:");
        numeros.forEach(numero -> System.out.println("- " + numero));
        System.out.println();
        System.out.println("Lista de números pares:");
        List<Integer> apenasPares = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .toList();
        apenasPares.forEach(numero -> System.out.println("- " + numero));


        // ATV2
        System.out.println("\n---------- ATV2 ----------\n");
        List<String> nomes = new ArrayList<>();
        nomes.add("roberto");
        nomes.add("josé");
        nomes.add("caio");
        nomes.add("vinicius");

        System.out.println("Lista de nomes:");
        nomes.forEach(nome -> System.out.println("- " + nome));
        
        List<String> nomesMaiusculo = nomes.stream()
            .map(String::toUpperCase)
            .toList();
        System.out.println("\nLista de nomes maiúsculos:");
        nomesMaiusculo.forEach(nome -> System.out.println("- " + nome));
        


        // ATV3
        System.out.println("\n---------- ATV3 ----------\n");
        List<String> palavras = new ArrayList<>();
        palavras.add("Se");
        palavras.add("Talvez");
        palavras.add("Hoje");
        palavras.add("Sábado");
        palavras.add("Se");
        palavras.add("Quarta");
        palavras.add("Sábado");

        System.out.println("Lista de palavras:");
        palavras.forEach(palavra -> System.out.println("- " + palavra));
        System.out.println();

        System.out.println("Quantidade de vezes que cada palavra aparece na lista:");
        Map<String, Integer> quantidade = new TreeMap<>();
        for (String contar : palavras) {
            quantidade.compute(contar, (palavra, vezes) -> vezes == null ? 1 : vezes + 1);
        }
        quantidade.forEach((palavra, vezes) -> System.out.println("'" + palavra + "' aparece " + vezes + " vez(es)."));


        // ATV4
        System.out.println("\n---------- ATV4 ----------\n");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Camiseta", 75.50));
        produtos.add(new Produto("Calça", 119.99));
        produtos.add(new Produto("Calçado", 140));
        produtos.add(new Produto("Camisa social", 98.90));

        System.out.println("Lista de produtos:");
        produtos.forEach(produto -> System.out.println(produto.getNome() + " - R$" + produto.getValor()));

        System.out.println("\nLista de produtos cujo preço é maior que R$100,00:");
        List<Produto> maiorQueCem = produtos.stream()
            .filter(produto -> produto.getValor() >= 100)
            .toList();
        maiorQueCem.forEach(produto -> System.out.println(produto.getNome() + " - R$" + produto.getValor()));


        // ATV5
        System.out.println("\n---------- ATV5 ----------\n");
        Double somaValores = produtos.stream()
            .mapToDouble(produto -> produto.getValor())
            .sum();
        System.out.println("A soma de todos os produtos da lista é de:");
        System.out.println("R$" + somaValores);


        // ATV6
        System.out.println("\n---------- ATV6 ----------\n");
        List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C");
        linguagens.add("JavaScript");
        linguagens.add("Ruby");

        System.out.println("Lista de linguagens:");
        linguagens.forEach(linguagem -> System.out.println("- " + linguagem));

        System.out.println("\nLista ordenada por tamanho:");
        List<String> listaOrdenada = linguagens.stream()
            .sorted((linguagem1, linguagem2) -> Integer.compare(linguagem1.length(), linguagem2.length()))
            .toList();
        listaOrdenada.forEach(linguagem -> System.out.println("- " + linguagem));
        System.out.println("\n--------------------------");
    }

}
