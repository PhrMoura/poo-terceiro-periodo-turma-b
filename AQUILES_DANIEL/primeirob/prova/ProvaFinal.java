package primeirob.prova;

import java.util.Scanner;

public class ProvaFinal {
  public static void main(String[] args) {
    Quarto quartoUm = new Quarto(1, 1, 4);
    Quarto quartoDois = new Quarto(2, 3, 7);
    Quarto quartoTres = new Quarto(3, 9, 4);
    Quarto quartoQuatro = new Quarto(4, 7, 3);
    Quarto quartoCinco = new Quarto(5, 7, 4);

    quartoUm.getListaDeQuartos().add(quartoUm);
    quartoUm.getListaDeQuartos().add(quartoDois);
    quartoUm.getListaDeQuartos().add(quartoTres);
    quartoUm.getListaDeQuartos().add(quartoQuatro);
    quartoUm.getListaDeQuartos().add(quartoCinco);

    System.out.println("Quartos disponiveis: ");
    quartoUm.mostrarListaDeQuartos();

    Cliente clienteUm = new Cliente(4, "Joao", 25, 3);
    Cliente clienteDois = new Cliente(8, "Pedro", 38, 2);

    clienteUm.getListaDeClientes().add(clienteUm);
    clienteUm.getListaDeClientes().add(clienteDois);

    System.out.println("Clientes cadastrados: ");
    clienteUm.mostrarListaDeClientes();

    Scanner input = new Scanner(System.in);
    int escolha = 0;

    while (escolha != 4) {
      System.out.println("****************************************");
      System.out.println("1 - Cadastrar clientes");
      System.out.println("2 - Cadastrar quarto");
      System.out.println("3 - Reservar um quarto");
      System.out.println("4 - Realizar check in");
      System.out.println("****************************************");

      escolha = input.nextInt();

      if (escolha == 1) {
        System.out.println("informe o ID do cliente: ");
        int idCliente = input.nextInt();
        input.nextLine();

        System.out.println("Informe o nome: ");
        String nome = input.nextLine();

        System.out.println("Informe a idade: ");
        int idade = input.nextInt();

        System.out.println("Informe os dias de estadia: ");
        int diasDeEstadia = input.nextInt();

        Cliente cliente = new Cliente(idCliente, nome, idade, diasDeEstadia);
        clienteUm.getListaDeClientes().add(cliente);
        clienteUm.mostrarListaDeClientes();

        Reserva clienteCadastrado = new Reserva();
        clienteCadastrado(clienteCadastrado);
      }

      if (escolha == 2) {
        System.out.println("Informe o ID do quarto: ");
        int idQuarto = input.nextInt();

        System.out.println("Informe o numero: ");
        input.nextLine();
        int numero = input.nextInt();

        System.out.println("Informe a andar: ");
        int andar = input.nextInt();

        Quarto quarto = new Quarto(idQuarto, numero, andar);
        quartoUm.getListaDeQuartos().add(quarto);
        quartoUm.mostrarListaDeQuartos();

        Reserva quartoCadastrado = new Reserva();
        quartoCadastrado(quartoCadastrado);
      }

      if (escolha == 3) {
        System.out.println("Qual o ID do quarto que deseja reservar? ");
        int id = input.nextInt();
        for (int i = 0; i < quartoUm.getListaDeQuartos().size(); i++) {
          Quarto quarto = quartoUm.getListaDeQuartos().get(i);
          if (quarto.getIdQuarto() == id) {
            quartoUm.getListaDeQuartos().remove(i);
            quartoUm.setIdQuartoReservado(id);
          }
        }
        quartoUm.mostrarListaDeQuartos();
      }

      if (escolha == 4) {
        System.out.println("ID do quarto reservado: " + quartoUm.getIdQuartoReservado());
        System.out.println("Check In feito no dia: " + quartoUm.getDataCheckIn());
      }
    }
    input.close();
  }

  public static void clienteCadastrado(Menu implementacao) {
    implementacao.clienteCadastrado();
  }

  public static void quartoCadastrado(Menu implementacao) {
    implementacao.quartoCadastrado();
  }
}