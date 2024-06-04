package segundob.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;

public class FilterSample {
    
    public static void main(String[] args) {
        
        List<String> frutas = new ArrayList<>();

        frutas.add("Uva");
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Limão");
        frutas.add("Limão");

        frutas.forEach(fruta -> System.out.println(fruta));

        List<String> apenasLimoes = frutas.stream()
        .filter(fruta -> fruta.equals("Limão"))
        .toList();

        System.out.println("------------------");

        apenasLimoes.forEach(fruta -> System.out.println(fruta));

        System.out.println("------------------");

        List<Integer> valores = List.of(20, 28);

        List<Integer> valoresMaisUm = valores.stream()
        .map(valor -> valor + 1)
        .toList();

        valoresMaisUm.forEach(vl -> System.out.println(vl));

        System.out.println("------------------");

        List<String> apenasMelancia = frutas.stream()
        .map(fruta -> "Melância")
        .toList();

        apenasMelancia.forEach(vl -> System.out.println(vl));

        System.out.println("------------------");

        List<Alunos> mediaIdade = new ArrayList<>();

        mediaIdade.add(new Alunos("Igor", 19));
        mediaIdade.add(new Alunos("Gustavo", 21));

        Double media = mediaIdade.stream()
        .mapToInt(aluno -> aluno.getIdade())
        .average()
        .getAsDouble();

        System.out.println(media);
    }
}
