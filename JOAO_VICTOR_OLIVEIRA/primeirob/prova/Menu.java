package JOAO_VICTOR_OLIVEIRA.primeirob.prova;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 3) {
        System.out.println("Bem-vindo(a) ao menu. Escolha uma das opções:");
        System.out.println("1. Reservar um quarto.");
        System.out.println("2. Mostrar reservas.");
        System.out.println("3. Sair.");
        opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarReserva();
                    break;

                case 2:
                    listarReservas();
                    break;

                case 3:
                    break;
            
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        }
    }

    public static void realizarReserva() {
        Scanner scanner = new Scanner(System.in);
        String quartoum;
        String quartodois;
        String quartotres;

        System.out.println("Informe o nome do cliente:");
        String cliente = scanner.nextLine(); 

        System.out.println("Escolha o número do quarto:");
        System.out.println("[Quarto Nº1] [Quarto Nº2] [Quarto Nº3]");
        int opcao_quarto = scanner.nextInt();

        switch (opcao_quarto) {
            case 1:
                quartoum = cliente;
                listarReservas(opcao_quarto, quartoum);
                break;

            case 2:
                quartodois = cliente;
                listarReservas(opcao_quarto, quartodois);
                break;

            case 3:
                quartotres = cliente;
                listarReservas(opcao_quarto, quartotres);
                break;
        
            default:
                System.out.println("Informe um quarto existente.");
                break;
        }
    }

    public static void listarReservas(int opcao, String nome_cliente) {
        String quartoum;
        String quartodois;
        String quartotres;
        
        switch (opcao) {
            case 1:
                quartoum = nome_cliente;
                quartodois = null;
                quartotres = null;
                break;

            case 2:
                quartoum = null;
                quartodois = nome_cliente;
                quartotres = null;
                break;

            case 3:
                quartoum = null;
                quartodois = null;
                quartotres = nome_cliente;
                break;
        }

        System.out.println("Reservas:");
        System.out.println("Quarto Nº1: ");
        System.out.println("Quarto Nº1: "+ quartoum);
        System.out.println("Quarto Nº2: "+ quartodois);
        System.out.println("Quarto Nº3: "+ quartotres);
    }
}
