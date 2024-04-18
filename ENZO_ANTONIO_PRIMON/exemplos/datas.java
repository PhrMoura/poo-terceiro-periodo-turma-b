package exemplos;

import java.util.Date;

public class datas {
    public static void main(String[] args) {
        
        long msDia = 86400000l;
        Date dataAtual = new Date();

        System.out.println(dataAtual.getTime());

        long msCincoDias = dataAtual.getTime() + (msDia * 5);

        Date cincoDias = new Date(msCincoDias);

        System.out.println(cincoDias);
        
        if (dataAtual.getTime() > cincoDias.getTime()) {

            System.out.println("É maior");
            
        }

        long valorDif = dataAtual.getTime() - cincoDias.getTime();
        long dias = valorDif / msDia;

        System.out.println(dias);
    }
    
}
