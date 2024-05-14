package segundob.aulas.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListSamples {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<String>();
        String gustavo = "Gustavo";

        listaNomes.add(gustavo);
        listaNomes.add("Julio");
        listaNomes.add("Pedro");
        listaNomes.add("Gustavo");
        listaNomes.add("Higor");
        listaNomes.add("Israel");
        listaNomes.add("Gustavo Serapião");
        listaNomes.add("Julio");
        
        for (String nomes : listaNomes) {
            System.out.println(nomes);
        }

        System.out.println("--------------------------------");
        System.out.println(listaNomes.get(2));

        System.out.println("--------------------------------");

        //listaNomes.remove(2);
        listaNomes.remove(gustavo);
        listaNomes.forEach(nome -> System.out.println(nome));

        System.out.println("--------------------------------");

        listaNomes.removeIf(nome -> nome.contains("i"));
        listaNomes.forEach(nome -> System.out.println(nome));

        // ---------------------------------------------------------------- Desafio

        List<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(new Pessoa("Cleber"));
        listaPessoas.add(new Pessoa("Roberto"));
        listaPessoas.add(new Pessoa("Teste 1"));
        listaPessoas.add(new Pessoa("Teste 2"));

        listaPessoas.remove(listaPessoas.size() - 1);

        listaPessoas.add(new Pessoa("Teste 3"));
        listaPessoas.add(new Pessoa("Teste 4"));

        listaPessoas.remove(listaPessoas.size() - 1);

        listaPessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
        
    }
    
}
