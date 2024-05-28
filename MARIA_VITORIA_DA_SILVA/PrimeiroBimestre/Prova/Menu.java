package Prova;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        Cliente[] listaClientes = null;
        Quarto[] listaDeQuartos = null;
        do {
            System.out.println("Digite o número da opção desejada: ");
            System.out.println("1- Cadastrar Cliente ");
            System.out.println("2- Cadastrar Quarto ");
            System.out.println("3- Listar Quarto ");
            System.out.println("4- Reserva de Quarto ");
            System.out.println("5- Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    int quantidadeDeClientes = 2;
                    listaClientes = new Cliente[quantidadeDeClientes];
                    for (int i = 0; i < quantidadeDeClientes; i++) {
                        listaClientes[i] = Cliente.cadastroCliente(entrada);
                    }
                    break;
                case 2:
                    int quantidadeDeQuartos = 2;
                    listaDeQuartos = new Quarto[quantidadeDeQuartos];
                    for (int i = 0; i < quantidadeDeQuartos; i++) {
                        listaDeQuartos[i] = Quarto.cadastrarQuarto(entrada);
                    }
                    break;

                case 3:
                    Quarto.listarQuarto(listaDeQuartos);
                    break;

                case 4:
                    CkeckIn.checkin();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 5);
        entrada.close();

    }
}
