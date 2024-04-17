package primeirob.atividades.uteis;

import java.util.Date;

public class uteis {
  public static long isDataAniversario(Date dataUm, Date dataDois) {
    Long dataEmMS = 86400000l;
    return (dataUm.getTime() - dataDois.getTime()) / dataEmMS;
  }
}
