package segundob.aulas.revisao;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {
    public static SimpleDateFormat YYYYMMDD = new SimpleDateFormat("dd/MM/yyyy");

    public static Integer diasEntreDatas(Date dataUm, Date dataDois) {
        long msDia = 86400000l;

        long valorDif = dataUm.getTime() - dataDois.getTime();
        long dias = valorDif / msDia;

        return (int) dias;
    }

    // public static Date yyyyMMddToDate(String strDate) throws ParseException {
    //     // return YYYYMMDD.parse(strDate);
    // }

}
