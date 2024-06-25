package ProvaJava;

public class CadastroQuartos {
    private int numero;
    private boolean disponivel;
    private double precoDiaria;

    public CadastroQuartos(int numero, double precoDiaria) {
        this.numero = numero;
        this.disponivel = true;
        this.precoDiaria = precoDiaria;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }
}
