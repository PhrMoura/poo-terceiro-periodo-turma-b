package segundob.aulas.aula2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        // Set<String> setas = new HashSet<String>();

        // setas.forEach(nome -> {
        //     System.out.println(nome);
        // });

        // List<String> lista = new ArrayList<String>();
        // lista.remove(lista.size());

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 10);

        map.forEach((key, item) -> {
            System.out.println("Key: " + key);
            System.out.println("Value: " + item);
        });
        map.entrySet().forEach(kv -> {
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        });

    }
}