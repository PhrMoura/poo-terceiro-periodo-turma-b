package BRUNO_GOEDERT_DALMOLIN.prova;

import java.util.Scanner;

/*
 * Parabéns pela entrega, realmente ficou muito acima do resto da turma.👏🚀
 */
public class App {
    public static void main(String[] args) throws Exception {
        int opcaoMenu = 0;
        Scanner scanner = new Scanner(System.in);
        var clienteCtrl = new ClienteController();
        var quartoController = new QuartoController();

        while (opcaoMenu != 7) {
            System.out.println("\n---------------------------");
            System.out.println("------- HOTEL PEDRO -------");
            System.out.println("---------------------------\n");

            System.out.println("(1) Cadastrar Cliente.");
            System.out.println("(2) Listar Clientes.");
            System.out.println("(3) Cadastrar Quarto.");
            System.out.println("(4) Listar Quarto.");
            System.out.println("(5) Reservar Quarto.");
            System.out.println("(6) Chek-in Quarto.");
            System.out.println("(7) Sair.\n");

            System.out.print("Informe uma opcão: ");
            opcaoMenu = scanner.nextInt();

            System.out.println("");

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Opção Selecionada: Cadastrar Cliente.\n");

                    System.out.print("Informe um Nome: ");
                    String nome = scanner.next();

                    System.out.print("Informe um CPF: ");
                    String cnpj = scanner.next();

                    clienteCtrl.cadastrar(nome, cnpj);

                    break;

                case 2:
                    System.out.println("Opção Selecionada: Listar Clientes.");

                    clienteCtrl.listar();

                    break;

                case 3:
                    System.out.println("Opção Selecionada: Cadastrar Quarto.\n");

                    System.out.print("Informe um Nome para o quarto: ");
                    String nomeQuarto = scanner.next();

                    quartoController.cadastrar(nomeQuarto);

                    break;

                case 4:
                    System.out.println("Opção Selecionada: Listar Quartos.");

                    quartoController.listar();

                    break;

                case 5:
                    System.out.println("Opção Selecionada: Reservar Quarto.");

                    clienteCtrl.listar();

                    System.out.print("\nInforme o id de um Cliente para reservar: ");
                    int idCliente = scanner.nextInt();

                    quartoController.listar();

                    System.out.print("\nInforme o id de um Quarto para reservar: ");
                    int idQuarto = scanner.nextInt();

                    quartoController.reservar(idCliente, idQuarto);

                    break;

                case 6:
                    System.out.println("Opção Selecionada: Check-in Quarto.");

                    System.out.print("\nInforme o id de um Quarto para o checkin: ");
                    int idQuartoChekin = scanner.nextInt();

                    quartoController.checkin(idQuartoChekin);

                    break;

                default:
                    System.out.println("A opção selecionada é INVALIDA!");
                    break;
            }

        }

        scanner.close();
    }
}
