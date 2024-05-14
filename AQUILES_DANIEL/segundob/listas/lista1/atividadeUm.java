package segundob.listas.lista1;

import java.util.*;

public class atividadeUm {
  public static void main(String[] args) {
    System.out.println("----------ATV 1----------");
    List<String> colegasFavoritos = new ArrayList<>();

    colegasFavoritos.add("Félip");
    colegasFavoritos.add("Enzu");
    colegasFavoritos.add("Mailo");
    colegasFavoritos.add("Brun");
    colegasFavoritos.add("Sandrolax");

    for (String nomes : colegasFavoritos) {
      System.out.println(nomes.charAt(0) + " - " + nomes);
    }

    System.out.println("----------ATV 2----------");
    Set<Integer> numeros = new HashSet<>();

    numeros.add(20);
    numeros.add(30);
    numeros.add(20);
    numeros.add(26);
    numeros.add(20);

    if (numeros.contains(20)) {
      System.out.println("Contem o numero 20");
    } else {
      System.out.println("Não contem o numero 20");
    }

    System.out.println("----------ATV 3----------");

    Set<String> jogosQueZerei = new HashSet<>();
    jogosQueZerei.add("Far cry 3");
    jogosQueZerei.add("Far cry 3");
    jogosQueZerei.add("Far cry 3");
    jogosQueZerei.add("Hades");
    jogosQueZerei.add("The Last Of Us");
    jogosQueZerei.add("Far cry 3");
    jogosQueZerei.add("The Last Of Us");
    jogosQueZerei.add("The Last Of Us");
    jogosQueZerei.add("Resident evil 4 remake");

    System.out.println("Jogos zerados unicos:");
    for (String jogo : jogosQueZerei) {
      System.out.println(jogo);
    }

    System.out.println("----------ATV 4----------");
    Queue<String> filmes = new PriorityQueue<>();

    filmes.add("A rede social - 2010");
    filmes.add("Matrix - 1999");
    filmes.add("Tudo em todo lugar ao mesmo tempo - 2022");
    filmes.add("O show de Truman - 1998");
    filmes.add("Batman - 2022");

    System.out.println("Top 5 filmes favoritos em ordem de preferencia: ");
    filmes.forEach(topFilmes -> System.out.println(topFilmes));

    System.out.println("----------ATV 5----------");
    Map<String, String> pecasDePc = new HashMap<>();

    pecasDePc.put("Processador", "Ryzen 5 5600");
    pecasDePc.put("Placa de video", "Rtx 2060");
    pecasDePc.put("Memoria ram", "16Gb 3000hz");
    pecasDePc.put("Placa mae", "B450M DS3H v2");
    pecasDePc.put("Ssd", "NVME 500GB");

    for (Map.Entry<String, String> entry : pecasDePc.entrySet()) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
  }
}
