package segundob.listas.lista1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;


public class PrimeiraLista {
    public static void main(String[] args) {

        // Atividade 1

        List<String> nomeAlunos = new ArrayList<>();

        nomeAlunos.add("Enzo");
        nomeAlunos.add("Bruno");
        nomeAlunos.add("Aquiles");
        nomeAlunos.add("Felipe");
        nomeAlunos.add("Sandro");

        nomeAlunos.forEach(nome -> System.out.println(nome.charAt(0) + " - "  + nome));

        System.out.println("--------------------------------");

        // Atividade 2

        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(40);
        numeros.add(50);

        numeros.forEach(num -> System.out.println(num));
        
        System.out.println(numeros.contains(30));

        System.out.println("--------------------------------");

        // Atividade 3

        List<String> jogosZerados = new ArrayList<>();

        jogosZerados.add("Stardew Valley");
        jogosZerados.add("Stardew Valley");
        jogosZerados.add("Stardew Valley");
        jogosZerados.add("The Witcher 3");
        jogosZerados.add("Assassin's Creed® Odyssey");
        jogosZerados.add("Assassin's Creed® Odyssey");       
        
        System.out.println("Jogos com Duplicata: ");
        jogosZerados.forEach(jogos -> System.out.println(jogos));

        List<String> jogosUnicos =  new ArrayList<>(obterListaJogosZerados(jogosZerados));

        System.out.println("Jogos sem Duplicata: ");
        jogosUnicos.forEach(jogos -> System.out.println(jogos));

        System.out.println("--------------------------------");

        // Atividade 4

        List<String> animesFavoritos = new ArrayList<>();

        animesFavoritos.add("Sword Art Online");
        animesFavoritos.add("No Game no Life");
        animesFavoritos.add("Demon Slayer");
        animesFavoritos.add("One Piece");
        animesFavoritos.add("Solo Leveling");

        List<String> animesEmOrdemAlfabetica = new ArrayList<>(obterListaAnimesFavoritos(animesFavoritos));

        animesEmOrdemAlfabetica.forEach(anime -> System.out.println(anime));

        System.out.println("--------------------------------");

        // Atividade 5
        
        Map<String, String> hardwareComputador = new HashMap<>();

        hardwareComputador.put("Processador", "Ryzen 7 5700U");
        hardwareComputador.put("Memoria RAM", "8GB DDR4");
        hardwareComputador.put("Placa de Video", "AMD RADEON");
        hardwareComputador.put("Armazenamento", "512GB SSD NVME");
        hardwareComputador.put("Tela", "15,6 Full HD");

        hardwareComputador.forEach((chave, valor) -> System.out.println(chave + ": " + valor));


        
    }

    public static List<String> obterListaJogosZerados (List<String> jogosZerados) {
        
        Set<String> jogosZeradosSemDuplicata = new HashSet<>(jogosZerados);

        // jogosZeradosSemDuplicata.addAll(jogosZerados);

        List<String> jogosSemDuplicata = new ArrayList<>(jogosZeradosSemDuplicata);

        // jogosSemDuplicata.addAll(jogosZeradosSemDuplicata);
        
        return jogosSemDuplicata;
    }

    public static List<String> obterListaAnimesFavoritos (List<String> animesFavoritos) {

        Queue<String> ordenandoAnimes = new PriorityQueue<>(animesFavoritos);

        List<String> animesOrdenados = new ArrayList<>(ordenandoAnimes);

        return animesOrdenados; 
    }
}
