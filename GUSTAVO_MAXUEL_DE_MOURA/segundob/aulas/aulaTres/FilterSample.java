package segundob.aulas.aulaTres;

import java.util.ArrayList;
import java.util.List;

public class FilterSample {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("uva");
        frutas.add("morango");
        frutas.add("banana");
        frutas.add("melancia");
        frutas.add("limão");
        frutas.add("manga");
        System.out.println(frutas);

        List<String> apenasLimões = frutas.stream().filter(fruta -> fruta.equals("limão"))
                .toList();
        apenasLimões.forEach(fruta -> System.out.println(fruta));

        System.out.println("\n");
        List<Integer> valores = List.of(30, 22);
        List<Integer> valoresMaisUm = valores.stream()
                .map(x -> x + 1).toList();
        valoresMaisUm.forEach(vL -> System.out.println(vL));

        List<String> apenasMelancia = frutas.stream()
        .map(fruta -> "melancia")
        .toList();
apenasMelancia.forEach(vL -> System.out.println(vL));
    }
}
