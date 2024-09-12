package segundob.Listas;
import java.util.*;

public class ListaUm {
    public static void main(String[] args) {
        // ATV1
        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Gislaine");
        colegas.add("Maria");
        colegas.add("Cristian");
        colegas.add("Larissa");
        colegas.add("Enzo");

        System.out.println("At  ividade1:");
        for (String nome : colegas) {
            System.out.println(nome.charAt(0) + " - " + nome);
        }

        System.out.println("---------------");

        // ATV2
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(5); // número repetido

        int numeroVerificar = 10;
        System.out.println("\nATV2:");
        System.out.println("Contém o número " + numeroVerificar + "? " + numeros.contains(numeroVerificar));

        System.out.println("---------------");

        // ATV3
        ArrayList<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("The Last of Us");
        jogosZerados.add("The Last of US 2");
        jogosZerados.add("Naruto Shippuden: Ultimate Ninja Storm 4");
        jogosZerados.add("Read Dead Redeption 2");
        jogosZerados.add("The Last of Us");

        System.out.println("\nATV3:");
        System.out.println("Lista de jogos zerados: " + jogosZerados);
        System.out.println("Lista de jogos únicos: " + removerDuplicatas(jogosZerados));

        System.out.println("---------------");

        // ATV4
        PriorityQueue<String> animesFilmes = new PriorityQueue<>();
        animesFilmes.add("Naruto");
        animesFilmes.add("Dragon ball Z");
        animesFilmes.add("Attack on Titan");
        animesFilmes.add("Hunter x Hunter");
        animesFilmes.add("Death Note");
        animesFilmes.add("Interestelar");

        System.out.println("\nATV4:");
        System.out.println("Lista ordenada de melhores animes/filmes:");
        while (!animesFilmes.isEmpty()) {
            System.out.println(animesFilmes.poll());
        }

        System.out.println("---------------");
        
        // ATV5
        HashMap<String, String> configuracoesHardware = new HashMap<>();
        configuracoesHardware.put("Processador", "i5 1100U");
        configuracoesHardware.put("Memória RAM", "16GB DDR4");
        configuracoesHardware.put("Placa de vídeo", "NVIDIA RTX 3060 Ti");
        configuracoesHardware.put("Armazenamento", "SSD 512GB");
        configuracoesHardware.put("Monitor", "27\" 144Hz");

        System.out.println("\nATV5:");
        System.out.println("Configurações de hardware:");
        for (Map.Entry<String, String> entry : configuracoesHardware.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static ArrayList<String> removerDuplicatas(ArrayList<String> lista) {
        return new ArrayList<>(new HashSet<>(lista));
    }
}