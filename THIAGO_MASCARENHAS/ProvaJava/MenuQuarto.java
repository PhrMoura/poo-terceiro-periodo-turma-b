package ProvaJava;

public class MenuQuarto {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.cadastrarCliente("João da Silva", "12345678909");
        hotel.cadastrarCliente("Maria dos Santos", "98765432109");

        hotel.cadastrarQuarto(101, 150.0);
        hotel.cadastrarQuarto(102, 120.0);

        hotel.listarQuartos();

        hotel.reservarQuarto(101, "12345678909");
        hotel.listarQuartos();
    }
}