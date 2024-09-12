package segundob.aulas.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {
        
        List <String> listaNomes = new ArrayList<>();

        listaNomes.add("Igor");
        listaNomes.add("Gustavo");
        listaNomes.add("Neymar");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        System.out.println("------------");
        listaNomes.remove(1);
        //System.out.println(listaNomes.get(0));

        listaNomes.removeIf(nome -> nome.contains("u"));
        listaNomes.forEach(nome -> System.out.println(nome));

        //-----------------------

        
        
    }
    
    
}
