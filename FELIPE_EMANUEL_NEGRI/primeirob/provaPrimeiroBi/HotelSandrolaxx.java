package primeirob.provaPrimeiroBi;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelSandrolaxx {
public static void main(String[] args) {
    int opcao = 0;
    Scanner input = new Scanner(System.in);
    Cliente cliente = new Cliente("Prepti", 18);
    
        ArrayList<Quarto> listarQuartos = new ArrayList<>();
        int escolha = 0;
        
        while (opcao != 6) {
            mostraMenu();
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                
                System.out.println("Insira a idade do cliente");
                int idade = input.nextInt();
                System.out.println("Insira o nome do cliente");
                String nome = input.nextLine();
                input.nextLine();
                
                Cliente clienteNovo = new Cliente(nome, idade);
                
                    System.out.println("Cliente cadastrado!!");
                    break;
                
                case 2:

                    System.out.println("Insira o numero do quarto");
                    int numeroQuarto = input.nextInt();
                    System.out.println("Insira o andar do quarto");
                    int andar = input.nextInt();

                    Quarto quarto = new Quarto(numeroQuarto, andar);
                    listarQuartos.add(quarto);
                    

                    System.out.println("quarto cadastrado!!");
                break;

                case 3:
                    for (Quarto quartinhos : listarQuartos) {
                        System.out.println(quartinhos);
                    }
                break;

                case 4:
                    System.out.println("Deseja reservar um quaro? Reserve colocando o numero do quarto cadastrado: (para voltar aperte 0)");
                    escolha = input.nextInt();
                    
                    if (escolha == 0) {
                        break;
                    }

                    for (int i = 0; i < listarQuartos.size(); i++) {
                        if (listarQuartos.get(i).getNumeroQuarto() != escolha) {
                            listarQuartos.remove(i);
                            i--;
                        }
                        break;
                    }
                break;
                
                case 5:
                    cliente.chekin();
                break;
            
                default:
                System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        

    }

    private static void mostraMenu() {
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Cadastrar quarto");
        System.out.println("3 - Listar quartos");
        System.out.println("4 - Reservar quarto");
        System.out.println("5 - Realizar check-in");
        System.out.println("6 - Finalizar");
    }
}
