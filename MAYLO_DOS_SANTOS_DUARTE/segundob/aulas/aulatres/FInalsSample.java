package segundob.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;

public class FInalsSample {
    public static void main(String[] args) {
        
        List<String> frutas = new ArrayList<>();

        frutas.add("Limão");
        frutas.add("Uva");
        frutas.add("Morango");
        frutas.add("Banana");
        frutas.add("Abacaxi");

        boolean possuiMaca = frutas.stream()
            .anyMatch(fruta -> fruta.equals("Maça"));

        System.out.println("Possui Maça? " + possuiMaca);
        
        System.out.println("---------------------------------");
        
        frutas.forEach(fruta -> System.out.println(fruta));
        
        System.out.println("---------------------------------");
        
        boolean possuiAbacaxi = frutas.stream()
            .filter(fruta -> fruta.equals("Abacaxi"))
            .allMatch(fruta -> fruta.equals("Abacaxi"));
        
        System.out.println("São todos Abacaxi? " + possuiAbacaxi);

        System.out.println("---------------------------------");

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Gustavo", 27));
        alunos.add(new Aluno("Maylo", 19));
        alunos.add(new Aluno("Crystian", 21));

        Integer idade = alunos.stream()
            .map(aluno -> aluno.getIdade())
            .reduce(0, (valorAnterior, ValorAtual) -> valorAnterior + ValorAtual);

        System.out.println(idade);


    }   
}
