package segundob.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSample {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("🍇");
        frutas.add("🍎");
        frutas.add("🍌");
        frutas.add("🍋");
        frutas.add("🍋");

        frutas.forEach(fruta -> System.out.print(fruta));

        System.out.println();

        List<String> apenasLimoes = frutas.stream()
                .filter(fruta -> fruta.equals("🍋"))
                .toList();

        apenasLimoes.forEach(fruta -> System.out.print(fruta));

        List<Integer> valores = List.of(30, 22);

        List<Integer> valoresMaisUm = valores.stream()
                .map(x -> x + 1)
                .toList();

        valoresMaisUm.forEach(vl -> System.out.println(vl));

        List<String> apenasMelancia = frutas.stream()
                .map(fruta -> "🍉")
                .collect(Collectors.toList());// Java 17 abaixo

        apenasMelancia.forEach(vl -> System.out.print(vl));

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Gustavo", 20));
        alunos.add(new Aluno("Maylo", 20));

        Double media = alunos.stream()
                .mapToInt(aluno -> aluno.getIdade())
                .average()
                .getAsDouble();

        System.out.println(media);
    }

}
