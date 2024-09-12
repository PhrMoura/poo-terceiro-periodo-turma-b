package segundob.aulas.auladois;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

    public static void main(String[] args) {

        // Criando set
        Set<String> nomesSemRepeticao = new HashSet<>();

        // Adicionando elementos
        nomesSemRepeticao.add("Júlio");
        nomesSemRepeticao.add("Pedro");
        nomesSemRepeticao.add("Gustavo");
        nomesSemRepeticao.add("Igor");
        nomesSemRepeticao.add("Israel");
        nomesSemRepeticao.add("Gustavo Serapião");
        nomesSemRepeticao.add("Júlio");

        // Iterando no Set
        for (String nome : nomesSemRepeticao) {
            System.out.println(nome);
        }

    }

}
