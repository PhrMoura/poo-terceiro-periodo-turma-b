package segundob.listas.lista01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ATV 1 
        atividade01();
        // ATV 2
        atividade02();
        // ATV 3
        atividade03();
        // ATV 4
        atividade04();
        // ATV 5
        atividade05();
    }
    private static void atividade01 () {
        List<String> listaNomes = new ArrayList<String>(
            List.of("Henrique", "Pedro", "Emanual", "Gabriel", "Gustavo")
        );
        listaNomes.forEach(nome -> {
            System.out.println(nome.charAt(0) + " - " + nome);
        });
    }
    private static void atividade02 () {
                // Crie um HashSet de números inteiros e adicione alguns números repetidos. 
        // Verifique se o conjunto contém um número específico e imprima o resultado.
        HashSet<Integer> listanums = new HashSet<Integer>();
        listanums.add(12);
        listanums.add(12);
        System.out.println(listanums); // Adicionado somente uma vez.
        System.out.println(listanums.contains(12)); 
    }
    private static void atividade03 () {
        // Escreva um método que receba uma lista de strings contendo os jogos que você já zerou. 
        // Caso tenha zerado mais de uma vez, adicione o nome do jogo para cada vez. 
        // Após criar a lista de jogos zerados, retorne uma nova lista contendo apenas as strings únicas 
        // (sem duplicatas).
        List<String> listaJogos = List.of("Bloodborne", "Bloodborne", "Lords of the Fallen");
        listaJogos = atividade03RemoverDuplicadas(listaJogos);
        listaJogos.forEach(jogo -> {System.out.println(jogo);});
    }
    private static List<String> atividade03RemoverDuplicadas (List<String> listaJogos) {
        List<String> lista = new ArrayList<String>();
        listaJogos.forEach(jogo -> {
            if (!lista.contains(jogo))  {
                lista.add(jogo);
            }
        });
        return lista;
    }
    private static void atividade04 () {
        // Crie um método que utilize PriorityQueue para ordenar uma lista com o nome dos 
        // cinco melhores animes/filmes que você já viu em ordem alfabética. 
        // Em seguida, imprima a lista ordenada.
        Queue<String> listaFilmes = new PriorityQueue<>();
        listaFilmes.add("Filme");
        listaFilmes.add("A Movie");
        listaFilmes.add("Ze Bear and Ze Man");
        listaFilmes.add("Teste");

        while (!listaFilmes.isEmpty()) {
            System.out.println(listaFilmes.poll());
        }
    }
    private static void atividade05 () {
                // Crie um método que crie uma estrutura que permita salvar as configurações de hardware 
        // da sua máquina, exemplo: "Processador" : "i5 7500U". Faça isso para no mínimo 5 peças e 
        // imprima a peça e seu respectivo valor.
        Map<String, String> map = new HashMap<String, String>();

        System.out.println("Digite 0 caso deseja terminar o processo.");
        
        Boolean input = true;
        Scanner inputScanner = new Scanner(System.in);

        String nmPeca;
        String cfPeca;

        while (input == true) {
            System.out.println("Nome da Peça:");
            nmPeca = inputScanner.nextLine();
            System.out.println("Configurações da Peça:");
            cfPeca = inputScanner.nextLine();
            map.put(nmPeca, cfPeca);
            System.out.println("Se você já adicionou no mínimo 5 peças, digite '0' para parar de adicionar peças");
            System.out.println("senão quiser parar ainda, dígite qualquer outra coisa");
            try { 
                Integer holder = Integer.parseInt(inputScanner.nextLine());
                System.out.println(map.size() >= 5);
                System.out.println(holder == 0);
                if (map.size() >= 5 && holder == 0) { input = false; } 
                else { input = true; }
            }
            catch (Exception e) { 
                System.out.println("Catch");
                input = true; }
        }

        map.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }   
}