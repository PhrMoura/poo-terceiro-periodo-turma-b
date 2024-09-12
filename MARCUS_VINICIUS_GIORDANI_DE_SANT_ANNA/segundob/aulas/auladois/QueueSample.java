package segundob.aulas.auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {
        
        Queue<Integer> listaNum = new LinkedList<>();

        listaNum.add(23);
        listaNum.add(24);
        listaNum.add(25);
        listaNum.add(26);
        listaNum.add(27);

        for (Integer num : listaNum) {
            System.out.println(num);
        }

        System.out.println("--------------------\n");
        System.out.println(listaNum.peek());


        Queue<String> listaNomes = new PriorityQueue<>();
        listaNomes.add("Julio");
        listaNomes.add("Pedro");
        listaNomes.add("Gustavo");
        listaNomes.add("Igor");
        listaNomes.add("Israel");
        listaNomes.add("Gustavo Serapião");

        listaNomes.forEach(item -> System.out.println(item));
    }
    
}
