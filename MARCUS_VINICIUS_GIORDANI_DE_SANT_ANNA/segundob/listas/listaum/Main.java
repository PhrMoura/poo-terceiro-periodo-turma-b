package segundob.listas.listaum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // ATV1
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Marcus");
        nomes.add("Guilherme");
        nomes.add("Tayllor");
        nomes.add("Renann");
        nomes.add("Eduardo");

        for (String nome : nomes) {
            System.out.println(nome.charAt(0) + " - " + nome);
        }

        // ATV2
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(10);
        numeros.add(40);
        numeros.add(20);

        int numeroEspecifico = 20;
        System.out.println("Contém " + numeroEspecifico + "? " + numeros.contains(numeroEspecifico));

        // ATV3
        List<String> jogosZerados = Arrays.asList("The Witcher 3", "God of War 1", "God of War 2", "God of War 3", "Minecraft", "The Witcher 3");
        List<String> jogosUnicos = obterJogosUnicos(jogosZerados);
        System.out.println("Jogos únicos: " + jogosUnicos);

        // ATV4
        List<String> melhoresAnimes = Arrays.asList("Hunter x Hunter", "Black Clover", "Classroom of the Elite", "Attack on Titan", "Mob Psycho 100");
        List<String> animesOrdenados = ordenarAnimesFilmes(melhoresAnimes);
        System.out.println("Animes ordenados: " + animesOrdenados);

        // ATV5
        Map<String, String> configuracoesHardware = criarConfiguracoesHardware();
        for (Map.Entry<String, String> entry : configuracoesHardware.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Método para ATV3
    public static List<String> obterJogosUnicos(List<String> jogosZerados) {
        HashSet<String> setJogos = new HashSet<>(jogosZerados);
        return new ArrayList<>(setJogos);
    }

    // Método para ATV4
    public static List<String> ordenarAnimesFilmes(List<String> animesFilmes) {
        PriorityQueue<String> pq = new PriorityQueue<>(animesFilmes);
        List<String> ordenados = new ArrayList<>();
        while (!pq.isEmpty()) {
            ordenados.add(pq.poll());
        }
        return ordenados;
    }

    // Método para ATV5
    public static Map<String, String> criarConfiguracoesHardware() {
        Map<String, String> hardware = new HashMap<>();
        hardware.put("Processador", "i7 12700H");
        hardware.put("Memória RAM", "16GB");
        hardware.put("Placa de Vídeo", "NVIDIA RTX 3060");
        hardware.put("Armazenamento", "SSD 1024GB");
        hardware.put("Placa Mãe", "ASUS Prime B250M-A");
        return hardware;
    }
}

