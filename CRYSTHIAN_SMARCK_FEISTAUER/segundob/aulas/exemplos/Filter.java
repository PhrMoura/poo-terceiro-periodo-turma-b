
import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("banana");
        frutas.add("limão");
        frutas.add("banana");
        frutas.add("kiwi");

        frutas.forEach(fruta -> System.out.println(fruta));

        List<String> apenasLimoes = frutas.stream()
                                         .filter(fruta -> fruta.equals("limão"))
                                         .toList();

        apenasLimoes.forEach(System.out::println);

        frutas.stream()
                .forEach(fruta -> System.out.println(frutas));
    }
}
