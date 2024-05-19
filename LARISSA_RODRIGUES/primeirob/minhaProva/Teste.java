package primeiroB.minhaProva;
import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Quarto> quartos = new ArrayList<>();
        
        do {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Cadastro de cliente.");
            System.out.println("2 - Cadastro de quarto.");
            System.out.println("3 - Reservar quarto.");
            System.out.println("4 - Realizar check-in do hóspede.");
            System.out.println("5 - Sair.");
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
                    Quarto.cadastrarQuarto(quartos, 01);
                    Quarto.cadastrarQuarto(quartos, 02);
                    Quarto.cadastrarQuarto(quartos, 03);
                    System.out.println();
                    System.out.println("Quartos disponíveis:");
                    for (Quarto quarto : quartos) {
                        System.out.println("Número do quarto: " + quarto.getNumero());
                    }
                    System.out.println();
                    break;

                case 3: // reservar quarto
                
                    break;

                case 4: // realiar check-in

                    break;

                case 5:
                    System.out.println("Encerrando o sistema . . .");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);
        input.close();
    }
}
