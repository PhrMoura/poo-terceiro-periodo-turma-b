import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        List<Integer> lIntegers = new ArrayList<>();

        for (var x = 0; x < 8; x++) {
            System.out.print("Informe o " + (x+1) + "º número inteiro: ");
            int valueToAdd = scanner.nextInt();

            lIntegers.add(valueToAdd);
        }

        List<Integer> evenList = lIntegers.stream().filter(v -> v % 2 == 0).toList();

        System.out.print("Números pares encontrados na lista: ");

        for (var x = 0; x < evenList.size(); x++) {
            System.out.print(" " + evenList.get(x) + "");
        }

        scanner.close();
    }
}
