package segundob.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;

public class FilterSample {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Uva");
        frutas.add("Tomate");
        frutas.add("Banana");
        frutas.add("Limao");
        frutas.add("Limao");

        frutas.forEach(fruta -> System.out.println(fruta));

        List<String> apenasLimoes = frutas.stream()
                .filter(fruta -> fruta.equals("Limao"))
                .toList();
        apenasLimoes.forEach(fruta -> System.out.println(fruta));

        List<Integer> valores = List.of(30, 22);

        List<Integer> valoresMaisUm = valores.stream()
                .map(valor -> valor + 1)
                .toList();

        valoresMaisUm.forEach(vl -> System.out.println(vl));

        List<String> apenasMelancia = frutas.stream()
                .map(fruta -> "Melancia")
                .toList();

        apenasMelancia.forEach(vl -> System.out.println(vl));

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Marcus", 18));
        alunos.add(new Aluno("Maylo", 42));

        Double media = alunos.stream()
            .mapToInt(aluno -> aluno.getIdade())
            .average()
            .getAsDouble();
            System.out.println(media);
    }
}
