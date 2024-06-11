package segundob.auldaDois;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    //set

    public static void main(String[] args) {
        Set<String> nomesSemRepeticao = new HashSet<>();

        nomesSemRepeticao.add("Julio");
        nomesSemRepeticao.add("Pedro");
        nomesSemRepeticao.add("Gustavo");
        nomesSemRepeticao.add("Higor");
        nomesSemRepeticao.add("Israel");
    
    for (String nome: nomesSemRepeticao){
        System.out.println(nome);
    }
}
}
