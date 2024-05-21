package segundoB.listas.lista1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class lista1 {

    public static List<String> obterJogos(List<String> jogosZerados) {
        HashSet<String> jogosUnicosSet = new HashSet<>(jogosZerados);

        List<String> jogos = new ArrayList<>(jogosUnicosSet);
        
        return jogos;
    }

    public static void queueAnimes(List<String> listaAnimes) {
        Queue<String> queueAnimes = new LinkedList<>(listaAnimes);
        
        System.out.println("Lista ordenada dos melhores animes:");
        while (!queueAnimes.isEmpty()) {
            System.out.println(queueAnimes.poll());
        }
    }

    public static void configuracoesHardware() {
        Map<String, String> configuracoesHardware = new HashMap<>();
        
        configuracoesHardware.put("Processador", "Intel i5 7500U");
        configuracoesHardware.put("Memória RAM", "8GB DDR4");
        configuracoesHardware.put("Placa de Vídeo", "NVIDIA GTX 1050");
        configuracoesHardware.put("Armazenamento", "SSD 256GB");
        configuracoesHardware.put("Placa Mãe", "ASUS Prime B250M-K");
        
        System.out.println("Configurações:");
        for (Map.Entry<String, String> entry : configuracoesHardware.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Atividade 1

        System.out.println("Atividade 1");

        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Yan");
        listaNomes.add("Israel");
        listaNomes.add("Gustavo Serapião");
        listaNomes.add("Sandro");
        listaNomes.add("Taylor");

        System.out.println("");

        /*Professor, na atividade 1 é pedido "Em seguida, itere sobre a lista e imprima a inicial do seu nome + " - " + cada nome da lista"
        Fiquei deveras confuso, se era o meu nome em si como esta escrito ou o nome de cada pessoa escrita na atividade, então se estiver errado, peço-te perdão.*/
        
        // Seguindo a Inicial de cada nome

        for (String nome : listaNomes) {
            char inicial = nome.charAt(0);
            System.out.println(inicial + "-" + nome);
        }

        System.out.println("");

        // Seguindo a Inicial do meu nome 
        for (String nome : listaNomes) {
            char inicial = 'g';
            System.out.println(inicial + "-" + nome);

        }
        
        System.out.println("");

        // Atividade 2

        System.out.println("Atividade 2\n");

        Set<Integer> numerosInteiros = new HashSet<>();

        numerosInteiros.add(5);
        numerosInteiros.add(1);
        numerosInteiros.add(1);
        numerosInteiros.add(5);
        numerosInteiros.add(2);

        if (numerosInteiros.contains(5)) {
            System.out.println("O número " + 5 + " esta na lista.");
        } else {
            System.out.println("O número " + 5 + " não esta na lista.");
        }

        /*for (Integer numeros : numerosInteiros){
            System.out.println(numeros);
        }*/


        // Atividade 3
        System.out.println("\nAtividade 3 \n");

        ArrayList<String> jogosZerados = new ArrayList<>();

        jogosZerados.add("Minecraft");
        jogosZerados.add("Gta San Andreas");
        jogosZerados.add("Gta 5");
        jogosZerados.add("Eragon (PlayStation 2)");
        jogosZerados.add("Lego Indiana Jones: The Original Adventures");
        jogosZerados.add("Lego Batman The Video Game");

        System.out.println("Jogos únicos zerados: \n");
        for (String jogo : jogosZerados) {
            System.out.println(jogo);
        }

        // atividade 4

        System.out.println("\nAtividade 4\n");

        ArrayList<String> listaAnimes = new ArrayList<>();

        listaAnimes.add("Darling in the Franxx");
        listaAnimes.add("Ano Hi Mita Hana no Namae o Bokutachi wa Mada Shiranai");
        listaAnimes.add("Noragami");
        listaAnimes.add("Plastic Memories");
        listaAnimes.add("EIGHTY-SIX");

        queueAnimes(listaAnimes);

        //Atividade 5

        System.out.println("\nAtividade 5\n");

    }
}   
