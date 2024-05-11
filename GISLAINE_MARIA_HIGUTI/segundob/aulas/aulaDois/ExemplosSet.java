package segundob.aulas.aulaDois;

import java.util.HashSet;
import java.util.Set;

public class ExemplosSet {

    public static void main(String[] args) {
        
    
    Set<String> nomesSemRepeticao = new HashSet<>();

    nomesSemRepeticao.add("Júlio");
    nomesSemRepeticao.add("Pedro");
    nomesSemRepeticao.add("Gustavo");
    nomesSemRepeticao.add("Higor");
    nomesSemRepeticao.add("Israel");
    nomesSemRepeticao.add("Gustavo Serapião");
    nomesSemRepeticao.add("Júlio H.");


    for (String nome : nomesSemRepeticao) {
        System.out.println(nome);
    }
    }
}
