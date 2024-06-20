package segundob.aulas.auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {

        //Criando fila simples
        Queue<Integer> listaNum = new LinkedList<>();

        //Adicionando elementos fila
        listaNum.add(23);
        listaNum.add(45);
        listaNum.add(12);
        listaNum.add(5);
        listaNum.add(89);
        
        //Iterando na fila
        for (Integer num : listaNum) {
            System.out.println(num);
        }

        System.out.println("-------\n");
        
        //"vendo" o primeiro elemento da fila
        System.out.println(listaNum.peek());

        //Criando fila que ordena os elementos pela ordem natural
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
