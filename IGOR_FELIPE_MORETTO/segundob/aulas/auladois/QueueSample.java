package segundob.aulas.auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        
        Queue <Integer> listaNum = new LinkedList<>();

        listaNum.add(10);
        listaNum.add(12);
        listaNum.add(18);
        listaNum.add(28);

        for (Integer num : listaNum) {
            System.out.println(num);
        }
        System.out.println("----------");
        System.out.println(listaNum.peek());

        Queue <String> listaNomes = new PriorityQueue<>();
        listaNomes.add("Igor");
        listaNomes.add("Gustavo");
        listaNomes.add("Neymar");
        listaNomes.add("Arnaldo");
//não ta funcionando
        listaNomes.forEach(item -> System.out.println(item));
        //porque essa flecha
    }
}
