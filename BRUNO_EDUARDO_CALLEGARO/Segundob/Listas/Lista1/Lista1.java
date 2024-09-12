import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.HashMap;



@SuppressWarnings("unused")
public class Lista1 {

    public static void main(String[] args) {
        
        //atividade 01
        @SuppressWarnings("unused")
        class Main {
            @SuppressWarnings("unused")
            public static void main(String[] args) {
                ArrayList<String> colegas = new ArrayList<>();
                
                colegas.add("Ana");
                colegas.add("Bruno");
                colegas.add("Carla");
                colegas.add("Daniel");
                colegas.add("Elena");
                
                
                String minhaInicial = "C"; 
                for (String nome : colegas) {
                    System.out.println(minhaInicial + " - " + nome);
                }
            }
        }

            // Atvidade 02

            @SuppressWarnings("unused")
            class HashSetExample {
                public static void main(String[] args) {
                    HashSet<Integer> numeros = new HashSet<>();
                    
                    numeros.add(5);
                    numeros.add(8);
                    numeros.add(5); 
                    numeros.add(10);
                    numeros.add(8); 
                    
                    
                    int numeroEspecifico = 8;
                    if (numeros.contains(numeroEspecifico)) {
                        System.out.println("O conjunto contém o número " + numeroEspecifico);
                    } else {
                        System.out.println("O conjunto não contém o número " + numeroEspecifico);
                    }
                }
            }
                
            
            // Atividade 03
            @SuppressWarnings("unused")
            class UniqueGames {
                public static List<String> obterJogosUnicos(List<String> jogosZerados){
                    HashSet<String> jogosUnicos = new HashSet<>();
                    jogosUnicos.addAll(jogosZerados);
                    List<String> listaJogosUnicos = new ArrayList<>(jogosUnicos);
                    return listaJogosUnicos;
                }
            
                public static void main(String[] args) {
                    List<String> jogosZerados = new ArrayList<>();
                    jogosZerados.add("The Witcher 3");
                    jogosZerados.add("The Legend of Zelda: Breath of the Wild");
                    jogosZerados.add("The Witcher 3"); 
                    jogosZerados.add("Dark Souls");
                    jogosZerados.add("Dark Souls"); 
                    List<String> jogosUnicos = obterJogosUnicos(jogosZerados);
                    System.out.println("Jogos únicos zerados:");
                    for (String jogo : jogosUnicos) {
                        System.out.println(jogo);
                    }
                }
            }

         
            // Atvidade 04
            
            class SortedAnimeMovies {
                public static void main(String[] args) {
                    String[] animesFilmes = {"Death Note", "Spirited Away", "Attack on Titan", "Your Name", "Fullmetal Alchemist: Brotherhood"};
                    PriorityQueue<String> filaPrioritaria = ordenarAnimesFilmes(animesFilmes);
                    System.out.println("Lista dos cinco melhores animes/filmes em ordem alfabética:");
                    while (!filaPrioritaria.isEmpty()) {
                        System.out.println(filaPrioritaria.poll());
                    }
                }
            
                public static PriorityQueue<String> ordenarAnimesFilmes(String[] animesFilmes) {
                    PriorityQueue<String> filaPrioritaria = new PriorityQueue<>();
                    for (String animeFilme : animesFilmes) {
                        filaPrioritaria.offer(animeFilme);
                    }
                    return filaPrioritaria;
                }
            }
            
                    
                    //Atvidade 05
                    class HardwareConfig {
                        public static void main(String[] args) {
                            
                            HashMap<String, String> configuracoesHardware = new HashMap<>();
                            configuracoesHardware.put("Processador", "i5 7500U");
                            configuracoesHardware.put("Memória RAM", "16GB DDR4");
                            configuracoesHardware.put("Placa de Vídeo", "NVIDIA GeForce GTX 1660 Ti");
                            configuracoesHardware.put("Armazenamento", "SSD 512GB");
                            configuracoesHardware.put("Placa Mãe", "ASUS ROG Strix B450-F Gaming");
                            System.out.println("Configurações de Hardware:");
                            for (String peca : configuracoesHardware.keySet()) {
                                String valor = configuracoesHardware.get(peca);
                                System.out.println(peca + " : " + valor);
                            }
                        }
                    }




                
            



    }

    
}
  

