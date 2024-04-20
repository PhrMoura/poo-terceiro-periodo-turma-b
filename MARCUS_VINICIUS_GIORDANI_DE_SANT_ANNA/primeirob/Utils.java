package primeirob;

import java.util.Date;

public class Utils {

    public static boolean isDataMaior(Date dataUm, Date dataDois){
        return dataUm.getTime() > dataDois.getTime();
    }
    
    public static long diaEntreData(Date dataUm, Date dataDois, Date dataTres){
        return dataUm.getTime() - dataDois.getTime() / dataTres.getTime();
    }
}
