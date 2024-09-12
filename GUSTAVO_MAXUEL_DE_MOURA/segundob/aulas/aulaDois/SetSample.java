package segundob.aulas.aulaDois;
import java.util.Set;
import java.util.HashSet;

public class SetSample {
    public static void main(String[] args) {
        Set<String> nomeSemRepeticao = new HashSet<>();
        nomeSemRepeticao.add("Gustavo");
        nomeSemRepeticao.add("Igor");
        nomeSemRepeticao.add("Adriel");
        for (String nome : nomeSemRepeticao) {
            System.out.println(nome);
            
        }
    }
    
}
