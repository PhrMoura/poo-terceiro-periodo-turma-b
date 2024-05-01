package segundob.aulas.revisaoprova;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        Integer indiceCliente = 0;
        Integer indiceQuarto = 0;
        Integer indiceReserva = 0;
        Cliente[] clientes = new Cliente[100];
        Quarto[] quartos = new Quarto[100];
        Reserva[] reservas = new Reserva[100];

        while (true) {
            showMenu();

            Integer opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    clientes[indiceCliente] = criarCliente(indiceCliente);

                    indiceCliente++;
                    break;
                case 2:
                    Scanner iTres = new Scanner(System.in);
                    Quarto quarto = new Quarto();

                    System.out.println("Informe a descricao:");
                    quarto.setDescricao(iTres.nextLine());

                    System.out.println("Informe o numero:");
                    quarto.setNumero(iTres.nextInt());

                    System.out.println("Informe o valor da diaria:");
                    quarto.setValorDiaria(iTres.nextDouble());

                    quarto.setId(indiceQuarto);

                    quartos[indiceQuarto] = quarto;

                    indiceQuarto++;
                    break;
                case 3:
                    System.out.println("Listagem Quartos");

                    for (int i = 0; i < quartos.length; i++) {
                        if (quartos[i] != null) {
                            System.out.print(quartos[i].getId() + " - ");
                            System.out.print(quartos[i].getDescricao() + " - ");
                            System.out.print(quartos[i].getNumero() + " - ");
                        }
                    }

                    break;
                case 4:
                    SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy/MM/dd");
                    System.out.println("Informe seu id de usuário:");
                    Cliente clienteReserva = buscarPorId(clientes, input.nextInt());
                    System.out.println("Informe seu id de quarto:");
                    Quarto quartoReserva = buscarPorId(quartos, input.nextInt());

                    if (clienteReserva == null) {
                        System.out.println("Cliente não encontrado!");

                        break;
                    }

                    if (quartoReserva == null) {
                        System.out.println("Quarto não encontrado!");

                        break;
                    }

                    Reserva reserva = new Reserva();
                    input.nextLine();
                    System.out.println("Informe data inicial reserva!(yyyy-MM-dd)");
                    input.nextLine();// Limpar buffer

                    reserva.setDataEntrada(dateFormater.parse(input.nextLine()));
                    System.out.println("Informe data saida reserva!(yyyy-MM-dd)");
                    input.nextLine();// Limpar buffer
                    reserva.setDataSaida(dateFormater.parse(input.nextLine()));

                    reserva.setCliente(clienteReserva);
                    reserva.setQuarto(quartoReserva);
                    reserva.setId(indiceReserva);

                    reservas[indiceReserva] = reserva;

                    indiceReserva++;
                    break;
                case 7:
                    return;
                default:
                    break;
            }
        }

    }

    public static void showMenu() {
        System.out.println(" SISTEMA - HOTEL ");
        System.out.println("[1] CADASTRO CLIENTE ");
        System.out.println("[2] CADASTRO QUARTO ");
        System.out.println("[3] LISTAGEM QUARTO ");
        System.out.println("[4] REALIZAR RESERVA ");
        System.out.println("[5] REALIZAR CHECK-IN ");
        System.out.println("[6] VERIFICAR DISPONIBILIDADE ");
        System.out.println("[7] VERIFICAR DISPONIBILIDADE ");
    }

    public static Cliente criarCliente(Integer indiceCliente) {
        Scanner iDois = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Informe o nome:");
        cliente.setNome(iDois.nextLine());

        System.out.println("Informe a idade:");
        cliente.setIdade(iDois.nextInt());
        cliente.setId(indiceCliente);

        return cliente;
    }

    public static Cliente buscarPorId(Cliente[] clientes, Integer idCliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getId().equals(idCliente)) {
                return clientes[i];
            }
        }

        return null;
    }

    public static Quarto buscarPorId(Quarto[] quartos, Integer idQuarto) {
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null && quartos[i].getId().equals(idQuarto)) {
                return quartos[i];
            }
        }

        return null;
    }

}
