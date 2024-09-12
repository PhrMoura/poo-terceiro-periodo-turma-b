package segundob.examples;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    
    public static void main(String[] args) {
        
        Set<String> nomes = new HashSet<>();

        nomes.add("Marcus");
        nomes.add("Flavio");
        nomes.add("Marcus");
        nomes.add("Eduarda");

        nomes.remove("Eduarda");

        nomes.removeIf(nome -> nome.contains("F"));

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
