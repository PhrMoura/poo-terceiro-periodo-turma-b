package segundob.Aulas.auladois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    
    public static void main(String[] args) {
        
        Map<String, Double> alunoNota = new HashMap<>();
        
        alunoNota.put("Capetinha", 8.9);
        alunoNota.put("Liaozinho", 9.6);
        alunoNota.put("Ebola", 10.0);
        alunoNota.put("Zabuza", 6.9);

        System.out.println(alunoNota);
        

    }

}
