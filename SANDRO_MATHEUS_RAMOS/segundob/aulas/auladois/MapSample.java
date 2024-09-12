package segundob.aulas.auladois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

    public static void main(String[] args) {

        Map<String, Double> alunoNota = new HashMap<>();

        //Adicionando itens no mapa
        alunoNota.put("Pedro", 8.0);
        alunoNota.put("Pedro", 4.0);
        alunoNota.put("Igor", 7.0);
        alunoNota.put("Israel", 7.0);
        alunoNota.put("Allan", 7.0);
        alunoNota.put("Gustavo Serapião", 7.0);

        //Iteração nas chaves
        for (String chave : alunoNota.keySet()) {
            System.out.println(chave);
        }
        
        //Iteração nas chaves e valores
        alunoNota.entrySet().forEach(kv -> {
            System.out.println(kv.getKey() + kv.getValue());
        });
    }

}
