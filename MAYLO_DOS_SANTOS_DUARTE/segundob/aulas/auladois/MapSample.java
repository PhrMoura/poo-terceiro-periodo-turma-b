package segundob.aulas.auladois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {

        Map<String, Double> alunoNota = new HashMap<>();

        alunoNota.put("Gustavo", 8.8);
        alunoNota.put("Julio", 7.8);
        alunoNota.put("Pedro", 6.8);
        alunoNota.put("Higor", 9.8);
        alunoNota.put("Israel", 5.8);

        alunoNota.entrySet().forEach(kv -> {
            System.out.println(kv.getKey() + " - " + kv.getValue());
        });

    }
}
