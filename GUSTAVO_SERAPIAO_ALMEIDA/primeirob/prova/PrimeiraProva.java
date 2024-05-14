package GUSTAVO_SERAPIAO_ALMEIDA.primeirob.prova;

import java.util.Scanner;

public class PrimeiraProva {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;
        int escolha;
        int escolhaQuarto;

        Clientes cliente = null;

        Quartos quartosUm = new Quartos(null, null, null, null, null);
        quartosUm.setReservado(true);
        quartosUm.setNumQuarto(1);
        Quartos quartosDois = new Quartos(null, null, null, null, null);
        quartosDois.setReservado(false);
        quartosDois.setNumQuarto(2);

        System.out.println("\n--- Hotel do Pedro ---");

        System.out.println("\nInsira o nome do hóspede: ");
        String nome = scanner.nextLine();

        System.out.println("Insira o CPF");
        String cpf = scanner.nextLine();

        System.out.println("Insira a idade");
        short idade = scanner.nextShort();

        cliente = new Clientes(nome, cpf, idade);

        System.out.println("Hóspede Registrado!");

        do {
            System.out.println("\n--- Hotel do Pedro ---");
            System.out.println("[1] Cadastrar Quarto");
            System.out.println("[2] Lista de Quartos");
            System.out.println("[3] Realizar Check-in do hóspede");
            System.out.println("[4] Sair \n");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nEscolha um quarto\n");

                    System.out.println("Quarto " + quartosUm.getNumQuarto());

                    if (quartosUm.getReservado()) {
                        System.out.println("Situação: Reservado");
                    } else {
                        System.out.println("Situação: Vago\n");
                    }

                    System.out.println("Quarto " + quartosDois.getNumQuarto());
                    if (quartosDois.getReservado()) {
                        System.out.println("Situação: Reservado");
                    } else {
                        System.out.println("Situação: Vago\n");
                    }

                    escolhaQuarto = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaQuarto == 1) {
                        if (!quartosUm.getReservado()) {
                            quartosUm.setReservado(true);
                            System.out.println("Quarto Reservado");
                            quartosUm.setNome(cliente.getNome());
                        } else {
                            System.out.println("O quarto já está reservado");
                        } 
                    } else if (escolhaQuarto == 2) {
                        if (!quartosDois.getReservado()) {
                            quartosDois.setReservado(true);
                            System.out.println("Quarto Reservado");
                            quartosDois.setNome(cliente.getNome());
                        } else {
                            System.out.println("O quarto já está reservado");
                        }
                    } else {
                        System.out.println("Escolha inválida");
                    }
                    break;

                case 2:
                    if (quartosUm != null) {
                        System.out.println("Quarto " + quartosUm.getNumQuarto());
                        if (quartosUm.getReservado()) {
                            System.out.println("Situação: Reservado por " + quartosUm.getNome());
                        } else {
                            System.out.println("Situação: Vago\n");
                        }
                    } else {
                        System.out.println("Quarto 1 não disponível");
                    }

                    if (quartosDois != null) {
                        System.out.println("Quarto " + quartosDois.getNumQuarto());
                        if (quartosDois.getReservado()) {
                            System.out.println("Situação: Reservado por " + quartosDois.getNome());
                        } else {
                            System.out.println("Situação: Vago\n");
                        }
                    } else {
                        System.out.println("Quarto 2 não disponível");
                    }
                    break;
                
                case 3:
                    if (quartosUm != null && quartosDois != null) {
                        System.out.println("Nome: ");
                        String nome2 = scanner.nextLine();

                        if (nome2.equals(quartosUm.getNome())) {
                            System.out.println("O hóspede " + cliente.getNome() + " está registrado no quarto " + quartosUm.getNumQuarto());
                        } else if (nome2.equals(quartosDois.getNome())){
                            System.out.println("O hóspede " + cliente.getNome() + " está registrado no quarto " + quartosDois.getNumQuarto());
                        } else {
                            System.out.println("Registro não encontrado");
                        }
                    } else {
                        System.out.println("Quartos não disponíveis para check-in");
                    }
                    break;

                case 4: 
                    sair = true;
                    break;
            
                default:
                    System.out.println("Valor inválido");
                    break;
            }

        } while (!sair);
        
    }
}
