package segundob.aulas.aulaUm;

import java.util.Date;

public class Reserva {
    
    private Integer id;

    private Cliente cliente;

    private Quarto quarto;

    private Date dataEntrada;
    
    private Date dataSaida;
    
    private Date dataCheckIn;

    private Date dataCheckOut;

    private Double valorTotalDiaria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public Double getValorTotalDiaria() {
        return valorTotalDiaria;
    }

    public void setValorTotalDiaria(Double valorTotalDiaria) {
        this.valorTotalDiaria = valorTotalDiaria;
    }

}