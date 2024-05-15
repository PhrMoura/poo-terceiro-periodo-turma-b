package segundob.Aulas.aula3;

import java.util.ArrayList;
import java.util.List;

public class FilterSample {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Limão");
        frutas.add("Limão");

        frutas.forEach(fruta -> System.out.println(fruta));

        System.out.println();

        List<String> apenasLimoes = frutas.stream()
                .filter(fruta -> fruta.equals("Limão"))
                .toList();
        apenasLimoes.forEach(fruta -> System.out.println(fruta));

        List<Integer> valores = List.of(30, 22);

        List<Integer> valoresMaisUm = valores.stream()
                .map(x -> x + 1)
                .toList();

        valoresMaisUm.forEach(vl -> System.out.println(vl));

        List<String> apenasMelancia = frutas.stream()
                .map(fruta -> "Melancia")
                .toList();
        apenasMelancia.forEach(vl -> System.out.println(vl));

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Gustavo", 27));
        alunos.add(new Aluno("Maylo", 42));

        double media = alunos.stream()
                .mapToInt(aluno -> aluno.getIdade())
                .average()
                .getAsDouble();

        System.out.println(media);

    }
}
