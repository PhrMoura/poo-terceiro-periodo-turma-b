package segundob.exemplos.auladois;

import java.util.HashSet;
import java.util.Set;

public class SetSamples {
    public static void main(String[] args) {

        Set<String> nomesSemRepetição = new HashSet<>();

        nomesSemRepetição.add("maylo");
        nomesSemRepetição.add("felipe");
        nomesSemRepetição.add("aquiles");
        nomesSemRepetição.add("bruno");
        nomesSemRepetição.add("maylo");

        for (String nome : nomesSemRepetição) {
            System.out.println(nome);

        }
    }
}
