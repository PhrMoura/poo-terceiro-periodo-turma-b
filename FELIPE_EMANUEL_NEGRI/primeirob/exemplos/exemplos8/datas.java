package primeirob.exemplos.exemplos8;

import java.util.Date;

public class datas {
    public static void main(String[] args) {
        
        long msDia = 86400000;
        Date dataAtual = new Date();

        System.out.println(dataAtual.getTime());

        long msCincoDias = dataAtual.getTime() + (msDia * 5);

        

        //Date msCincoDias = new Date(msDaq)
    }
}
