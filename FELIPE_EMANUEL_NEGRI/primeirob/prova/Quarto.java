package primeirob.prova;

import java.util.ArrayList;

public class Quarto {
    private int numeroQuarto;
    private int andar;
    private ArrayList<Quarto> listarQuartos;

    public Quarto(int numeroQuarto, int andar) {
        this.numeroQuarto = numeroQuarto;
        this.andar = andar;
    }
    public int getNumeroQuarto() {
        return numeroQuarto;
    }
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    
    public void listarQuartos(ArrayList<Quarto> quartos){
        this.listarQuartos = quartos;
    }
    
    public ArrayList<Quarto> getQuartos() {
        return listarQuartos;
    }
    public void setQuartos(ArrayList<Quarto> listarQuartos) {
        this.listarQuartos = listarQuartos;
    }

    @Override
    public String toString(){
        return "Numero do quarto: " + numeroQuarto + " Andar do quarto: " + andar;
    }


}
