package segundob.aulas.auladois;

import java.util.HashSet;
import java.util.Set;
public class SetSample {
    public static void main(String[] args) {

        Set <String> nomeSemRepeticao = new HashSet<>();

        nomeSemRepeticao.add("Igor");
        nomeSemRepeticao.add("Gustavo");
        nomeSemRepeticao.add("Neymar");

        for (String nome : nomeSemRepeticao) {
            System.out.println(nome);
        }
    }
}
