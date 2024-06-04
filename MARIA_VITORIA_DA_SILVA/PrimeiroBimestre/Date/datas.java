package Date;

import java.util.Date;

public class datas {
    public static void main(String[] args) {
        Date dataAtual = new Date();
        Date dataSemHora = new Date(dataAtual.getYear(), dataAtual.getMonth(), dataAtual.getDate());

        Date cincoAbril = new Date(124, 3, 5); // 5 de abril de 2024
        Long epochCincoAbril = cincoAbril.getTime();

        Long diaAtualEmMilissegundos = dataAtual.getTime();
        Long diaEmMs = 86400000l;

        System.out.println("Data atual: " + dataAtual);
        System.out.println("Data sem hora: " + dataSemHora);

        System.out.println("epochCincoAbril: " + epochCincoAbril);
        System.out.println("diaAtualEmMilissegundos: " + diaAtualEmMilissegundos);
        System.out.println("cinco de abril: " + cincoAbril);

        System.out.println("Diferença entre data atual e cinco de abril: " + (diaAtualEmMilissegundos - epochCincoAbril) / diaEmMs);

        if(dataAtual.getTime() >  cincoAbril.getTime()) {
            System.out.println("A data atual é maior que cinco de abril");
        } else {
            System.out.println("A data atual é menor que cinco de abril");
        }
    }
}
