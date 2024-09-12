package segundob.Aulas.auladois;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    
    public static void main(String[] args) {
        
        Set<String> nomesSemRepeticao = new HashSet<>();

        nomesSemRepeticao.add("Sara amori");
        nomesSemRepeticao.add("Sara amori");

        System.out.println(nomesSemRepeticao);

    }

}
