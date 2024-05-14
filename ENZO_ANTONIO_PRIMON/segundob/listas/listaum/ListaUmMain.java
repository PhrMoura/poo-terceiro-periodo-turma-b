package segundob.listas.listaum;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashMap;
import java.util.Map;

public class ListaUmMain {
    public static void main(String[] args) {
        // Atividade um
        System.out.println("-----ATIVIDADE 1-----");

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("maylo");
        listaNomes.add("felipe");
        listaNomes.add("aquiles");
        listaNomes.add("bruno");
        listaNomes.add("ricardao");// sempre sera lembrado por nós

        for (String nome : listaNomes) {
            System.out.println("E - " + nome);
        }

        System.out.println("-----Fim-----");

        // Atividade dois

        System.out.println("-----ATIVIDADE 2-----");

        Set<Integer> numerosLegais = new HashSet<>();

        numerosLegais.add(9);
        numerosLegais.add(9);
        numerosLegais.add(19);
        numerosLegais.add(29);
        numerosLegais.add(1);
        numerosLegais.add(2);

        System.out.println(numerosLegais.contains(9));

        System.out.println("-----FIM-----");

        // Atividade tres

        System.out.println("-----ATIVIDADE 3-----");

        List<String> jogosZerados = new ArrayList<>();

        jogosZerados.add("Nier: Automata");
        jogosZerados.add("Nier: Automata");
        jogosZerados.add("Hollow knight");
        jogosZerados.add("Hollow knight");
        jogosZerados.add("The othercide");
        jogosZerados.add("Dark Souls 3");

        List<String> jogosSemCopia = removerCopias(jogosZerados);

        System.out.println("Jogos que ja foram zerados:");

        for (String jogo : jogosSemCopia) {
            System.out.println(jogo);
        }

        System.out.println("-----FIM-----");

        // Atividade quatro

        System.out.println("-----ATIVIDADE 4-----");

        Queue<String> topFilmes = new PriorityQueue<>();

        topFilmes.add("Evagelion 3.0 + 1.0: Thrice upon a time");// literalmente o melhor final de evangelion, meu caro
                                                                 // sandrolaax
        topFilmes.add("Konosuba");
        topFilmes.add("Frieren");
        topFilmes.add("Mushoku Tensei");// tem umas parada meio paia mas depois compensa demais pqp bom pra cacilda

        topFilmes.forEach(filme -> System.out.println(filme));

        System.out.println("-----FIM-----");

        // Atividade cinco

        System.out.println("-----ATIVIDADE 5-----");
        
        configuracoesHardware();

        System.out.println("-----FIM-----");
    }

    public static List<String> removerCopias(List<String> lista) {

        HashSet<String> conjunto = new HashSet<>(lista);

        List<String> listaUnica = new ArrayList<>(conjunto);

        return listaUnica;
    }

    public static void configuracoesHardware() {
        Map<String, String> hardware = new HashMap<>();

        hardware.put("Processador", "i5 8400");
        hardware.put("Placa de vídeo", "GTX 1050ti");
        hardware.put("SSd", "Nvme 240GB");
        hardware.put("HDD", "Sata 3 1TB");
        hardware.put("Memória RAM", "16GB 2400Mhz");

        hardware.entrySet().forEach(kv ->{ System.out.println(kv.getKey() + "-" + kv.getValue());
    });
    }
}
