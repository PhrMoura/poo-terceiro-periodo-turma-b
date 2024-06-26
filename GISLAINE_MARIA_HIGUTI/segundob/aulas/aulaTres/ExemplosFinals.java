package segundob.aulas.aulaTres;

import java.util.ArrayList;
import java.util.List;

public class ExemplosFinals {
    public static void main(String[] args) {
        
        List<String> frutas = new ArrayList<>();

        frutas.add("Uva🍇");
        frutas.add("Maça 🍎");
        frutas.add("Laranja 🍊");
        frutas.add("Banana 🍌");
        frutas.add("Uva🍇");

        boolean possuiMaca = frutas.stream()
            .anyMatch(fruta -> fruta.equals("Maça 🍎"));

        System.out.println("Possui Maça? " + possuiMaca);

        System.out.println("---------------");

        boolean ehTudoUva = frutas.stream()
            .filter(fruta -> fruta.equals("Uva🍇"))
            .allMatch(fruta -> fruta.equals("Uva🍇"));

        System.out.println("É tudo Uva? " + ehTudoUva);

        System.out.println("---------------");

        frutas.forEach(fruta -> System.out.println(fruta));
        
        System.out.println("---------------");

        frutas.stream()
            .filter(fruta -> fruta.equals("Maça 🍎"))
            //.forEach(fruta -> System.out.println(fruta));
            .toList();

        List<Aluno> alunos = new ArrayList<>();

            alunos.add(new Aluno("Gustavo", 20));
            alunos.add(new Aluno("Maylo", 20));
            alunos.add(new Aluno("Crysthian", 21));
            
        Integer totalIdade = alunos.stream()
            .map(aluno -> aluno.getIdade())
            .reduce(0, (vlAnt, vlAt) -> vlAt + vlAnt);

        System.out.println(totalIdade);
    }
}
