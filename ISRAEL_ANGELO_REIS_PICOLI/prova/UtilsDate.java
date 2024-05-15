package ISRAEL_ANGELO_REIS_PICOLI.prova;

import java.util.Date;

public class UtilsDate {

    public static boolean isDataMaior(Date dataUm, Date dataDois){  // Verifica se uma data é maior que a outra.
        return dataUm.getTime() > dataDois.getTime();
    }

    public static int compararDates(Date dataUm, Date dataDois) { // Compara datas;
        return dataUm.compareTo(dataDois);
    }

    public static Date adicionarDias(Date date, int dias) {  // Adiciona dias à uma data.
        Long umDiaEmMs = 86400000l;
        Long novaData = date.getTime() + (dias * umDiaEmMs);
        return new Date(novaData);
    }

    public static Date subtrairDias(Date date, int dias) { // Subtrai dias de uma data.
        return adicionarDias(date, -dias);
    }
}