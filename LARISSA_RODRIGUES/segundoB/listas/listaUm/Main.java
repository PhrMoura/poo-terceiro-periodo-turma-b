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
        
        //Atv1
        System.out.println("---------- ATV1----------\n");
        List<String> colegasFavoritos = new ArrayList<>();
        colegasFavoritos.add("Gislaine");
        colegasFavoritos.add("Maria Vitória");
        colegasFavoritos.add("Thiago");
        colegasFavoritos.add("Crysthian");
        colegasFavoritos.add("Enzo");

        System.out.println("Lista de colegas favoritos:");
        for(String nome: colegasFavoritos) {
            System.out.println("L - " + nome);
        }
        

        // Atv2
        System.out.println("\n---------- ATV2----------\n");
        Set<Integer> numerosInteiros = new HashSet<>();
        numerosInteiros.add(16);
        numerosInteiros.add(18);
        numerosInteiros.add(64);
        numerosInteiros.add(102);
        numerosInteiros.add(18);
        numerosInteiros.add(16);
        numerosInteiros.add(64);
        numerosInteiros.add(18);
        
        System.out.println("Números do conjunto:");
        for (Integer numeros : numerosInteiros) {
            System.out.println(numeros);
        }
        
        System.out.println("\nNúmero especifico:");
        Integer numeroEspecifico = 16;
        if (numerosInteiros.contains(numeroEspecifico)) {
            System.out.println(numeroEspecifico + " está no conjunto.");
        } else {
            System.out.println(numeroEspecifico + " não está no conjunto.");
        }
        

        //Atv3
        System.out.println("\n---------- ATV3----------\n");
        Main main = new Main();
        main.jogosZerados();
        

        //Atv4
        System.out.println("\n---------- ATV4----------\n");
        main.ordenarSeries();


        // ATV5
        System.out.println("\n---------- ATV5----------\n");
        main.salvarConfigHardware();
        System.out.println("\n-------------------------\n");

    }


    //Métodos

    //Atv3
    public List<String> jogosSemRepetir(List<String> jogos) {
        Set<String> jogosUnicos = new HashSet<>(jogos);
        return new ArrayList<>(jogosUnicos);
    }

    public void jogosZerados() {
        
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("Minecraft");
        jogosZerados.add("Crash Bandicoot");
        jogosZerados.add("In Sink");
        jogosZerados.add("Resident Evil 4");
        jogosZerados.add("Super Mario World");
        jogosZerados.add("Minecraft");

        System.out.println("Jogos:");
        for(String jogos: jogosZerados) {
            System.out.println(jogos);
        }

        List<String> jogosUnicos = jogosSemRepetir(jogosZerados);
        System.out.println("\nLista de jogos zerados sem repetir:");
        for (String jogoUnico : jogosUnicos) {
            System.out.println(jogoUnico);
        }
    }
    

    //Atv4
    public void ordenarSeries(){

        Queue<String> listaSeries = new PriorityQueue<>();
        listaSeries.add("Shingeki no Kyojin");
        listaSeries.add("Jujutsu Kaisen");
        listaSeries.add("Naruto Shippuden");
        listaSeries.add("Charlotte");
        listaSeries.add("Banana Fish");

        System.out.println("Lista de animes ordenada:");
        while (!listaSeries.isEmpty()) {
            System.out.println(listaSeries.poll());
        }
    }
    

    //Atv5
    public void salvarConfigHardware(){

        Map<String, String> configHardware = new HashMap<>();

        configHardware.put("Processador: ", "i5-10210U");
        configHardware.put("Memória RAM: ", "8GB");
        configHardware.put("Sistema operacional: ", "Windows 11 - 64 bits");
        configHardware.put("Placa de vídeo: ", "Intel(R) UHD Graphics");
        configHardware.put("Modelo do sistema: ", "Aspire A515-54");
        configHardware.entrySet().forEach(kv -> {
            System.out.println(kv.getKey() + kv.getValue());
        });
    }
}