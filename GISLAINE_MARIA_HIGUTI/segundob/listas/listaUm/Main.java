package segundob.listas.listaUm;

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
        
        //Atividade 1

        List<String> colegasQueridos = new ArrayList<>();

        colegasQueridos.add("Thiago");
        colegasQueridos.add("Larissa");
        colegasQueridos.add("Crysthian");
        colegasQueridos.add("Maria");
        colegasQueridos.add("Enzo");

        for(String nome: colegasQueridos) {
            System.out.println("G - " + nome);
        }

        System.out.println("-------------------");
        
        //Atividade 2
        
        Set<Integer> numerosInteiros = new HashSet<>();
        
        numerosInteiros.add(44);
        numerosInteiros.add(3);
        numerosInteiros.add(4);
        numerosInteiros.add(16);
        numerosInteiros.add(44);
        numerosInteiros.add(3);
        numerosInteiros.add(16);
        numerosInteiros.add(44);
        
        System.out.println("Números do Conjunto");
        for (Integer numeros : numerosInteiros) {
            System.out.println(numeros);
        }
        
        System.out.println("\nNúmero Especifico");
        
        Integer numeroEspecifico = 44;
        if (numerosInteiros.contains(numeroEspecifico)) {
            System.out.println(numeroEspecifico + " está no conjunto.");
        } else {
            System.out.println(numeroEspecifico + " não está no conjunto.");
        }
        
        System.out.println("-------------------");
        
        //Atividade 3
        
        Main main = new Main();
        main.jogosZerados();
        
        System.out.println("-------------------");
        
        //Atividade 4
        
        main.ordenarSeries();
        
        System.out.println("-------------------");

        //Atividade 5

        main.salvarConfigHardware();

    }

    //Atividade 3 - Métodos

    public List<String> jogosSemRepetir(List<String> jogos) {
        Set<String> jogosUnicos = new HashSet<>(jogos);
        return new ArrayList<>(jogosUnicos);
    }

    public void jogosZerados() {
        
        List<String> jogosQueZerei = new ArrayList<>();

        jogosQueZerei.add("GTA San Andreas");
        jogosQueZerei.add("GTA V");
        jogosQueZerei.add("GTA V");
        jogosQueZerei.add("Minecraft");
        jogosQueZerei.add("Stardew Valley");
        jogosQueZerei.add("The Forest");
        jogosQueZerei.add("The Forest");
        jogosQueZerei.add("It Takes Two");

        System.out.println("Jogos da Lista");
        for(String jogos: jogosQueZerei) {
            System.out.println(jogos);
        }

        List<String> jogosUnicos = jogosSemRepetir(jogosQueZerei);
        
        System.out.println("\nLista de jogos zerados sem repetir");
        for (String jogoUnico : jogosUnicos) {
            System.out.println(jogoUnico);
        }
    }
    
    //Atividade 4
    public void ordenarSeries(){
        Queue<String> listaSeries = new PriorityQueue<>();

            listaSeries.add("House Of Dragons");
            listaSeries.add("The Good Place");
            listaSeries.add("Doctor House");
            listaSeries.add("Disenchantment");
            listaSeries.add("Game Of Thrones");

            System.out.println("Lista de séries ordenada:");
            while (!listaSeries.isEmpty()) {
                System.out.println(listaSeries.poll());
            }
        }
    
    //Atividade 5

    public void salvarConfigHardware(){

        Map<String, String> configHardware = new HashMap<>();

        configHardware.put("Processador: ", "i5-11400");
        configHardware.put("Memória Ram: ", "DDR4 - 16GB");
        configHardware.put("Armazenamento: ", "SSD - 256GB");
        configHardware.put("Placa de Vídeo: ", "GTX 1660");
        configHardware.put("Placa Mãe: ", "H510M");

        configHardware.entrySet().forEach(kv -> {
            System.out.println(kv.getKey() + kv.getValue());
        });

    }

}