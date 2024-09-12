package primeirob.exemplos.aulaseis;

import java.util.Date;

public class DateSamples {
    
    public static void main(String[] args) {

        Date dataAtual = new Date();
        Date dataSemHora = new Date(dataAtual.getYear(), dataAtual.getMonth(), dataAtual.getDate());

        Date cincoAbril = new Date(124, 3, 05);
        Long epochCincoAbril = cincoAbril.getTime();
        
        Long diaAtualEmMilissegundos = dataAtual.getTime();
        Long diaEmMs = 86400000l;

        System.out.println("dataAtual:" + dataAtual);
        System.out.println("dataSemHora:" + dataSemHora);

        System.out.println("epochCincoAbril: " + epochCincoAbril);
        System.out.println("diaEmMilissegundos: " + diaAtualEmMilissegundos);

        System.out.println((dataAtual.getTime() - cincoAbril.getTime()) / diaEmMs);

        if (Utils.isDataMaior(dataAtual, cincoAbril)) {
            System.out.println("É maior!");
        }
    }

}
