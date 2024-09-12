package segundob.Listas.Lista2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        atividadeUm();
        atividadeDois();
        atividadeTres();
        List<Produto> produtos = atividadeQuadro();
        atividadeCinco(produtos, 0);
        atividadeSeis();
    } 

    // Atividade 1
    public static void atividadeUm() {
        List<Integer> num = new ArrayList<>();
        num.add(8);
        num.add(9);
        num.add(11);
        num.add(2);
        num.add(5);
        num.add(22);
        num.add(7);
        num.add(4);

        List<Integer> numPares = num.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Atividade 1: \nOs números pares são:" + numPares);
    }

    // Atividade 2
    public static void atividadeDois() {
        List<String> nomes = new ArrayList<>();
        nomes.add("roberto");
        nomes.add("jose");
        nomes.add("caio");
        nomes.add("vinicius");

        List<String> nomesMaiusculo = nomes.stream()
                .map(nome -> nome.toUpperCase())
                .toList();
        System.out.println("\nAtividade 2: ");
        System.out.println("Números maiúsculos: " + nomesMaiusculo);
    }

    // Atividade 3
    public static void atividadeTres() {
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

        System.out.println("\nAtividade 3: ");
        System.out.println("Lista de palavras: " + palavras + "\n");
        System.out.printf("%-10s | %s%n", "Palavra", "Repetição");
        System.out.println("---------------------");        
        contagemPalavras.forEach((palavra, contagem) -> System.out.printf("%-10s | %d%n", palavra, contagem));
    }
    // Atividade 4
    public static List<Produto> atividadeQuadro(){
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Tilapia", 100));
        produtos.add(new Produto("Arroz", 20.50));
        produtos.add(new Produto("Picanha", 200));
        produtos.add(new Produto("Salmão", 129.99));

        List<Produto> maiorQueCem = produtos.stream()
            .filter(produto -> produto.getPreco() > 100)
            .toList();

            System.out.println("\nAtividade 4: ");
            System.out.println("Produtos maiores que R$100: ");

            maiorQueCem.forEach(produto -> 
            System.out.println(produto.getNome() + ": R$" + produto.getPreco()));
        return produtos;
    }
    //Atividade 5 
    public static void atividadeCinco(List<Produto> produtos, double preco){
        double somaDosProdutos = produtos.stream()
            .mapToDouble(Produto::getPreco)
            .sum();
        System.out.println("\nAtividade 5: ");
        System.out.println("A soma dos produtos da Atividade 4 é: R$" + somaDosProdutos);
    } 
    //Atividade 6 
    public static void atividadeSeis(){
    List<String> linguagem = new ArrayList<>();
    linguagem.add("Java");
    linguagem.add("Phyton");
    linguagem.add("C");
    linguagem.add("JavaScript");
    linguagem.add("Ruby");
    
    linguagem.sort(Comparator.comparingInt(String::length));
    
    System.out.println("\nAtividade 6:");
    System.out.println("Lista de linguagens de programação: ");
    linguagem.forEach(System.out::println);
    }
}
