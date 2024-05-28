import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        List<String> lNomes = Arrays.asList("roberto", "josé", "caio", "vinicius");

        var lNomesUpperCase = lNomes.stream().map(v -> v.toUpperCase()).toList();

        for (String nome : lNomesUpperCase) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
