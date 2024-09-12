package segundob.aulas.aulaDois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExemplosQueue {
 
    public static void main(String[] args) {
        Queue<Integer> listaNum = new LinkedList<>();

        listaNum.add(44);
        listaNum.add(3);
        listaNum.add(16);
        listaNum.add(31);
        listaNum.add(4);

        for (Integer numero : listaNum) {
            System.out.println(numero);
        }

        System.out.println("--------------");

        System.out.println(listaNum.peek());

        System.out.println("--------------");

        Queue<String> listaNomes = new PriorityQueue<>();

        listaNomes.add("Júlio");
        listaNomes.add("Pedro");
        listaNomes.add("André");
        listaNomes.add("Higor");
        listaNomes.add("Israel");
        listaNomes.add("Gustavo Serapião");
        listaNomes.add("Júlio H.");
        listaNomes.add("Zildo");

        listaNomes.forEach(nome -> System.out.println(nome));
        

    }
}
