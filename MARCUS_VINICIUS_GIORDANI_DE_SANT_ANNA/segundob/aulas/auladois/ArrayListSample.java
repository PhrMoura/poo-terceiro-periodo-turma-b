package segundob.aulas.auladois;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

        public static void main(String[] args) {
        
        List<String> listaNomes = new ArrayList<>();
            String gusta = "Gustavo";

        listaNomes.add("Julio");
        listaNomes.add("Pedro");
        listaNomes.add(gusta);
        listaNomes.add("Igor");
        listaNomes.add("Israel");
        listaNomes.add("Gustavo Serapião");
        
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        System.out.println(listaNomes.get(2));
        System.out.println("---------------");
        listaNomes.remove(gusta);
        System.out.println("---------------");
        System.out.println(listaNomes.get(2));

        listaNomes.forEach(nome -> System.out.println(nome));

        listaNomes.removeIf(nome -> nome.contains("i"));

        listaNomes.clear();

        List<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(new Pessoa("Teste 1"));
        listaPessoas.add(new Pessoa("Teste 2"));
        listaPessoas.add(new Pessoa("Teste 3"));
        listaPessoas.add(new Pessoa("Teste 4"));

    //     String[] nomesVetor = new String[20];

    //     for (int i = 0; i < nomesVetor.length; i++) {
    //         //
    //     }

    //     for (int i = 0; i < listaPessoas.size(); i++) {
    //         //
    //     }
    // }

    listaPessoas.remove(listaPessoas.size()-1);
    
}
}
