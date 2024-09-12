package MICHEL_LIBERALI_SANTOS.primeirob.prova;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.cadastrarCliente("Michel", "123.456.789-00", "21/07/2004", "(45)99988-0115");

        hotel.cadastrarQuarto(101, "Padrão");

        System.out.println("Quartos disponíveis:");
        hotel.listarQuartosDisponiveis();
    }
}
