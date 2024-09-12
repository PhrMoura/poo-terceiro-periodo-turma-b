package segundob.listas.listaUm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public class Main {

    // ATV3 ------------------------------------------

    public static List<String> receberLista(List<String> listaJogos) {

        HashSet<String> stringsUnicas = new HashSet<>(listaJogos);
        return new ArrayList<>(stringsUnicas);
    }

    // ATV4 ------------------------------------------

    public static void ordenarAnimes(List<String> listaAnimes) {
        PriorityQueue<String> fila = new PriorityQueue<>(listaAnimes);
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }

    // ATV5 ------------------------------------------

    public static void salvarHardware(Map<String, String> listaHardware) {
        for (Map.Entry<String, String> lista : listaHardware.entrySet()) {
            System.out.println(lista.getKey() + ": " + lista.getValue());
        }
    }

    public static void main(String[] args) {

        // ATV1 ------------------------------------------

        ArrayList<String> listaColegas = new ArrayList<>();

        listaColegas.add("Yan");
        listaColegas.add("Gustavo");
        listaColegas.add("Israel");
        listaColegas.add("Ronaldo");
        listaColegas.add("Vinicius");

        System.out.println("\nAtividade 1:");

        for (String lista : listaColegas) {
            String inicialEu = "I";
            System.out.println(inicialEu + "-" + lista);
        }

        System.out.println("----------------------------");

        for (String lista : listaColegas) {
            char inicialPessoa = lista.charAt(0);
            System.out.println(inicialPessoa + "-" + lista);
        }

        // ATV2 ------------------------------------------

        HashSet<Integer> listaNumeros = new HashSet<>();

        listaNumeros.add(7);
        listaNumeros.add(2);
        listaNumeros.add(7);
        listaNumeros.add(3);
        listaNumeros.add(2);
        listaNumeros.add(1);

        System.out.println("\nAtividade 2:");

        if (listaNumeros.contains(3)) {
            System.out.println("Na lista de números contém o número 3\n");
        } else {
            System.out.println("Nenhum número específico encontrado\n");
        }

        for (Integer lista : listaNumeros) {
            System.out.println("Lista:" + lista);
        }

        // ATV3 ------------------------------------------

        ArrayList<String> listaJogos = new ArrayList<>();

        listaJogos.add("God of War 2");
        listaJogos.add("Dante's Inferno");
        listaJogos.add("Resident Evil 4");
        listaJogos.add("God of War 2");
        listaJogos.add("Terraria");
        listaJogos.add("King of Fighters");
        listaJogos.add("Mario Kart");
        listaJogos.add("Terraria");

        List<String> stringsUnicas = receberLista(listaJogos);

        System.out.println("\nAtividade 3:");
        for (String lista : stringsUnicas) {
            System.out.println(lista);
        }

        // ATV4 ------------------------------------------

        ArrayList<String> listaAnimes = new ArrayList<>();

        listaAnimes.add("Steins;Gate");
        listaAnimes.add("Kimi no Na wa");
        listaAnimes.add("Vivy: Fluorite Eye's Song");
        listaAnimes.add("Sword Art Online");
        listaAnimes.add("Made in Abyss");
        listaAnimes.add("Vinland Saga");
        listaAnimes.add("Re:Zero");

        System.out.println("\nAtividade 4:");
        ordenarAnimes(listaAnimes);

        // ATV5 ------------------------------------------

        Map<String, String> listaHardware = new HashMap<>();

        listaHardware.put("Processador", "Intel Core i9");
        listaHardware.put("Placa Mãe", "Gigabyte B760M Aorus Elite");
        listaHardware.put("Memória", "DDR5 XPG Lancer RGB 16GB");
        listaHardware.put("Placa de Vídeo", "Asus TUF Gaming NVIDIA GeForce RTX 4090");
        listaHardware.put("SSD", "Kingston NV2, 4TB");
        listaHardware.put("Fonte", "XPG Kyber SuperFrame");
        listaHardware.put("Water Cooler", "SuperFrame ISENGARD");

        System.out.println("\nAtividade 5:");
        salvarHardware(listaHardware);
    }
}
