package primeirob.prova;

import java.util.Scanner;

/*
 * Parabéns pela entrega, ficou excelente! Tu tem futuro🚀
 */
public class PrimeiraProva {
    public static void main(String[] args) {

        Hotel hotelMatriz = new Hotel();

        Scanner scanner = new Scanner(System.in);
        
        int tempOp = 0;

        while (tempOp != 3) {
            System.out.println("1 - Funcionario");
            System.out.println("2 - Cliente");
            System.out.println("3 - Sair");
            tempOp = scanner.nextInt();

            switch (tempOp) {
                case 1:
                    int tempOpFuncionario = 0;

                    while (tempOpFuncionario != 3) {
                        System.out.println("1 - Cadastrar quarto");
                        System.out.println("2 - Cadastro de cliente");
                        System.out.println("3 - Voltar");

                        tempOpFuncionario = scanner.nextInt();
                            switch (tempOpFuncionario) {
                                case 1:
                                    System.out.println("Numero do quarto: ");
                                    int numeroQuarto = scanner.nextInt();
                                    System.out.println("Tipo do quarto: ");
                                    String tipoQuarto = scanner.next();
                                    System.out.println("Valor da diaria do quarto: ");
                                    double valorQuarto = scanner.nextDouble();

                                    var tempListaQuartos = hotelMatriz.getListaQuartos();
                                    tempListaQuartos.add(new Quarto(numeroQuarto, tipoQuarto, valorQuarto, false));
                                    hotelMatriz.setListaQuartos(tempListaQuartos);
                                    break;
                                case 2:
                                    System.out.println("Nome do cliente: ");
                                    String nome = scanner.next();
                                    System.out.println("Idade do cliente: ");
                                    int idade = scanner.nextInt();

                                    var tempListaClientes = hotelMatriz.getListaClientes();
                                    tempListaClientes.add(new Cliente(nome, idade));
                                    hotelMatriz.setListaClientes(tempListaClientes);
                                    break;
                                case 3:
                                    break;
                            
                                default:
                                    System.out.println("Erro: Opção incorreta");
                                    break;
                            }
                    }
                    
                    break;
                case 2:
                    int tempOpCliente = 0;

                    while (tempOpCliente != 4) {
                        System.out.println("1 - Listar Quartos Disponiveis");
                        System.out.println("2 - Reservar um quarto");
                        System.out.println("3 - Realizar check-in");
                        System.out.println("4 - Voltar");

                        tempOpCliente = scanner.nextInt();

                        switch (tempOpCliente) {
                            case 1:
                                System.out.println("-------------------------------------");
                                hotelMatriz.exibirListaQuartos();
                                break;
                            case 2:
                                System.out.println("Qual o numero do quarto que ira ser feito a reserva?");
                                int numeroQuarto = scanner.nextInt();
                                System.out.println("Qual o nome do cliente?");
                                String nome = scanner.next();
                                System.out.println("Quantos dias será reservado?");
                                int quantidadeDiasReserva = scanner.nextInt();
                                
                                for (Quarto quarto : hotelMatriz.getListaQuartos()) {
                                    if (quarto.getNumeroQuarto() == numeroQuarto) {
                                        quarto.setStatus(true);;
                                    }
                                }

                                var tempListaReservas = hotelMatriz.getListaReservas();
                                tempListaReservas.add(new Reserva(nome, numeroQuarto, quantidadeDiasReserva));
                                hotelMatriz.setListaReservas(tempListaReservas);
                                break;
                            case 3:
                                System.out.println("Quarto reservado: ");
                                int tempQuarto = scanner.nextInt();

                                for (Reserva reserva : hotelMatriz.getListaReservas()) {
                                    if (reserva.getQuarto() == tempQuarto) {
                                        reserva.processarCheckIn(reserva);
                                        System.out.println("Check-in Concluido");
                                    }
                                }
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Erro: Opção Incorreta");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Erro: Opção incorreta");
                    break;
            }
        }

        scanner.close();
    }
}
