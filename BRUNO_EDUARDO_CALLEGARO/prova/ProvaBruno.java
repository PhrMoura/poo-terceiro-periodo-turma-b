package BRUNO_EDUARDO_CALLEGARO.prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProvaBruno { 
    public static void main(String[] args){
        class Cliente {
            String nome;
            String cpf;
            
            public Cliente(String nome, String cpf) {
                this.nome = nome;
                this.cpf = cpf;
            }
        }
        
        class Quarto {
            int numero;
            boolean disponivel;
            
            public Quarto(int numero) {
                this.numero = numero;
                this.disponivel = true;
            }
        }
        
        class Reserva {
            Cliente cliente;
            @SuppressWarnings("unused")
            Quarto quarto;
            
            public Reserva(Cliente cliente, Quarto quarto) {
                this.cliente = cliente;
                this.quarto = quarto;
            }
        }
        
        @SuppressWarnings("unused")
        class Hotel {
            List<Cliente> clientes = new ArrayList<>();
            List<Quarto> quartos = new ArrayList<>();
            List<Reserva> reservas = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            
            public void cadastrarCliente() {
                System.out.println("Digite o nome do cliente:");
                String nome = scanner.nextLine();
                System.out.println("Digite o CPF do cliente:");
                String cpf = scanner.nextLine();
                clientes.add(new Cliente(nome, cpf));
            }
            
            public void cadastrarQuarto() {
                System.out.println("Digite o número do quarto:");
                int numero = scanner.nextInt();
                quartos.add(new Quarto(numero));
            }
            
            public void realizarReserva() {
                System.out.println("Digite o CPF do cliente:");
                String cpf = scanner.nextLine();
                Cliente cliente = null;
                for (Cliente c : clientes) {
                    if (c.cpf.equals(cpf)) {
                        cliente = c;
                        break;
                    }
                }
                if (cliente == null) {
                    System.out.println("Cliente não encontrado.");
                    return;
                }
                System.out.println("Digite o número do quarto:");
                int numero = scanner.nextInt();
                Quarto quarto = null;
                for (Quarto q : quartos) {
                    if (q.numero == numero && q.disponivel) {
                        quarto = q;
                        q.disponivel = false;
                        break;
                    }
                }
                if (quarto == null) {
                    System.out.println("Quarto não disponível.");
                    return;
                }
                reservas.add(new Reserva(cliente, quarto));
                System.out.println("Reserva realizada com sucesso.");
            }
            
            public void listarQuartos() {
                System.out.println("Quartos disponíveis:");
                for (Quarto q : quartos) {
                    if (q.disponivel) {
                        System.out.println("Número: " + q.numero);
                    }
                }
            }
            
            public void realizarCheckin() {
                System.out.println("Digite o CPF do cliente:");
                String cpf = scanner.nextLine();
                for (Reserva r : reservas) {
                    if (r.cliente.cpf.equals(cpf)) {
                        System.out.println("Check-in realizado para o cliente: " + r.cliente.nome);
                        return;
                    }
                }
                System.out.println("Reserva não encontrada para este CPF.");
            }
            
            public static void main(String[] args) {
                Hotel hotel = new Hotel();
                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in);
                int opcao;
                do {
                    System.out.println("1. Cadastrar cliente");
                    System.out.println("2. Cadastrar quarto");
                    System.out.println("3. Realizar reserva");
                    System.out.println("4. Listar quartos disponíveis");
                    System.out.println("5. Realizar check-in");
                    System.out.println("0. Sair");
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 
                    switch (opcao) {
                        case 1:
                            hotel.cadastrarCliente();
                            break;
                        case 2:
                            hotel.cadastrarQuarto();
                            break;
                        case 3:
                            hotel.realizarReserva();
                            break;
                        case 4:
                            hotel.listarQuartos();
                            break;
                        case 5:
                            hotel.realizarCheckin();
                            break;
                        case 0:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                } while (opcao != 0);
            }
        }


    }
}
