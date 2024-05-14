package primeirob;

import java.util.Date;

public class Utils {

    public static boolean isDataMaior(Date dataUm, Date dataDois){
        return dataUm.getTime() > dataDois.getTime();
    }

    public static long calcularDiferencaDias(Date dataX) {
        // Obtendo a data atual
        Date dataAtual = new Date();

        // Convertendo a diferença de milissegundos para dias
        Long umDiaEmMs = 86400000l; // Um dia em milissegundos
        long diferencaDias = ((dataAtual.getTime() - dataX.getTime()) / umDiaEmMs);

        return diferencaDias;
    }
}

