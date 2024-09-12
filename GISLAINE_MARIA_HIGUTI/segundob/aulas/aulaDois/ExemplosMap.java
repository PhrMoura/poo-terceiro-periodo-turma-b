package segundob.aulas.aulaDois;

import java.util.HashMap;
import java.util.Map;

public class ExemplosMap {
    public static void main(String[] args) {

        Map<String, Double> alunoNota = new HashMap<>();

        alunoNota.put("Pedro", 8.0);
        alunoNota.put("Pedro", 4.0);
        alunoNota.put("Higor", 7.0);
        alunoNota.put("Israel", 7.0);
        alunoNota.put("Gustavo Serapião", 7.0);

        alunoNota.entrySet().forEach(kv -> {
            System.out.println(kv);
        });

    }
}
