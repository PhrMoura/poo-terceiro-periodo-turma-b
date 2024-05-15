package MATHEUS_FONSECA.prova;

public class QuartoHotel {
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

 
    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public double getPreco() {
        return preco;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

   
    public void reservarQuarto() {
        ocupado = true;
        System.out.println("Quarto número " + numeroQuarto + " reservado com sucesso.");
    }

   
    public void desocuparQuarto() {
        ocupado = false;
        System.out.println("Quarto número " + numeroQuarto + " desocupado com sucesso.");
    }


    public void exibirInformacoes() {
        System.out.println("Número do Quarto: " + numeroQuarto);
        System.out.println("Tipo do Quarto: " + tipoQuarto);
        System.out.println("Preço: R$" + preco);
        System.out.println("Status: " + (ocupado ? "Ocupado" : "Disponível"));
    }

    public static void main(String[] args) {
        
        QuartoHotel quarto1 = new QuartoHotel(101, "Single", 100.00);
        quarto1.reservarQuarto();
        quarto1.exibirInformacoes();

        System.out.println();

        QuartoHotel quarto2 = new QuartoHotel(201, "Duplo", 150.00);
        quarto2.exibirInformacoes();
    }
}
