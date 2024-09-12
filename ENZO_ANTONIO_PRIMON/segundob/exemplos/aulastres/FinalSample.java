package segundob.exemplos.aulastres;

import java.util.ArrayList;
import java.util.List;

public class FinalSample {
    public static void main(String[] args) {

    List<String> frutas = new ArrayList<>();

        frutas.add("uva");
        frutas.add("maça");
        frutas.add("banana");
        frutas.add("limão");
        frutas.add("limão");

        boolean possuiFruta = frutas.stream()
            .anyMatch(fruta -> fruta.equals("maça"));

            System.out.println("Possui maça? " + possuiFruta);
            System.out.println();

        boolean tudoBanana = frutas.stream()
            .allMatch(fruta -> fruta.equals("banana"));

            System.out.println("É tudo banana? " + tudoBanana);
            System.out.println();
            
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("gustavo", 10));
        alunos.add(new Aluno("Maylo", 20));
        alunos.add(new Aluno("Aquiles", 30));

        Integer totalAge = alunos.stream()
            .map(aluno -> aluno.getAge())
            .reduce(0, (valorAnterior, valorAtual) -> valorAnterior + valorAtual);
            
        System.out.println(totalAge);
        System.out.println();


    }
}

