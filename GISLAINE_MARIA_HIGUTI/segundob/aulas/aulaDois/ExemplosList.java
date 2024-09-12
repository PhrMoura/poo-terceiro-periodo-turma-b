package segundob.aulas.aulaDois;

import java.util.ArrayList;
import java.util.List;

public class ExemplosList {
 
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        String Gusta = "Gustavo";

        listaNomes.add(Gusta);
        listaNomes.add("Júlio");
        listaNomes.add("Pedro");
        //listaNomes.add("Gustavo");
        listaNomes.add("Higor");
        listaNomes.add("Israel");
        listaNomes.add("Gustavo Serapião");
        listaNomes.add("Júlio H.");

        for(String nome: listaNomes) {
            System.out.println(nome);
        }

        System.out.println("-----------");
        //System.out.println(listaNomes.get(2));

        System.out.println("-----------");
        //listaNomes.remove(0);
        listaNomes.remove(Gusta);
        System.out.println(listaNomes.get(2));

        listaNomes.removeIf(nome -> nome.contains("i")|| nome.contains("i"));
        listaNomes.forEach(nome -> System.out.println(nome));
        listaNomes.clear();

        //---------------------------------------- Desafio

        List<Pessoas> listaPessoas = new ArrayList<>();

        listaPessoas.add(new Pessoas("Cleber"));
        listaPessoas.add(new Pessoas("Roberto"));
        listaPessoas.add(new Pessoas("Teste"));
        listaPessoas.add(new Pessoas("Teste"));

        //String[] nomeVetor = new String[20];

        //for (int i = 0; i < nomeVetor.length; i++) {
        //    //
        //}
    
        //for (int i = 0; i < listaPessoas.size(); i++) {
        //    //
        //}

        listaPessoas.remove(listaPessoas.size() - 1);
        listaPessoas.add(new Pessoas("Teste 3"));
        listaPessoas.add(new Pessoas("Teste 4"));
        listaPessoas.remove(listaPessoas.size() - 1);
    }

}
