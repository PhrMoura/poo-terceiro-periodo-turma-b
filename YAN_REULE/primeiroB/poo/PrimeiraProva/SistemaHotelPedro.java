package poo.PrimeiraProva;

import java.util.Scanner;

public class SistemaHotelPedro {
    static int quartosCriados = 0;
    static int idClientesCriados = 0;
    static Hotel hotelPedro = new Hotel("Pedro-Hotel", null, null);

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Cadastrar quarto");
            System.out.println("[2] - Cadastrar cliente");
            System.out.println("[3] - Listar Quartos");
            System.out.println("[4] - Listar clientes");
            System.out.println("[5] - Fazer reserva de quarto");
            System.out.println("[6] - Realizar chek-in do hóspede");
            System.out.println("[7] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entradaTeclado.nextInt();

            switch (opcao) {
                case 1:
                    hotelPedro.setQuartos(cadastrarQuarto());
                    break;
                case 2:
                    hotelPedro.setClientes(cadastrarCliente(entradaTeclado));
                    break;
                case 3:
                    listaQuartos(hotelPedro);
                    break;
                case 4:
                    listaClientes(hotelPedro);
                    break;
                case 5:
                    reservaQuarto(hotelPedro, entradaTeclado);
                    break;
                case 6:
                    fazerCheckIn(hotelPedro, entradaTeclado);
                    break;
                case 7:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    public static void fazerCheckIn(Hotel hotel, Scanner entradaTeclado) {
        int idClienteInformado = 0;

        System.out.println("\nInforme o id do cliente\n: ");
        idClienteInformado = entradaTeclado.nextInt();

        for (Quarto item : hotel.getQuartos()) {
            if (item.getCliente().getIdCliente() == idClienteInformado){
                System.out.println("Este cliente está ospedado no quarto Nº: "+item.getNumQuarto());
            }
        }
    }

    public static void reservaQuarto(Hotel hotel, Scanner entradaTeclado) {
        int idClienteInformado = 0;
        int numQuartoInformado = 0;
        System.out.println("Listando clientes cadastrados...");
        hotel.listaClientes();
        System.out.println("\nInforme o id do cliente\n: ");
        idClienteInformado = entradaTeclado.nextInt();

        System.out.println("Listando quartos para reserva...");
        hotel.listaQuartos();
        System.out.println("\n");
        System.out.println("Informe o quarto a ser reservado: ");
        numQuartoInformado = entradaTeclado.nextInt();

        for (Quarto item : hotel.getQuartos()) {
            if (item.getNumQuarto() == numQuartoInformado) {
                for (Cliente item2 : hotel.getClientes()) {
                    if (item2.getIdCliente() == idClienteInformado) {
                        item.setOcupado(true);
                        item.setCliente(item2);
                        item2.setQuartoCliente(item);

                        System.out.println("\n");
                    }
                }
                item.infosQuarto();
                System.out.println("\n");
            }
        }
    }

    public static Quarto cadastrarQuarto() {
        quartosCriados += 1;
        Quarto novoQuarto = new Quarto(quartosCriados, false, new Cliente(null, null, null, 0));
        System.out.println("quarto numero: " + quartosCriados + "º criado com sucesso");
        return novoQuarto;
    }

    public static void listaQuartos(Hotel hotel) {
        hotel.listaQuartos();
    }

    public static void listaClientes(Hotel hotel) {
        hotel.listaClientes();
    }

    public static Cliente cadastrarCliente(Scanner entradaTeclado) {
        idClientesCriados += 1;
        Cliente novoCliente = new Cliente(null, null, null, null);

        novoCliente.setIdCliente(idClientesCriados);
        System.out.println("Informe o nome do cliente: ");
        novoCliente.setNome(entradaTeclado.next());
        System.out.println("Informe o cpf do cliente: ");
        novoCliente.setCpf(entradaTeclado.next());

        novoCliente.clienteCriado();
        return novoCliente;
    }
}
