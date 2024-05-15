package LARISSA_RODRIGUES.primeirob.prova;

import java.util.ArrayList;

public class Quarto {
    private int numero;
    private ArrayList<Quarto> quartos;
    
    public Quarto (int numero) {
        this.numero = numero;
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

    public void reservarQuarto() {
        
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
}