package segundob.aulas.auladois;

import java.util.PriorityQueue;
import java.util.Queue;

public class Teste {
    public static void main(String[] args) {
         Queue<String> listaNomes = new PriorityQueue<>();

        System.out.println("-------\n");

        listaNomes.add("Júlio");
        listaNomes.add("Pedro");
        listaNomes.add("Igor");
        listaNomes.add("Israel");
        listaNomes.add("Allan");
        listaNomes.add("Gustavo Serapião");
        listaNomes.add("Zico");

        //Iterando na ordenada
        listaNomes.forEach(item -> System.out.println(item));
        
    }
    
}
