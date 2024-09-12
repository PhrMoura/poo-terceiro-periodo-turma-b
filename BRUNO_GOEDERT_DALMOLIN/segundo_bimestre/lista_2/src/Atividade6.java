
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Atividade6 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        List<String> lLinguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> lOrdenada = lLinguagens.stream()
                .sorted((p1, p2) -> Integer.compare(p1.length(), p2.length()))
                .collect(Collectors.toList());

        System.out.println("Exibindo lista ordenada: ");
        for (String linuagem : lOrdenada) {
            System.out.println(linuagem + ", ");
        }

        scanner.close();
    }

}
