package segundoB.aulas.aulatres;
import java.util.ArrayList;
import java.util.List;

public class FinalsSample {
    public static void main(String[] args) {
        System.out.println("--------------------");
        List<String> frutas = new ArrayList<>();
        frutas.add("Morango");
        frutas.add("Pêssego");
        frutas.add("Limão");
        frutas.add("Manga");
        frutas.add("Manga");

        System.out.println("Lista de frutas:");
        // forEach direto
        frutas.forEach(fruta -> System.out.println(fruta));

        // anyMatch = algum elemento tem que ter essa condição
        boolean possuiLimao = frutas.stream()
            .anyMatch(fruta -> fruta.equals("Limão"));
        System.out.println("Possui limão: " + possuiLimao);

        System.out.println();
        System.out.println("Lista de frutas só de manga:");
        // forEach da Stream: utilizado DEPOIS de um filter, map, etc
        frutas.stream()
            .filter(fruta -> fruta.equals("Manga"))
            .forEach(fruta -> System.out.println(fruta)); // também pode usar só o "toList();"

        // allMatch = todos os elementos têm que ter essa condição
        boolean eTudoManga = frutas.stream()
            .filter(fruta -> fruta.equals("Manga"))
            .allMatch(fruta -> fruta.equals("Manga"));
        System.out.println("Possui manga: " + eTudoManga);


        System.out.println("--------------------");
        // reduce
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Larissa", 19));
        alunos.add(new Aluno("Maria", 19));
        alunos.add(new Aluno("Gislaine", 19));

        System.out.println("Reduce das idades:");
        Integer totalIdade = alunos.stream()
            .map(aluno -> aluno.getIdade())
            .reduce(0, (valorAnterior, valorAtual) -> valorAnterior + valorAtual);
        System.out.println(totalIdade);
    }
}