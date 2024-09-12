
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class Atividade3 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        List<String> lPalavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        Map<String, Integer> mapFrequency = lPalavras.stream()
                .collect(Collectors.toMap(palavra -> palavra, palavra -> Collections.frequency(lPalavras, palavra),
                        (existing, replacement) -> existing));

        mapFrequency.forEach((palavra, frequencia) -> System.out
                .println("Palavra: " + palavra + ". Frequencia: " + frequencia + "."));

        scanner.close();
    }
}
