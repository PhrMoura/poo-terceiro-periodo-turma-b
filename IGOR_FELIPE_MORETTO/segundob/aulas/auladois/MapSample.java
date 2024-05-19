package segundob.aulas.auladois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map <String, Double> notaAluno = new HashMap<>();
        
        notaAluno.put("Igor", 9.8);
        
        notaAluno.entrySet().forEach(kv -> 
        System.out.println(kv.getKey() + " " + kv.getValue())
        );

    }


}
