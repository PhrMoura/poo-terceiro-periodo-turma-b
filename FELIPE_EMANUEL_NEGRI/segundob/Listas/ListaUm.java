package segundob.Listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListaUm {
    public static void main(String[] args) {

        System.out.println("----- Atividade Um -----");
        

        List<String> amigosSala = new ArrayList<String>();

        amigosSala.add("Aquilez");
        amigosSala.add("Enzo");
        amigosSala.add("Bruno");
        amigosSala.add("Maylo");
        amigosSala.add("Brunao");

        for (String colegas : amigosSala) {
            System.out.println(colegas.charAt(0) + " + " + colegas);
        }

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("---- Atividade Dois ----");

        Set<Integer> numerosSemRepetir = new HashSet<>();

        numerosSemRepetir.add(69);
        numerosSemRepetir.add(777);
        numerosSemRepetir.add(69);
        numerosSemRepetir.add(21);

        for (Integer numeros : numerosSemRepetir) {
            System.out.println("Numeros cadastrados: " + numeros);
        }

        int numeroEspecifico = 69;
        
        if (numerosSemRepetir.contains(numeroEspecifico)) {
            System.out.println("Numero Especifico " + numeroEspecifico);
        }

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("---- Atividade Tres ----");

        List<String> jogosZerados = new ArrayList<String>();

        jogosZerados.add("Red Dead Redemption 2");
        jogosZerados.add("Resident Evil 4 Remake");
        jogosZerados.add("GTA 5");
        jogosZerados.add("GTA 5");
        jogosZerados.add("GTA 5");
        jogosZerados.add("God of War 3");
        jogosZerados.add("God of War 3");
        jogosZerados.add("God of War (2018)");
        jogosZerados.add("The Forest");

        Set<String> jogosSemRepeticaoSet = new HashSet<>(jogosZerados);

        List<String> jogosSemRepeticao = new ArrayList<>(jogosSemRepeticaoSet);
        
        System.out.println("Jogos zerados by Prept7K:");
        for (String zerados : jogosSemRepeticao) {
            System.out.println(zerados);
        }

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--- Atividade Quatro ---");

        Queue<String> animesSeriesMidia = new PriorityQueue<>();

        animesSeriesMidia.add("One Piece");
        animesSeriesMidia.add("Code Geass");
        animesSeriesMidia.add("Fullmetal Alchemist");
        animesSeriesMidia.add("Clube da Luta");
        animesSeriesMidia.add("Jujutsu Kaisen");
        animesSeriesMidia.add("Menção Honrosa a Naruto pprt esse anime é o pioneiro dos animes");

        System.out.println("Lista de Animes/Filmes favoritos do Prept7K:");
        animesSeriesMidia.forEach(lista -> System.out.println(lista));
        
        System.out.println("-------------------");

        System.out.println("Lista de Animes/Filmes favoritos do Prept7K em ordem alfabetica:");
        ordemAlfabetica(animesSeriesMidia);
        animesSeriesMidia.forEach(lista -> System.out.println(lista));

        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--- Atividade Cinco  ---");

        Map<String, String> configPc = new HashMap<>();

        configPc.put("Processador", "Ryzen 5 5600");
        configPc.put("Placa de Video", "NVIDIA GTX 1660 SUPER");
        configPc.put("Memoria Ram", "2x TFORCE 8GB 2666mhz");
        configPc.put("Armazenamento", "500GB HD e 250 SSD");
        configPc.put("Placa Mãe", "Mancer a520M-DB (o marea das placa mae)");

        System.out.println("Configurações do PC do prept7K:");

        for (Map.Entry<String, String> entry: configPc.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        

    }

    public static void ordemAlfabetica(Queue<String> lista) {
        PriorityQueue<String> filaPrioridade = new PriorityQueue<>(lista);
        lista.clear();
        lista.addAll(filaPrioridade);
    }
}
