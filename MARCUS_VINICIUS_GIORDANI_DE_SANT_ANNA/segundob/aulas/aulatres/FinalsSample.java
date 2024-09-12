package segundob.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;

public class FinalsSample {
    
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Uva");
        frutas.add("Tomate");
        frutas.add("Banana");
        frutas.add("Limao");
        frutas.add("Limao");

        boolean possuiMaca = frutas.stream()
            .anyMatch(fruta -> fruta.equals("Maca"));
            System.out.println("Possui maca: " + possuiMaca);
        
        System.out.println();
        

        boolean eTudoBanana = frutas.stream()
            .filter(fruta -> fruta.equals("Banana"))
            .allMatch(fruta -> fruta.equals("Banana"));

            System.out.println("Tudo é banana: " + eTudoBanana);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Gustavo", 20));
        alunos.add(new Aluno("Maylo", 20));
        alunos.add(new Aluno("Crystian", 21));

        Integer totalIdade = alunos.stream()    
            .map(aluno -> aluno.getIdade())
            .reduce(0, (vlAnt, vlAt) -> vlAnt + vlAt);

            System.out.println(totalIdade);

    }

}
