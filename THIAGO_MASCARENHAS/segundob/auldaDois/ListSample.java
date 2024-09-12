package segundob.auldaDois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        
        nomesSemRepeticao.add("Julio");
        nomesSemRepeticao.add("Pedro");
        nomesSemRepeticao.add("Gustavo Serapião");
        nomesSemRepeticao.add("Higor");
        nomesSemRepeticao.add("Israel");
        nomesSemRepeticao.add("Julio");

        for (String nome : listaNome){
            System.out.println(nome);
        }
        System.out.println("-----------\n");
        System.out.println(listaNomes.get(2));

        System.out.println();
        listaNomes.remove(0)
        System.out.println(listaNomes.get(2));

        listaNomes.removeIf(nome => nome.contains("i"))
    }
}
