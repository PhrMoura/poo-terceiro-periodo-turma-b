package primeirob.prova;

public class Quarto {
    private int numeroQuarto;

    private String tipoQuarto;

    private Double valorQuarto;

    private Boolean status;

    public Quarto(int numeroQuarto, String tipoQuarto, Double valorQuarto, Boolean status) {
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.valorQuarto = valorQuarto;
        this.status = status;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public Double getValorQuarto() {
        return valorQuarto;
    }

    public void setValorQuarto(Double valorQuarto) {
        this.valorQuarto = valorQuarto;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    

    
}