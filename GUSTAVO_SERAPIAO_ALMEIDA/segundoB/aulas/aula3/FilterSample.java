package aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSample {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("uva");
        frutas.add("laranja");
        frutas.add("pera");
        frutas.add("Melância");
        frutas.add("Abacate");
        frutas.add("laranja");

        frutas.forEach(System.out::println);

        List<String> apenasLaranja = frutas.stream()
            .filter(fruta -> fruta.equals("laranja"))
            .collect(Collectors.toList());

        System.out.println();
        apenasLaranja.forEach(System.out::println);

        List<Integer> valores = List.of(30, 22);
        List<Integer> valoresMaisUm = valores.stream()
        //.filter(x -> x + 1)
            .map(valor -> valor + 1)
            .collect(Collectors.toList());

        System.out.println();
        valoresMaisUm.forEach(System.out::println);

        List<String> apenasMelancia = frutas.stream()
            .map(fruta -> "Melância")
            .collect(Collectors.toList());

        System.out.println();
        apenasMelancia.forEach(System.out::println);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Gustavo", 27));
        alunos.add(new Aluno("Maylo", 42));

        double media = alunos.stream()
            .mapToInt(Aluno::getIdade)
            .average()
            .orElse(0);

        System.out.println();
        System.out.println(media);
    }
}