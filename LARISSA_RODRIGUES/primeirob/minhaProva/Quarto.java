package primeiroB.minhaProva;
import java.util.ArrayList;

public class Quarto {
    private int numero;
    private boolean reservado;
    private ArrayList<Quarto> quartos;
    
    public Quarto (int numero) {
        this.numero = numero;
        this.reservado = false;
    }

    public static void cadastrarQuarto(ArrayList<Quarto> quartos, int numero) {
        Quarto quarto = new Quarto(numero);
        quartos.add(quarto);
        System.out.println("Quarto cadastrado.");
    }

    public void listarQuartos() {
        for (Quarto quarto : quartos) {
            System.out.println("Número do quarto: " + quarto.getNumero());
        }
    }

    public void reservarQuarto(int numero) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numero) {
                if (quarto.isReservado()) {
                    quarto.setReservado(true);
                    System.out.println("Quarto número " + numero + " reservado.");
                } else {
                    System.out.println("Quarto número " + numero + " já está reservado.");
                }
                return;
            }
        }
        System.out.println("Quarto número " + numero + " não encontrado.");
    }


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }
    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
    public boolean isReservado() {
        return reservado;
    }
    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
}
