package CRYSTHIAN_SMARCK_FEISTAUER.primeiroB.prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    public static class Cliente {
        ArrayList<String> nomeCliente = new ArrayList<>();
        ArrayList<String> quartoCliente = new ArrayList<>();
        ArrayList<String> cpf = new ArrayList<>();

        public Cliente() {
        }
    }

    public class Cadastrar {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();

        public void cadastrarCliente() {
            System.out.println("Entre com o nome do cliente");
            cliente.nomeCliente.add(entrada.nextLine());

            System.out.println("Entre com o cpf do cliente");
            cliente.cpf.add(entrada.nextLine());
        }

        public void cadastrarQuarto() {
            System.out.println("Entre com o número do quarto do cliente");
            String quarto = entrada.nextLine();
            if (cliente.quartoCliente.contains(quarto)) {
                System.out.println("Quarto já reservado");
            } else {
                cliente.quartoCliente.add(quarto);
                System.out.println("Quarto reservado com sucesso");
            }
        }

        public void listarQuartos() {
            System.out.println("Quartos alugados");
            for (int i = 0; i < cliente.quartoCliente.size(); i++) {
                System.out.println("Quarto: " + cliente.quartoCliente.get(i) + " Cliente: " + cliente.nomeCliente.get(i));
            }
        }
    }

    public static class Main{
        public static void Teste(String[] args) {
            Hotel hotel = new Hotel();
            Hotel.Cadastrar cadastro = new Hotel.Cadastrar();

            System.out.println("Cadastro de Clientes:");
            cadastro.cadastrarCliente();
    
            System.out.println("Reserva de Quartos:");
            cadastro.cadastrarQuarto();
    
            System.out.println("Quartos Reservados:");
            cadastro.listarQuartos();
    
        }
    }
}
