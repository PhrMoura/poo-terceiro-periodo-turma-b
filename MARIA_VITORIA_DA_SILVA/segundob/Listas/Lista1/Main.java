package segundob.Listas.Lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        atividadeUm();
        atividadeDois();
        atividadeTres();
        atividadeQuatro();
        atividadeCinco();
    }

    // atv1
    public static void atividadeUm() {
        List<String> listaNomes = new ArrayList<>();
        System.out.println("Atividade 1: ");
        listaNomes.add("Larissa");
        listaNomes.add("Gislaine");
        listaNomes.add("Thiago");
        listaNomes.add("Crysthian");
        listaNomes.add("Leonardo Merlini");

        char meuNome = 'M';

        for (String nome : listaNomes) {
            System.out.println(meuNome + " - " + nome);
        }
        System.err.println("\n");
    }

    // atv2
    public static void atividadeDois() {
        Set<Integer> numerosInteiros = new HashSet<>();
        System.out.println("Atividade 2: ");
        numerosInteiros.add(12);
        numerosInteiros.add(5);
        numerosInteiros.add(12);
        numerosInteiros.add(5);
        numerosInteiros.add(89);
        numerosInteiros.add(23);

        int numeroEspecifico = 89;

        for (int numero : numerosInteiros) {
            System.out.println(numero);
        }

        if (numerosInteiros.contains(numeroEspecifico)) {
            System.out.println("O número " + numeroEspecifico + " está na lista.");
        } else {
            System.out.println("O número " + numeroEspecifico + " não está na lista.");
        }
        System.err.println("\n");
    }

    // atv3
    public static void atividadeTres() {
        List<String> jogosZerados = new ArrayList<>();
        System.out.println("Atividade 3: ");
        jogosZerados.add("Uncharted 4 A Thiefs End");
        jogosZerados.add("Uncharted 4 A Thiefs End");
        jogosZerados.add("Minecraft");
        jogosZerados.add("Gta V");
        jogosZerados.add("Gta San Andreas");
        jogosZerados.add("Gta San Andreas");
        jogosZerados.add("Gta San Andreas");
        jogosZerados.add("Spiritfarer");

        List<String> jogosSemRepeticao = jogosUnicos(jogosZerados);
        for (String jogo : jogosSemRepeticao) {
            System.out.println(jogo);
        }
    }

    public static List<String> jogosUnicos(List<String> jogos) {
        List<String> jogosSemRepeticao = new ArrayList<>();
        for (String jogo : jogos) {
            if (!jogosSemRepeticao.contains(jogo)) {
                jogosSemRepeticao.add(jogo);
            }
        }
        return jogosSemRepeticao;
    }

    // atv4
    public static void atividadeQuatro() {
        Map<String, String> hardware = new HashMap<>();
        System.err.println("\n");
        System.out.println("Atividade 4: ");
        hardware.put("Processador", "I7 4810MQ");
        hardware.put("Memória RAM", "16GB");
        hardware.put("Armazenamento SSD", "440GB");
        hardware.put("Placa de Vídeo", "NVIDIA GeForce GTX 860M");
        hardware.put("Placa Mãe", "ASUS PRIME B250M-A");

        for (String chave : hardware.keySet()) {
            System.out.println(chave + ": " + hardware.get(chave));
        }
        System.err.println("\n");
    }

    // atv5
    public static void atividadeCinco() {
        Map<String, String> hardware = new HashMap<>();
        System.out.println("Atividade 5: ");
        hardware.put("Processador", "I7 4810MQ");
        hardware.put("Memória RAM", "16GB");
        hardware.put("Armazenamento SSD", "440GB");
        hardware.put("Placa de Vídeo", "NVIDIA GeForce GTX 860M");
        hardware.put("Placa Mãe", "ASUS PRIME B250M-A");

        for (String chave : hardware.keySet()) {
            System.out.println(chave + ": " + hardware.get(chave));
        }
        System.err.println("\n");
    }
}
