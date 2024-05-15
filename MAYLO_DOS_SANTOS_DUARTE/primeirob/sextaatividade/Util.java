package primeirob.sextaatividade;

import java.util.Date;

public class Util {
    public static Date retornaDataAtual() {
        Date dataAtual = new Date();
        dataAtual.getTime();
        return dataAtual;
        
    }
    
    public static Date retornaDataVencimento() {
        long msDia = 86400000l;
        Date dataAtual = new Date();
        long msNoVencimento = dataAtual.getTime() + (msDia * 3);
        Date dataVencimento = new Date(msNoVencimento);
        return dataVencimento;
    }


    
}
