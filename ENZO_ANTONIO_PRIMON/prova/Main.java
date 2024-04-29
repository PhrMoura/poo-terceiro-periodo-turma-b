package ENZO_ANTONIO_PRIMON.prova;

import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        Admin admin = new Admin(null, null);
        while (opcao != 6) {
            
            System.out.println("-----------------------");
            System.out.println("Pressione 1 para cadastrar cliente");
            System.out.println("Pressione 2 para cadastrar quarto");
            System.out.println("Pressione 3 para listar quartos");
            System.out.println("Pressione 4 para reservar quartos");
            System.out.println("Pressione 5 para realizar check-in do hóspede");
            System.out.println("Pressione 62 para sair");
            System.out.println("-----------------------");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome do cliente");
                    String nome = scan.next();

                    Cliente novoCliente = new Cliente(nome);
                    admin.cadastrarClientes(novoCliente);

                break;

                case 2:
                    System.out.println("Insira o número do quarto:");
                    double numeroQuarto = scan.nextDouble();

                    Quarto novoQuarto = new Quarto(numeroQuarto);

                    admin.cadastrarQuarto(novoQuarto);
                break;
                case 3:
                    System.out.println("Mostrando lista");
                    admin.listarQuartos();
                break;
                case 4:
                    System.out.println("Escolha um quarto para reservar");
                    double reservado = scan.nextDouble();
                    
                break;
                case 5:
                    System.out.println("Insira o número do quarto a ser realizado o check-in");

                break;
                case 6:

                break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scan.close();
    }
}
