package segundob.aulas.auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {

        Queue<Integer> listaNum = new LinkedList<>();

        listaNum.add(23);
        listaNum.add(43);
        listaNum.add(44);
        listaNum.add(52);
        listaNum.add(33);
        
        for (Integer num : listaNum) {
            System.out.println(num);
        }

        System.out.println("--------------------------------");

        System.out.println(listaNum.peek());

        System.out.println("--------------------------------");

        Queue<String> listaNomes = new PriorityQueue<>();

        listaNomes.add("Julio");
        listaNomes.add("Pedro");
        listaNomes.add("Gustavo");
        listaNomes.add("Higor");
        listaNomes.add("Israel");
        listaNomes.add("Gustavo Serapião");
        
        listaNomes.forEach(nome -> System.out.println(nome));

    }
}
