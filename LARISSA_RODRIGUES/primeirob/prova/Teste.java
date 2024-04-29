package LARISSA_RODRIGUES.primeirob.prova;

import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1- Cadastro de cliente.");
            System.out.println("2- Cadastro de quarto.");
            System.out.println("3- Listar quartos.");
            System.out.println("4- Reservar quarto.");
            System.out.println("5- Realizar check-in do hóspede.");
            System.out.println("6- Sair.");
            System.out.println("Opção escolhida:");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // cadastro cliente
                    System.out.println();
                    ArrayList<Cliente> listaClientes = new ArrayList<>();
                    Cliente.cadastrarCliente(listaClientes, "Fernanda", "000.000.000-00", 35);
                    System.out.println();
                    System.out.println("Clientes cadastrados:");
                    for (Cliente cliente : listaClientes) {
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("CPF: " + cliente.getCpf());
                        System.out.println("Idade: " + cliente.getIdade());
                        System.out.println();
                    }
                    break;
            
                case 2: // cadastro quarto
                    System.out.println();
                    ArrayList<Quarto> listaQuartos = new ArrayList<>();
                    Quarto.cadastrarQuarto(listaQuartos, 01);
                    Quarto.cadastrarQuarto(listaQuartos, 02);
                    Quarto.cadastrarQuarto(listaQuartos, 03);
                    System.out.println();
                    System.out.println("Quartos disponíveis:");
                    for (Quarto quarto : listaQuartos) {
                        System.out.println("Quarto: " + quarto.getNumero());
                    }
                    break;

                case 3: // listar quartos
                    
                    break;

                case 4: // reservar quarto

                    break;

                case 5: // realiar check-in

                    break;

                case 6:
                    System.out.println("Encerrando o sistema . . .");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 6);
        input.close();
        
    }
}
