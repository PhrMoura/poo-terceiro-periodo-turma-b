package segundob.Aulas.aulatres;

import java.util.List;
import java.util.ArrayList;

public class FinalsSample {
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

        frutas.stream()
            .filter(fruta -> fruta.equals("Banana"))
            .toList();
    }
}
