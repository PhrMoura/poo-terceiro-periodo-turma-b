
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Ana");
        colegas.add("Bruno");
        colegas.add("Carla");
        colegas.add("Diego");
        colegas.add("Eva");
        
        System.out.println("Atividade 1:");
        for (String nome : colegas) {
            System.out.println(nome.charAt(0) + " - " + nome);
        }
        
     
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2); 
        
        int numeroVerificar = 3;
        System.out.println("\nAtividade 2:");
        if (numeros.contains(numeroVerificar)) {
            System.out.println("O conjunto contém o número " + numeroVerificar);
        } else {
            System.out.println("O conjunto não contém o número " + numeroVerificar);
        }
        
       
        ArrayList<String> jogos = new ArrayList<>();
        jogos.add("The Witcher 3");
        jogos.add("The Witcher 3");
        jogos.add("Dark Souls");
        jogos.add("Dark Souls");
        jogos.add("Skyrim");
        
        System.out.println("\nAtividade 3:");
        ArrayList<String> jogosUnicos = obterJogosUnicos(jogos);
        System.out.println("Jogos únicos: " + jogosUnicos);
        
       
        PriorityQueue<String> animesFilmes = new PriorityQueue<>();
        animesFilmes.add("Your Name");
        animesFilmes.add("Attack on Titan");
        animesFilmes.add("Spirited Away");
        animesFilmes.add("Naruto");
        animesFilmes.add("One Piece");
        
        System.out.println("\nAtividade 4:");
        while (!animesFilmes.isEmpty()) {
            System.out.println(animesFilmes.poll());
        }
        
        
        HashMap<String, String> hardware = new HashMap<>();
        hardware.put("Processador", "i5 7500U");
        hardware.put("Placa de vídeo", "GTX 1660");
        hardware.put("Memória RAM", "16GB DDR4");
        hardware.put("Armazenamento", "SSD 500GB");
        hardware.put("Placa mãe", "ASUS B450");
        
        System.out.println("\nAtividade 5:");
        for (Map.Entry<String, String> entry : hardware.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
    
    public static ArrayList<String> obterJogosUnicos(ArrayList<String> jogos) {
        HashSet<String> set = new HashSet<>(jogos);
        return new ArrayList<>(set);
    }
}
