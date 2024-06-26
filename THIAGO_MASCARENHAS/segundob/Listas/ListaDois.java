package segundob.Listas;

import java.util.*;
import java.util.stream.Collectors;

public class ListaDois {

    public static void main(String[] args) {
        // ATV1
        
        List<Integer> numeros = Arrays.asList(15, 24, 33, 55, 38, 16, 71, 49, 75, 100);
        List<Integer> pares = numeros.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println("ATV1 - Números pares: " + pares);

        // ATV2
      
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("ATV2 - Nomes em maiúsculas: " + nomesMaiusculos);

        // ATV3
       
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        Map<String, Long> contagemPalavras = palavras.stream()
                                                     .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("ATV3 - Contagem de palavras: " + contagemPalavras);

        // ATV4
      
        List<Produto> produtos = Arrays.asList(
            new Produto("Controle de PS4", 150.0),
            new Produto("fighter spinner", 50.0),
            new Produto("Teclado Gamer", 200.0),
            new Produto("Mouse pad com luizinha", 80.0)
        );
        List<Produto> produtosCaros = produtos.stream()
                                              .filter(p -> p.getPreco() > 100.0)
                                              .collect(Collectors.toList());
        System.out.println("ATV4 - Produtos com preço > R$ 100,00: " + produtosCaros);

        // ATV5
       
        double somaTotal = produtos.stream()
                                   .mapToDouble(Produto::getPreco)
                                   .sum();
        System.out.println("ATV5 - Soma total dos produtos: R$ " + somaTotal);

        // ATV6
       
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> linguagensOrdenadas = linguagens.stream()
                                                     .sorted(Comparator.comparingInt(String::length))
                                                     .collect(Collectors.toList());
        System.out.println("ATV6 - Linguagens ordenadas pelo tamanho: " + linguagensOrdenadas);
    }

    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "nome='" + nome + '\'' +
                    ", preco=" + preco +
                    '}';
        }
    }
}
//              ANOTAÇÕES PARA ME AJUDAR A MEMORIZAR:

        //ATV1: Filtra os números pares de uma lista usando "filter".
        //ATV2: Converte os nomes para letras maiúsculas usando "map".
        //ATV3: Conta a frequência de cada palavra em uma lista usando "groupingBy" e "counting".