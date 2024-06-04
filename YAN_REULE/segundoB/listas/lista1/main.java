package segundoB.listas.lista1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
        // atv1===============================================
        ArrayList<String> colegas = new ArrayList<>();

        colegas.add("Gustavo");
        colegas.add("Israel");
        colegas.add("Gus Tavo Matabeck");
        colegas.add("Galdino");
        colegas.add("Danylo");

        for (String nome : colegas) {
            System.out.println("Y - " + nome);
        }
        // ==================================================

        // atv2==============================================
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(8);
        numeros.add(5);
        numeros.add(10);
        numeros.add(8);

        int numeroEspecifico = 8;
        boolean contemNumeroEspecifico = numeros.contains(numeroEspecifico);

        System.out.println("O conjunto contém o número " + numeroEspecifico + "? " + contemNumeroEspecifico);
        // ==================================================

        // atv3
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("Crash of the titans");
        jogosZerados.add("Crash of the titans");
        jogosZerados.add("GTA V");
        jogosZerados.add("Crash of the titans");
        jogosZerados.add("Minecraft");

        List<String> jogosUnicos = removerDuplicatas(jogosZerados);

        System.out.println("Lista de jogos zerados únicos:");
        for (String jogo : jogosUnicos) {
            System.out.println(jogo);
        }
        // ==================================================

        // atv4
        String[] melhoresAnimesFilmes = { "Death Note", "Attack on Titan", "Demon Slayer", "Mirai Nikki",
                "Re-Zero" };

        ordenarEImprimir(melhoresAnimesFilmes);
        // ==================================================

        // atv5
        imprimirConfiguracoesHardware();
        // ===================================================
    }

    public static List<String> removerDuplicatas(List<String> lista) {
        HashSet<String> jogosUnicosSet = new HashSet<>(lista);

        List<String> jogosUnicos = new ArrayList<>(jogosUnicosSet);
        return jogosUnicos;
    }

    public static void ordenarEImprimir(String[] lista) {
        PriorityQueue<String> filaPrioritaria = new PriorityQueue<>();

        for (String nome : lista) {
            filaPrioritaria.offer(nome);
        }

        System.out.println("Os cinco melhores animes/filmes em ordem alfabética:");
        while (!filaPrioritaria.isEmpty()) {
            System.out.println(filaPrioritaria.poll());
        }
    }

    public static void imprimirConfiguracoesHardware() {
        Map<String, String> configuracoesHardware = new HashMap<>();

        configuracoesHardware.put("R5 3500X", "800");
        configuracoesHardware.put("16GB DDR4", "600");
        configuracoesHardware.put("NVIDIA GeForce GTX 1660", "1800");
        configuracoesHardware.put("SSDNVME 512GB", "600");
        configuracoesHardware.put("Aorus B450 pro", "1000");

        System.out.println("Configurações de hardware da máquina:");
        for (Map.Entry<String, String> entry : configuracoesHardware.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
