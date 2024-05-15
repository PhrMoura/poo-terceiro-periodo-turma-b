package PEDRO_HENRIQUE.prova;

import java.util.Scanner;

public class SistemaHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Cadastrar quarto");
            System.out.println("3. Listar quartos disponíveis");
            System.out.println("4. Reservar quarto");
            System.out.println("5. Realizar check-in");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.next();
                    System.out.print("Idade do cliente: ");
                    int idadeCliente = scanner.nextInt();
                    hotel.cadastrarCliente(nomeCliente, idadeCliente);
                    break;
                case 2:
                    System.out.print("Número do quarto: ");
                    int numeroQuarto = scanner.nextInt();
                    hotel.cadastrarQuarto(numeroQuarto);
                    break;
                case 3:
                    hotel.listarQuartosDisponiveis();
                    break;
                case 4:
                    System.out.print("Número do quarto a reservar: ");
                    int numeroReserva = scanner.nextInt();
                    System.out.print("Nome do cliente: ");
                    String nomeReserva = scanner.next();
                    hotel.reservarQuarto(numeroReserva, nomeReserva);
                    break;
                case 5:
                    System.out.print("Nome do cliente a fazer check-in: ");
                    String nomeCheckIn = scanner.next();
                    hotel.realizarCheckIn(nomeCheckIn);
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
