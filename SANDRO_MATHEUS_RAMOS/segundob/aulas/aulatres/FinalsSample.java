package segundob.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;

public class FinalsSample {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("🍇");
        frutas.add("🍎");
        frutas.add("🍌");
        frutas.add("🍌");
        frutas.add("🍌");
        frutas.add("🍌");
        frutas.add("🍋");
        frutas.add("🍋");

        boolean possuiMaca = frutas.stream()
                .anyMatch(fruta -> fruta.equals("🍎"));

        System.out.println("possui maça: " + possuiMaca);

        frutas.forEach(fruta -> System.out.print(fruta));

        System.out.println();

        boolean heTudoBanana = frutas.stream()
                .filter(fruta -> fruta.equals("🍌"))
                .allMatch(fruta -> fruta.equals("🍌"));

        System.out.println("É tudo banana: " + heTudoBanana);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Gustavo", 20));
        alunos.add(new Aluno("Maylo", 20));
        alunos.add(new Aluno("Crystian", 21));

        Integer totalIdade = alunos.stream()
                .map(aluno -> {
                    System.out.println(aluno.getName());

                    return aluno.getIdade();
                })
                .reduce(0, (vlAnt, vlAt) -> vlAnt + vlAt);

        System.out.println(totalIdade);

    }

}
