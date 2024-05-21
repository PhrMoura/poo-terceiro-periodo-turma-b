package segundoB.aulas.aulatres;
import java.util.ArrayList;
import java.util.List;

public class FilterSample {
    public static void main(String[] args) {
        System.out.println("--------------------");
        List<String> frutas = new ArrayList<>();
        frutas.add("Morango");
        frutas.add("Pêssego");
        frutas.add("Limão");
        frutas.add("Manga");
        frutas.add("Manga");

        System.out.println("Lista de frutas:");
        frutas.forEach(fruta -> System.out.println(fruta));


        System.out.println("--------------------");
        System.out.println("Lista de frutas só com as mangas:");
        List<String> apenasMangas = frutas.stream()
            .filter(fruta -> fruta.equals("Manga"))
            .toList();
        apenasMangas.forEach(fruta -> System.out.println(fruta));


        System.out.println("--------------------");
        System.out.println("Lambda:");
        List<Integer> valores = List.of(30, 22);
        List<Integer> valoresMaisUm = valores.stream()
            .map(x -> x + 1)
            .toList();
        valoresMaisUm.forEach(vl -> System.out.println(vl));


        System.out.println("--------------------");
        System.out.println("Trocar todas as frutas da lista por melancia:");
        List<String> apenasMelancia = frutas.stream()
            .map(fruta -> "Melancia")
            .toList();
        apenasMelancia.forEach(valor -> System.out.println(valor));


        System.out.println("--------------------");
        System.out.println("Média de idades dos alunos:");
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Larissa", 19));
        alunos.add(new Aluno("Maria", 19));

        Double mediaIdade = alunos.stream()
            .mapToInt(aluno -> aluno.getIdade())
            .average()
            .getAsDouble();

        System.out.println(mediaIdade);
    }
}
