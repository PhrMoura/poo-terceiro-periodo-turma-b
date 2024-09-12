package segundob.exemplos.aulastres;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterSample {
    public static void main(String[] args) {
        
        List<String> frutas = new ArrayList<>();

        frutas.add("uva");
        frutas.add("maça");
        frutas.add("banana");
        frutas.add("limão");
        frutas.add("limão");

        System.out.println("Filter");
        frutas.forEach(fruta -> System.out.println(fruta));
        System.out.println();

        List<String> apenasLimoes = frutas.stream()
            .filter(fruta -> fruta.equals("limão"))
            .toList();
        
        apenasLimoes.forEach(fruta -> System.out.println(fruta));
        System.out.println();
        //map
        System.out.println("Map");
        List<Integer> valores = List.of(30, 22);

        List<Integer> valorSomado = valores.stream()
            .map(valor -> valor + 1)
            .toList();

        valorSomado.forEach(v1 -> System.out.println(v1));
        System.out.println();
        List<String> apenasMelancia = frutas.stream()
            .map(fruta -> "melancia")
            .collect(Collectors.toList());
        
        apenasMelancia.forEach(fruta -> System.out.println(fruta));
        System.out.println();

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("gustavo", 27));
        alunos.add(new Aluno("Maylo", 20));

        Double media = alunos.stream()
            .mapToInt(aluno -> aluno.getAge())
            .average()
            .getAsDouble();
        
        System.out.println(media);

    }
} 
    

