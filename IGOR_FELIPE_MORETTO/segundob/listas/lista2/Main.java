package segundob.listas.lista2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //Att 1
        List <Integer> num = new ArrayList<>();

        num.add(10);
        num.add(11);
        num.add(18);
        num.add(5);
        num.add(20);
        num.add(28);
        num.add(3);
        num.add(8);

        List <Integer> soPares = num.stream()
        .filter(numero -> numero % 2 == 0)
        .toList();

        soPares.forEach(n -> System.out.println(n));

        System.out.println("-----------------------");

        //Att 2

        List <String> listaNomes = new ArrayList<>();

        listaNomes.add("roberto");
        listaNomes.add("josé");
        listaNomes.add("caio");
        listaNomes.add("vinicius");

        List <String> nomesMaisc = listaNomes.stream()
        .map(nomes -> nomes.toUpperCase())
        .toList();

        nomesMaisc.forEach(nome -> System.out.println(nome));
    }

}
