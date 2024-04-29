package GISLAINE_MARIA_HIGUTI.primeirob.prova;


import java.util.ArrayList;

public class Quarto {
     
    Integer numero;
    Integer disponivel;

    ArrayList<Quarto> quartos = new ArrayList<>();

    public Quarto ( Integer numero, Integer disponivel){
        this.numero = numero;
        this.disponivel = disponivel;
    }

    public void cadastrarQuarto (Integer numero, Integer disponivel) {
        Quarto quarto = new Quarto(numero, disponivel);
        System.out.println("0 = disponivel \n 1 = ocupado");
        quarto.setNumero(1);
        quarto.setDisponivel(0);     
        quarto.adicionarQuarto(quarto);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Integer disponivel) {
        this.disponivel= disponivel;
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    } 

    public void listarQuartos() {
        System.out.println("~~~~ Lista de Quartos ~~~~");
        for (Quarto quarto : quartos) {
            System.out.println("Número do Quarto: " + quarto.getNumero());
            System.out.println("Disponível: " + (quarto.getDisponivel() == 0 ? "Sim" : "Não"));
            System.out.println("-------------------------");
        }
    }
}
