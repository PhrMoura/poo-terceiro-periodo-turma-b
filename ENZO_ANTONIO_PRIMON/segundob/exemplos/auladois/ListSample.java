package segundob.exemplos.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();
        String aquiles = "aquiles";

        listaNomes.add("maylo");
        listaNomes.add("felipe");
        listaNomes.add(aquiles);
        listaNomes.add("bruno");
        listaNomes.add("maylo");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        System.out.println("-------------");

        System.out.println(listaNomes.get(2));

        System.out.println("-------------");

        listaNomes.remove(aquiles);
        System.out.println(listaNomes.get(2));

        System.out.println("-----------");

        listaNomes.forEach(nome -> System.out.println(nome));

        System.out.println("-----------");

        listaNomes.removeIf(nome -> nome.contains("i"));

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        listaNomes.clear();
    }
}
