package segundob.listas.lista02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // atividade01();
        // atividade02();
        // atividade03();
        // atividade04();
        // atividade05();
        atividade06();
    }
    private static void atividade01 () {
        // Escreva um programa que receba uma lista de números inteiros e retorne uma lista 
        // contendo apenas os números pares usando a Stream API. A lista deve ter ao menos 8 números.
        List<Integer> listaInteiros = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> listaSomentePares = listaInteiros.stream().filter(inteiro -> inteiro % 2 == 0).toList();
        listaSomentePares.forEach(item -> {
            System.err.println(item);
        });
    }
    private static void atividade02 () {
        // Dada a seguinte lista de nomes("roberto", "josé", "caio", "vinicius"), escreva um 
        // programa que converta todos os nomes para letras maiúsculas usando a Stream API.
        List<String> listaNomes = List.of("roberto", "josé", "caio", "vinicius");
        List<String> listaNomesMaiusculos = listaNomes.stream().map(item -> item.toUpperCase()).toList();
        listaNomesMaiusculos.forEach(item -> {
            System.err.println(item);
        });
    }
    private static void atividade03 () {
        // Atv3 - Crie um programa que conte quantas vezes cada palavra única aparece em uma 
        //  lista de strings. Utilize a Stream API para processar os dados. 
        // Lista de palavras("se", "talvez", "hoje" "sábado", "se", "quarta", "sábado")
        List<String> listaPalavras = List.of("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        Map<String, Integer> mapQtd = new HashMap<String, Integer>();
        listaPalavras.stream().distinct().forEach(key -> {
            Integer qtd = listaPalavras.stream().filter(og -> og == key).toList().size();
            mapQtd.put(key, qtd);
        });
        mapQtd.forEach((k, v) -> {
            System.err.println(k + ": " + v);
        });
        
    }
    private static void atividade04 () {
        // Atv4 - Crie uma Classe Produto, ela possui os atributos nome e preço. Crie uma 
        // lista com 4 objetos do tipo Produto, pode definir os valores diretamente no 
        // código("hard coded"). Escreva um programa que filtre os produtos cujo preço seja maior 
        // que R$ 100,00 utilizando a Stream API.
        Produto produto1 = new Produto("1", 10.00);
        Produto produto2 = new Produto("2", 97.00);
        Produto produto3 = new Produto("3", 150.00);
        Produto produto4 = new Produto("4", 370.00);
        List<Produto> listaProdutos = List.of(produto1, produto2, produto3, produto4);
        List<Produto> maisBaratosQue100 = listaProdutos.stream().filter(produto -> {
            return produto.preco < 100;
        }).toList();
        maisBaratosQue100.forEach(produto -> produto.print());

    }
    private static void atividade05 () {
        // Atv5 - Realize a soma do valor total dos Produtos que estão na lista de 
        // produtos criados na atv4, realize essa soma utilizando Stream API.
        Produto produto1 = new Produto("1", 10.00);
        Produto produto2 = new Produto("2", 97.00);
        Produto produto3 = new Produto("3", 150.00);
        Produto produto4 = new Produto("4", 370.00);
        List<Produto> listaProdutos = List.of(produto1, produto2, produto3, produto4);
        Double total = listaProdutos.stream()
            .map(item -> item.preco)
            .reduce(0.0, (a,b) -> a+b);
        System.err.println(total);
    }
    private static void atividade06 () {
        // Atv6- Dada a lista("Java", "Python", "C", "JavaScript", "Ruby"), ordene a 
        // mesma conforme o tamanho da palavra, da menor para a maior, utilizando a Stream API.
        List<String> lista = List.of("Java", "Python", "C", "JavaScript", "Ruby");
        lista.stream()
            .sorted((item1, item2) -> { 
                return Integer.compare(item1.length(), item2.length());
            }).forEach(item -> {
                System.err.println(item);
            });;
    }
}


class Produto {
    public String nome;
    public Double preco;
    public Produto(String name, Double value) {
        nome = name;
        preco = value;
    }
    public void print () { System.err.println(nome + ": " + preco); }
}
