
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        //ATV 1
        System.out.println("\n");

        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Crysthian");
        nomes.add("Maria");
        nomes.add("Tiago");
        nomes.add("Gislaine");
        nomes.add("Larisa");

        for ( String nome : nomes){
            System.out.println(nome.charAt(0) + " - " + nome);
        }

        //ATV 2
        System.out.println("\n");
        HashSet<Integer> numeros = new HashSet<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(1);

        int numeroEspecifico = 3;


        if (numeros.contains(numeroEspecifico)){
            System.out.println("O conjunto tem o número especifico " + numeroEspecifico);
        }else{
            System.out.println("O conjunto não tem o número especifico.");
        }


        //ATV 3
        System.out.println("\n");

        List <String> jogosZerados = listaJogosZerados();
        List <String> jogosUnicos = listaJogosUnicos(jogosZerados);

        System.out.println("Jogos zerados sem duplicatas");
        for(int i = 0; i < jogosUnicos.size(); i++){
            String jogo = jogosUnicos.get(i);
            System.out.println(jogo);
        }

        //ATV 4
        System.out.println("\n");

        PriorityQueue<String> animesEFilmes = ordemLista();
        while (!animesEFilmes.isEmpty()) {
            System.out.println(animesEFilmes.poll());
        }
        //ATV 5
        System.out.println("\n");

        Map<String, String> configPc = criarConfigPc();
        imprimirConfigPc(configPc);
    }

    public static List<String> listaJogosZerados(){
        ArrayList<String> jogos = new ArrayList<String>();
        jogos.add("The witcher");
        jogos.add("Gta V");
        jogos.add("Mirror 2");
        jogos.add("Papers, please");
        jogos.add("Half life 2");
        jogos.add("Assassins creed 4");
        jogos.add("Gta V");
        return jogos;
        }
        public static List<String> listaJogosUnicos(List<String> jogosZerados){
            return new ArrayList<>(new HashSet<>(jogosZerados));
        }

        public static PriorityQueue<String> ordemLista(){
            PriorityQueue<String> animesEFilmes = new PriorityQueue<>();
            animesEFilmes.add("Bleach");
            animesEFilmes.add("Guerra civil");
            animesEFilmes.add("One Piece");
            animesEFilmes.add("Demon Slayer");
            animesEFilmes.add("Attack on Titan");
            return animesEFilmes;
        }

        public static Map<String, String> criarConfigPc(){
            Map<String, String> hardware = new HashMap<>();
            hardware.put("Processador", "i5 10400f");
            hardware.put("Memória RAM", "16 GB");
            hardware.put("Placa de vídeo", "Radeon RX 6600 XT");
            hardware.put("Disco rígido", "1 TB SSD");
            hardware.put("Placa mãe", "Gigabyte B550M");
            return hardware;
        }

        public static void imprimirConfigPc(Map<String, String> hardware){
            System.out.println("config do pc");
            for(Map.Entry<String, String> entry : hardware.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
}