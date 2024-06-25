package segundob.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListSample {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<Pessoa> pessoasDB = new ArrayList<>();
        String nomeS = "Marcus";

        nomes.add("Marcus");
        nomes.add("João");
        nomes.add("Gabrielli");
        nomes.add("Roberta");

        // nomes.remove(0);

        nomes.remove(nomeS);

        System.out.println(nomes.get(1));

        for (String nome : nomes) {
            System.out.println(nome);
        }

        LinkedList<String> nomesLigados = new LinkedList<>();
        nomesLigados.add("Marcus");
        nomesLigados.add("João");
        nomesLigados.add("Gabrielli");
        nomesLigados.add("Roberta");
     
        System.out.println(nomesLigados.getFirst());
        System.out.println(nomesLigados.getLast());

        CopyOnWriteArrayList<String> nomesThreadSafe = new CopyOnWriteArrayList<>();

        List<String> nomesa = new Vector<>();

    }

}
