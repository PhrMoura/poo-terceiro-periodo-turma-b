package segundob.listas.lista2;

import java.util.*;

public class ExplicacaoAula {
        public static void main(String[] args) {
                List<String> frutas = new ArrayList<>();

                frutas.add("Uva");
                frutas.add("Maça");
                frutas.add("Abacaxi");
                frutas.add("Limão");
                frutas.add("Limão");

                boolean possuiMaca = frutas.stream()
                                .anyMatch(frutaPossui -> frutaPossui.equals("Maça"));
                System.out.println(possuiMaca);

                frutas.forEach(fruta -> System.out.println(fruta));

                boolean apenasLimoes = frutas.stream()
                                .filter(fruta -> fruta.equals("Limão"))
                                .allMatch(fruta -> fruta.equals("Limão"));

                System.out.println(apenasLimoes);

                List<Integer> valores = List.of(30, 22);

                List<Integer> valorSomado = valores.stream()
                                .map(valor -> valor + 1)
                                .toList();

                valorSomado.forEach(valor -> System.out.println(valor));

                List<String> apenasMelancia = frutas.stream()
                                .map(fruta -> "Melancia")
                                .toList();

                apenasMelancia.forEach(fruta -> System.out.println(fruta));

                List<Aluno> alunos = new ArrayList<>();

                alunos.add(new Aluno("Gustavo", 20));
                alunos.add(new Aluno("Adrils", 20));
                alunos.add(new Aluno("Igor", 20));

                Double media = alunos.stream()
                                .mapToInt(aluno -> aluno.getIdade())
                                .average()
                                .getAsDouble();

                System.out.println(media);

                Integer totalIdade = alunos.stream()
                                .mapToInt(aluno -> aluno.getIdade())
                                .reduce(0, (valorAnterior, valorAtual) -> valorAnterior + valorAtual);

                System.out.println(totalIdade);
        }
}
