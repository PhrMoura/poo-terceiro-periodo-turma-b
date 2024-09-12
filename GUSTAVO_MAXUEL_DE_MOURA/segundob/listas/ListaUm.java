//Atv 1
package segundob.listas;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ListaUm {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList();
        listaNomes.add("Igor");   
        listaNomes.add("Pedro");   
        listaNomes.add("Julio");   
        listaNomes.add("Alisson");
        listaNomes.add("Pipo");
        for (String nome : listaNomes) {
            System.out.println(nome.charAt(0) + "-" + nome);
        }
        
        //atv 2
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        
        if (numeros.contains(3)) {
            System.out.println("O conjunto contém o número " + 3);
        }
        
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("Resident Evil 7");
        jogosZerados.add("Resident Evil 4");
        jogosZerados.add("RDB 2"); 
        jogosZerados.add("csgo");
        jogosZerados.add("csgo"); 
        
        //atv 3
        List<String> jogosUnicos = removerDuplicatas(jogosZerados);
        
        System.out.println("Lista de jogos zerados únicos:");
        for (String jogo : jogosUnicos) {
            System.out.println(jogo);
        }
        
        //atv 4 
        List<String> listaFilmes = Arrays.asList("Django Livre", "Homem-arranha longe de casa", "Pulp Fiction", "Ilha do medo", "Seven");
        Collections.sort(listaFilmes);
        for (String filme : listaFilmes) {
            System.out.println(filme);
        }
        
        // atv 5
        Map<String, String> configuracoes = criarConfiguracoesHardware();
        for (Map.Entry<String, String> entry : configuracoes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }   

    public static List<String> removerDuplicatas(List<String> lista) {
        Set<String> conjunto = new HashSet<>(lista);
        List<String> listaUnica = new ArrayList<>(conjunto);
        return listaUnica;
    }

    public static Map<String, String> criarConfiguracoesHardware() {
        Map<String, String> configuracoes = new HashMap<>();
        configuracoes.put("Processador", "i5 7500U");
        configuracoes.put("Memória RAM", "8GB DDR4");
        configuracoes.put("Placa de vídeo", "NVIDIA GeForce GTX 1660 Ti");
        configuracoes.put("Armazenamento", "SSD 512GB");
        configuracoes.put("Monitor", "Dell 24\" Full HD");
        return configuracoes;
    }   
}

