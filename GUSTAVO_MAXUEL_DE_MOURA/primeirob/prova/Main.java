package GUSTAVO_MAXUEL_DE_MOURA.primeirob.prova;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        List<CadastroCliente> clientes = new ArrayList<>();
        List<CadastroQuarto> quartos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int opcao = 0;

        while (opcao != 3) {
            System.out.println(
                    "---------------------------\n" +
                            "Menu de opções:\n" +
                            "[1] Cadastrar cliente\n" +
                            "[2] Reservar quarto/Quartos Disponíveis\n" +
                            "[3] Sair\n" +
                            "[4] Check-In\n" +
                            "--------------------------");
            opcao = demo.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = demo.next();
                    System.out.print("Digite o documento: ");
                    int documento = demo.nextInt();

                    clientes.add(new CadastroCliente(nome, documento));
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    CadastroQuarto cadastro = new CadastroQuarto();
                    cadastro.cadastrarQuarto();
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                case 4:
                    try {
                        demo.nextLine();

                        System.out.print("Digite a data de entrada (dd/MM/yyyy): ");
                        Date dataChegada = sdf.parse(demo.nextLine());

                        System.out.print("Digite a data de saída (dd/MM/yyyy): ");
                        Date dataSaida = sdf.parse(demo.nextLine());

                        System.out.println("Reserva feita com sucesso para o período de " +
                                sdf.format(dataChegada) + " até " + sdf.format(dataSaida));
                    } catch (Exception e) {
                        System.out.println("Erro ao ler as datas. Formato incorreto.");
                    }
                    break;

                default:
                    System.out.println("Opção não válida. Escolha novamente.");
            }
        }

        demo.close();
    }
}
