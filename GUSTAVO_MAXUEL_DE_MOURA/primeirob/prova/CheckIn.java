package GUSTAVO_MAXUEL_DE_MOURA.primeirob.prova;

import java.util.Date;

public class CheckIn {
    private Date dataChegada;
    private Date dataSaida;

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }
    public void CheckIn(Date dataChegada, Date dataSaida){
        this.dataChegada = dataChegada;
        this.dataSaida = dataSaida;


    }
    
}