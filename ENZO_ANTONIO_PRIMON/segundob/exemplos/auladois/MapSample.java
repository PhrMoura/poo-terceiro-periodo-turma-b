package segundob.exemplos.auladois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public class MapSamples {
        public static void main(String[] args) {
            Map<String, Double> alunoNota = new HashMap<>();

            alunoNota.put("Maylo", 9.0);
            alunoNota.put("Maylo", 10.0);
            alunoNota.put("Felipe", 8.0);
            alunoNota.put("Aquiles", 7.0);
            alunoNota.put("Bruno", 7.0);

            alunoNota.entrySet().forEach(kv -> {
                System.out.println(kv.getKey() + "-" + kv.getValue());
            });

        }
    }
}
