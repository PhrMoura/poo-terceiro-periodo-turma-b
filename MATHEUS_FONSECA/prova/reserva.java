package MATHEUS_FONSECA.prova;

public class QuartoHotel {
    ]
    private int numeroQuarto;
    private String tipoQuarto;
    private double preco;
    private boolean ocupado;

    public QuartoHotel(int numeroQuarto, String tipoQuarto, double preco) {

        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.preco = preco;
        this.ocupado = false; 


    }



    public void reservarQuarto() {

        if (ocupado) {
            System.out.println("Desculpe, o quarto número " + numeroQuarto + " já está ocupado.");
        } else {
            ocupado = true;
            System.out.println("Quarto número " + numeroQuarto + " reservado com sucesso.");

        }

    }


}