package segundob.Aulas.auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueFila {
    
    public static void main(String[] args) {
        
        Queue<Integer> listaNum = new LinkedList<>();
        
        listaNum.add(23);
        listaNum.add(45);
        listaNum.add(12);
        listaNum.add(69);
        listaNum.add(89);
        
        for (Integer num : listaNum) {
            System.out.println(num);
        }
        
        System.out.println("-----------");
        
        System.out.println(listaNum.peek());
        
        Queue<String> listaNomes = new PriorityQueue<>();

        listaNomes.add("Capetinha");
        listaNomes.add("Liaoiabinho");
        listaNomes.add("Ebola");
        listaNomes.add("Zabuza");

        listaNomes.forEach(nome -> System.out.println(nome));

    }

}
