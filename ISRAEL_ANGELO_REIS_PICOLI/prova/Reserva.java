package ISRAEL_ANGELO_REIS_PICOLI.prova;
import java.util.Date;
import java.util.Random;

public class Reserva {

    private static final Random random = new Random();

    private Integer id;

    private Cliente[] cliente;

    private Date dataCriacao;

    private Date dataCheckin;

    private Date fimReserva;

    private Quarto[] quarto;

    public Reserva(Cliente[] cliente, Quarto[] quarto) {
        this.id = numeroRandomId();
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataCriacao = new Date();
        this.quarto = quarto;
    }

    public void gerarDescricaoReserva() {
        System.out.println("Data de criação da reserva: " + dataCriacao);
    }

    private int numeroRandomId() {
        return random.nextInt(100) + 1;
    }

    public static Random getRandom() {
        return random;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public Date getFimReserva() {
        return fimReserva;
    }

    public void setFimReserva(Date fimReserva) {
        this.fimReserva = fimReserva;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public Quarto[] getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto[] quarto) {
        this.quarto = quarto;
    }



}
