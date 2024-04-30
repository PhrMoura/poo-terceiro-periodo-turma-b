package ISRAEL_ANGELO_REIS_PICOLI.prova;

public class Quarto {

    private Integer numero;

    private Integer capacidade;

    private Integer andar;

    private Double aluguel;

    public Quarto(Integer numero, Integer capacidade, Integer andar, Double aluguel){
        this.numero = numero;
        this.capacidade = capacidade;
        this.andar = andar;
        this.aluguel = aluguel;
    }

    public void descricaoQuarto(){
        System.out.println("Numero: " + getNumero() + " | Capacidade: " + getCapacidade() + " | Andar: " + getAndar() + " | Aluguel: R$" + getAluguel() + "\n");
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Double getAluguel() {
        return aluguel;
    }

    public void setAluguel(Double aluguel) {
        this.aluguel = aluguel;
    }
}
