package segundob;

import java.util.*;

public class main {
    public static void main(String[] args) {
                // ATV1
        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Ana");
        colegas.add("Bruno");
        colegas.add("Carla");
        colegas.add("Daniel");
        colegas.add("Eva");

        System.out.println("ATV1:");
        for (String nome : colegas) {
            System.out.println(nome.charAt(0) + " - " + nome);
        }
        System.out.println();

        // ATV2
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(3); 

        int numeroVerificar = 5;
        System.out.println("ATV2:");
        System.out.println("Contém o número " + numeroVerificar + "? " + numeros.contains(numeroVerificar));
        System.out.println();

        // ATV3
        ArrayList<String> jogos = new ArrayList<>();
        jogos.add("The Witcher 3");
        jogos.add("Skyrim");
        jogos.add("The Witcher 3"); 
        jogos.add("Dark Souls");
        jogos.add("Dark Souls");

        System.out.println("ATV3:");
        System.out.println("Lista de jogos zerados: " + jogos);
        System.out.println("Lista de jogos únicos zerados: " + removerDuplicatas(jogos));
        System.out.println();

        // ATV4
        PriorityQueue<String> animesFilmes = new PriorityQueue<>();
        animesFilmes.add("Death Note");
        animesFilmes.add("Attack on Titan");
        animesFilmes.add("Spirited Away");
        animesFilmes.add("Your Name");
        animesFilmes.add("Naruto");

        System.out.println("ATV4:");
        System.out.println("Lista de animes/filmes ordenados:");
        while (!animesFilmes.isEmpty()) {
            System.out.println(animesFilmes.poll());
        }
        System.out.println();

        // ATV5
        HashMap<String, String> hardware = new HashMap<>();
        hardware.put("Processador", "i5 7500U");
        hardware.put("Placa de vídeo", "GTX 1660");
        hardware.put("Memória RAM", "16GB DDR4");
        hardware.put("Armazenamento", "SSD 500GB");
        hardware.put("Placa-mãe", "Asus Prime B450M");

        System.out.println("ATV5:");
        System.out.println("Configurações de hardware:");
        for (Map.Entry<String, String> entry : hardware.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static ArrayList<String> removerDuplicatas(ArrayList<String> lista) {
        HashSet<String> set = new HashSet<>(lista);
        return new ArrayList<>(set);
    }
}
