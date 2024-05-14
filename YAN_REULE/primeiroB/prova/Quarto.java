package YAN_REULE.primeiroB.prova;

public class Quarto {
    private Integer numQuarto;
    private boolean ocupado;
    private Cliente cliente;

    public Quarto(Integer numQuarto, boolean ocupado, Cliente cliente ) {
        this.numQuarto = numQuarto;
        this.ocupado = ocupado;
        this.cliente = cliente;
    }

    public void infosQuarto() {
        System.out.println("Numero:"+ numQuarto );
        System.out.println("Ocupado: " + ocupado);
        System.out.println("Cliente " );
        cliente.infosCliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    public boolean getIsOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
