package segundob.aulas.aulaTres;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosFiltes {
    
    public static void main(String[] args) {
        
        List<String> frutas = new ArrayList<>();

        frutas.add("Uva🍇");
        frutas.add("Maça 🍎");
        frutas.add("Laranja 🍊");
        frutas.add("Banana 🍌");
        frutas.add("Uva🍇");

        List<String> apenasUvas = frutas.stream()
            .filter(fruta -> fruta.equals("Uva🍇"))
            .toList();

        apenasUvas.forEach(fruta -> System.out.println(fruta));

        System.out.println("---------------");
        
        List<Integer> valores = List.of(30, 22); //List.of cria um "arraylist" imutável
        
        List<Integer> valoresMaisUm = valores.stream()
        .map(valor -> valor + 1)
        //            .map(x -> x + 1)
        .toList();
        
        valoresMaisUm.forEach(vl -> System.out.println(vl));
        
        System.out.println("---------------");
        
        List<String> apenasMelancia = frutas.stream()
        .map(fruta -> "Melancia 🍉")
            .collect(Collectors.toList()); //toList no Java 17 abaixo

        apenasMelancia.forEach(vl -> System.out.println(vl));
        
        System.out.println("---------------");

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Gustavo", 27));
        alunos.add(new Aluno("Maylo", 32));

        Double media = alunos.stream()
            .mapToInt(aluno -> aluno.getIdade())
            .average()
            .getAsDouble();

        System.out.println(media);
    }
}
