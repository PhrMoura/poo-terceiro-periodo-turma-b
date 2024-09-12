package ISRAEL_ANGELO_REIS_PICOLI.prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Solucao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Quarto> quartoLista = new ArrayList<>();
        ArrayList<Cliente> clienteLista = new ArrayList<>();
        ArrayList<Reserva> listaReserva = new ArrayList<>();

        Gerente gerente = new Gerente("Johnny", 35);

        CheckinQuarto checkinQuarto = new CheckinQuarto();
        Reserva reserva = null;

        int opcao;

        do {
            System.out.println("Menu gerente:"); // Menu do gerente.
            System.out.println("[1] - Cadastrar cliente");
            System.out.println("[2] - Cadastrar quarto");
            System.out.println("[3] - Realizar check-in do hóspede");

            System.out.println("-------------------------------");

            System.out.println("Menu cliente:"); // Menu do cliente.
            System.out.println("[4] - Listar quartos");
            System.out.println("[5] - Fazer reserva de quarto");
            System.out.println("[6] - Dados da reserva");
            System.out.println("[0] - Sair do menu\n");

            opcao = leitor.nextInt();
            leitor.nextLine();

            int cont = 0;
            int contDois = 0;

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = leitor.nextLine();

                    System.out.println("Digite a idade do cliente: ");
                    Integer idade = leitor.nextInt();

                    Cliente cliente = new Cliente(nome, idade);
                    clienteLista.add(cliente);

                    break;

                case 2:
                    System.out.println("Digite o numero do quarto: ");
                    Integer numero = leitor.nextInt();

                    System.out.println("Digite a capacidade (Pessoas) do quarto: ");
                    Integer capacidade = leitor.nextInt();

                    System.out.println("Digite o andar em que está o quarto. (Hotel com 5 andares) ");
                    Integer andar = leitor.nextInt();

                    System.out.println("Digite o preço de aluguel do quarto: ");
                    Double aluguel = leitor.nextDouble();

                    Quarto quarto = new Quarto(numero, capacidade, andar, aluguel);
                    quartoLista.add(quarto);
                    break;

                case 3:
                if (reserva != null) {
                    checkinQuarto.confirmarCheckin(reserva);
                } else {
                    System.out.println("Nenhum pedido foi criado");
                }
                    break;

                case 4:
                    if (!quartoLista.isEmpty()) {
                        System.out.println("Lista de quartos disponíveis:\n");
                        for (Quarto quartos : quartoLista) {

                            System.out.println("Quarto: " + cont);
                            quartos.descricaoQuarto();

                            cont++;
                        }
                    } else {
                        System.out.println("Nenhum quarto disponível no momento");
                    }
                    break;

                case 5:

                    if (!quartoLista.isEmpty()) {
                        System.out.println("Lista de quartos disponíveis:\n");
                        for (Quarto quartos : quartoLista) {

                            System.out.println("Quarto: " + cont);
                            quartos.descricaoQuarto();
                            cont++;
                        }
                    
                    System.out.println("Selecione o quarto que o cliente irá reservar pela posição de vetor: ");
                    int posicaoQuarto = leitor.nextInt();



                        for (Cliente clientes : clienteLista) {
                            
                            System.out.println("Cliente: " + contDois);
                            clientes.apresentarse();
                            contDois++;
                        }
                        System.out.println("Selecione qual cliente irá reserva um quarto pela posição de vetor: ");
                        int posicaoCliente = leitor.nextInt();

     
                        reserva = checkinQuarto.criarReserva(new Cliente[] {clienteLista.get(posicaoCliente)}, new Quarto[] {quartoLista.get(posicaoQuarto)});
                        listaReserva.add(reserva);
                       // reserva = checkinQuarto.criarReserva(new Cliente[] {clienteLista.get(posicaoCliente)}, new Quarto[] {quartoLista.get(posicaoQuarto)});

                        
                    } else {
                        System.out.println("Nenhum quarto disponível no momento");
                    }
                    break;
                    case 6:
                    if (!listaReserva.isEmpty()) {
                        System.out.println("Lista de reservas disponíveis:\n");
                        for (Reserva reservas : listaReserva) {
                            System.out.println("Reserva: " + cont);
                            reservas.gerarDescricaoReserva();
                            cont++;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Operação inválida...");
            }

        } while (opcao != 0);
    }

}
