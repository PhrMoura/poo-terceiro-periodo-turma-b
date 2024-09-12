import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class lista1 {

    public static void main(String[] args) {
        

        //Atv 1
        ArrayList<String> amigos = new ArrayList<>();

        amigos.add("Pedro");
        amigos.add("Julio");
        amigos.add("Pipo");
        amigos.add("Paje");
        amigos.add("Igor");

        String eu = "Alison";

        for (String amigo : amigos) {

            System.out.println(eu.charAt(0) + " - " + amigo);

        }


        //Atv 2
        HashSet<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(3);
        conjunto.add(7);
        conjunto.add(4);
        conjunto.add(3);
        conjunto.add(1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero especifico para procurar: ");
        int numProc = scanner.nextInt();

        boolean procNum = conjunto.contains(numProc);

        if (procNum) {

            System.out.println("O conjunto contem o numero: " + numProc);

        } else {

            System.out.println("O conjunto nao contem o numero: " + numProc);

        }


        //Atv 3
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("Dark Souls II");
        jogosZerados.add("Dark Souls II");
        jogosZerados.add("God Off War");
        jogosZerados.add("Tomb Raider");
        jogosZerados.add("Dying Ligth");
        jogosZerados.add("Call of Duty Black Ops II");
        jogosZerados.add("Terraria");
        jogosZerados.add("Terraria");

        removeDuplicado(jogosZerados);
        System.out.println(jogosZerados);


        //Atv 4
        String[] assistidos = {
            "Naruto",
            "Dragon Ball",
            "Solo Leveling",
            "Hunter x Hunter",
            "Tensei Shittara Slime"
        };

        System.out.println("Lista original: ");

        for (String animeFilme : assistidos) {

            System.out.println(animeFilme);

        }

        System.out.println("\nLista ordenada:");
        ordenar(assistidos);


        //Atv 5
        Map<String, String> configuracoes = criarConfiguracoes();

        System.out.println("\nConfigurações do Computador:");
        for (Map.Entry<String, String> entrada : configuracoes.entrySet()) {
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
        }
    }

                 //Atv 3
    public static void removeDuplicado(List<String> jogosZerados) {
        Set<String> jogosUnicos = new HashSet<>(jogosZerados);
        jogosZerados.clear();
        jogosZerados.addAll(jogosUnicos);
    }

                 //Atv 4
    public static void ordenar(String[] array) {
        PriorityQueue<String> filaPrioridade = new PriorityQueue<>();

        for (String elemento : array) {
            filaPrioridade.add(elemento);
        }

        while (!filaPrioridade.isEmpty()) {
            System.out.println(filaPrioridade.poll());
        }
    }

                 //Atv 5
    public static Map<String, String> criarConfiguracoes() {
        Map<String, String> configuracoes = new HashMap<>();
        
        configuracoes.put("Processador", "Xeon 2650 V4");
        configuracoes.put("Placa mãe", "X99 Atermiter");
        configuracoes.put("Placa de vídeo", "RX 580 8GB");
        configuracoes.put("Memória RAM", "16GB da Atermiter");
        configuracoes.put("Fonte de alimentação", "Pure Power 500W");

        return configuracoes;
    }
}
