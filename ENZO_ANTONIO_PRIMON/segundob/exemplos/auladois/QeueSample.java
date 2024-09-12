package segundob.exemplos.auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QeueSample {
    public static void main(String[] args) {
        Queue<Integer> listNum = new LinkedList<>();

        listNum.add(23);
        listNum.add(45);
        listNum.add(12);
        listNum.add(5);
        listNum.add(59);

        for (Integer num : listNum) {
            System.out.println(num);
        }

        System.out.println("---------");

        System.out.println(listNum.peek());

        System.out.println("---------");

        Queue<String> listaNomes = new PriorityQueue<>();

        listaNomes.add("maylo");
        listaNomes.add("felipe");
        listaNomes.add("aquiles");
        listaNomes.add("bruno");

        listaNomes.forEach(nome -> System.out.println(nome));

    }
}
