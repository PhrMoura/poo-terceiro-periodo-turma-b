package segundob.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSample {
    public static void main(String[] args) {
        
        List<String> frutas = new ArrayList<>();

        frutas.add("Uva");
        frutas.add("Maça");
        frutas.add("Morango");
        frutas.add("Banana");
        frutas.add("Abacaxi");

        frutas.forEach(fruta -> System.out.println(fruta));

        System.out.println();

        List<String> apenasMorangos = frutas.stream()
            .filter(fruta -> fruta.equals("Morango"))
            .toList();

        apenasMorangos.forEach(fruta -> System.out.println(fruta));

        System.out.println("------------------------------");

        List<Integer> valores = List.of(30, 22);

        valores.forEach(valor -> System.out.println(valor));

        System.out.println();

        List<Integer> valoresSomados = valores.stream()
            .map(valor -> valor + 1)
            .toList();

        valoresSomados.forEach(valor -> System.out.println(valor));

        System.out.println("------------------------------");

        List<String> apenasMelancia = frutas.stream()
            .map(fruta -> "Melancia")
            .collect(Collectors.toList());

        apenasMelancia.forEach(fruta -> System.out.println(fruta));

        System.out.println("------------------------------");
        
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Gustavo", 27));
        alunos.add(new Aluno("Maylo", 19));

        Double media = alunos.stream()
            .mapToInt(aluno -> aluno.getIdade())
            .average()
            .getAsDouble();

        System.out.println(media);

    }
}
