package segundob.listas.lista1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ExplicacaoAula {
  public static void main(String[] args) {
    Set<String> nomes = new HashSet<>();

    nomes.add("Fabiano");
    nomes.add("Igor");
    nomes.add("Adrils");

    System.out.println("Nomes no Set" + nomes);

    nomes.remove("Fabiano");

    System.out.println("Fabiano removido do Set");

    System.out.println(nomes);

    nomes.clear();

    System.out.println("Nomes removidos");

    System.out.println("Nomes no Set" + nomes);

    if (nomes.isEmpty()) {
      System.out.println("Set esta vazio !");
    } else {
      System.out.println("Set não esta vazio !");
    }

    List<String> listaNomes = new ArrayList<String>();

    listaNomes.add("hehe da silva");
    listaNomes.add("pedrinho");
    listaNomes.add("xd pcrl");
    listaNomes.add("kekw");

    for (String nome : listaNomes) {
      System.out.println(nome);
    }

    System.out.println(listaNomes.get(2));

    listaNomes.remove(2);

    System.out.println(listaNomes.get(2));

    listaNomes.forEach(nome -> System.out.println(nome));

    listaNomes.removeIf(nome -> nome.contains("i"));

    System.out.println("-----");
    System.out.println(listaNomes);

    listaNomes.remove(listaNomes.size() - 1);

    Queue<Integer> listaNumero = new LinkedList<>();

    listaNumero.add(26);
    listaNumero.add(9);
    listaNumero.add(2018);

    System.out.println("-----");

    for (Integer num : listaNumero) {
      System.out.println(num);
    }

    System.out.println(listaNumero.peek());

    listaNumero.poll();

    Queue<String> listaNomesDois = new PriorityQueue<>();

    listaNomesDois.add("cao");
    listaNomesDois.add("bonitao");
    listaNomesDois.add("aou");
    listaNomesDois.add("zehe");

    listaNomesDois.forEach(nome -> System.out.println(nome));

    System.out.println("-----");

    Map<String, Integer> veiculos = new HashMap<>();

    veiculos.put("mescedes", 2);
    veiculos.put("bmw", 6);
    veiculos.put("audi", 7);

    System.out.println("Total de marcas: " + veiculos.size());

    System.out.println("Quantas bmw tem na concessionaria: " + veiculos.get("bmw"));

    System.out.println(veiculos);

  }
}
