package segundob.listas.lista1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //ATV1
        List <String> listaNomes = new ArrayList<>();

        listaNomes.add("I - ");
        listaNomes.add("Gustavo");
        listaNomes.add("Alison");
        listaNomes.add("Pedrinho");
        listaNomes.add("Julio");
        listaNomes.add("Matheus Pipo");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        System.out.println("-------------------");

        //ATV2
        Set <Integer> numeros = new HashSet<>();

        numeros.add(8);
        numeros.add(12);
        numeros.add(12);
        numeros.add(20);
        numeros.add(20);
        
     
        if (numeros.contains(8)) {
            System.out.println("Contém o número 8");
        }
        else{
            System.out.println("Não contém o número 8");
        }
        System.out.println("-------------------");

        //ATV3
        Set <String> jogos = new HashSet<>();

        jogos.add("GTA San Andreas");
        jogos.add("God Of War II");
        jogos.add("Need For Speed: Underground 2");
        jogos.add("Need For Speed: Underground 2");

        for (String nome : jogos) {
            System.out.println(nome);
        }
        System.out.println("-------------------");

        //ATV4
        Queue <String> listaFilmes = new PriorityQueue<>();

        listaFilmes.add("Naruto");
        listaFilmes.add("Velozes e Furiosos: Desafio em Tóquio");
        listaFilmes.add("Kung Fu Panda");
        listaFilmes.add("Homem de Ferro");
        listaFilmes.add("Gigantes de Aço");
        
        while (!listaFilmes.isEmpty()) {
            System.out.println(listaFilmes.poll());
        }
        System.out.println("-------------------");

        //ATV5
        Map <String, String> hardware = new HashMap<>();
        
        hardware.put("Processador", "i5-10210U");
        hardware.put("Placa Mãe", "B550M");
        hardware.put("Placa de Vídeo", "GTX 1660 TI");
        hardware.put("Fonte", "600w");
        hardware.put("Memória RAM", "16GB");
        
        hardware.entrySet().forEach(kv -> 
        System.out.println(kv.getKey() + ": " + kv.getValue())
        );
    }
}
