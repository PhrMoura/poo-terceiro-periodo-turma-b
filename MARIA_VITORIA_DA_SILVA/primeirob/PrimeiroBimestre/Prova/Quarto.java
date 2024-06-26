package primeirob.PrimeiroBimestre.Prova;

import java.util.Scanner;

public class Quarto {
    int numeroDeQuarto;
    int quantidadeDeCamas;

    public Quarto(int numeroDeQuarto, int quantidadeDeCamas) {
        this.numeroDeQuarto = numeroDeQuarto;
        this.quantidadeDeCamas = quantidadeDeCamas;
    }

    public int getNumeroDeQuarto() {
        return numeroDeQuarto;
    }

    public int getQuantidadeDeCamas() {
        return quantidadeDeCamas;
    }

    public static Quarto cadastrarQuarto(Scanner entrada) {
        System.out.println("Qual o número do quarto? ");
        int numeroDeQuarto = entrada.nextInt();
        System.out.println("Quantas camas tem no quarto? ");
        int quantidadeDeCamas = entrada.nextInt();

        return new Quarto(numeroDeQuarto, quantidadeDeCamas);
    }

    public static void listarQuarto(Quarto[] listaDeQuartos) {
        System.out.println("Lista de quartos cadastrados:");

        for (Quarto quarto : listaDeQuartos) {
            System.out.println("Número do quarto: " + quarto.getNumeroDeQuarto());
            System.out.println("Quantidade de camas: " + quarto.getQuantidadeDeCamas());
            System.out.println("===================================");
        }
    }
    
    public static void reservarQuarto(Scanner entrada, Quarto[] listaDeQuartos, Cliente[] listaClientes, CkeckIn checkin){
        System.out.println("Lista de Quartos disponiveis: ");
        for (Quarto quarto : listaDeQuartos) {
            System.out.println("===================================");
            System.out.println("Número do quarto: " + quarto.getNumeroDeQuarto());
            System.out.println("Quantidade de camas: " + quarto.getQuantidadeDeCamas());
        }
        System.out.println("Digite o número do quarto que deseja reservar: ");
        int quartoEscolhido = entrada.nextInt();

        System.out.println("Qual cliente deseja reservar o quarto? ");
        for (Cliente cliente : listaClientes) {
            System.out.println("===================================");
            System.out.println("Nome do cliente: " + cliente.getNome());;
            System.out.println("CPF do cliente: " + cliente.getCpf());
        }
        System.out.println("Digite o CPF do cliente que deseja reservar o quarto: ");
        int cpfCliente = entrada.nextInt();
        System.out.println("===================================");
        System.out.println("Quarto reservado com sucesso!");
        System.out.println("===================================");

        
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.getNumeroDeQuarto() == quartoEscolhido) {
                quartoEscolhido = quarto.getNumeroDeQuarto();
                break;
            }
        }

        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf() == cpfCliente) {
                cpfCliente = cliente.getCpf();
                break;
            }
        }

        if (quartoEscolhido != 0) {
            CkeckIn.checkin();
        } else {
            System.out.println("===================================");
            System.out.println("Quarto não encontrado. Reserva não realizada.");
            System.out.println("===================================");
        }
    }
}
