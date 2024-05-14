package MAYLO_DOS_SANTOS_DUARTE.primeirob.prova;

import java.util.Date;

public class Reserva {
    
    private String cliente;
    private int quarto;
    private Date dataReserva;
    private Date dataCheckOut;
    private Date dataCheckIn;

    public Reserva(String cliente, int numeroQuarto, int quantidadeDiasReserva) {
        this.cliente = cliente;
        this.quarto = numeroQuarto;
        this.dataReserva = new Date();
        this.dataCheckOut = new Date(dataReserva.getTime() + (quantidadeDiasReserva * 86400000l));
    }

    public Reserva processarCheckIn (Reserva reserva) {
        System.out.println("Processando...");

        var diaCheckIn = new Date();
        reserva.setDataCheckOut(diaCheckIn);

        return reserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    

    
}
