package segundob.aulas.auladois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    
    public static void main(String[] args) {
        
        Map<String, Double> alunoNota = new HashMap<>();

        alunoNota.put("Pedro", 8.0);
        alunoNota.put("Pedro", 4.0);
        alunoNota.put("Julio", 7.0);
        alunoNota.put("Gustavo", 7.0);
        alunoNota.put("Igor", 7.0);
        alunoNota.put("Israel", 7.0);
        
        alunoNota.entrySet().forEach(kv -> {
            System.out.println(kv.getKey() + " - " + kv.getValue());
        });

    }

}
