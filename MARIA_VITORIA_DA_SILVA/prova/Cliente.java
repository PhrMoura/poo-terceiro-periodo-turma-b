package MARIA_VITORIA_DA_SILVA.prova;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private int idade;
    private int cpf;
    private int telefone;

    public Cliente(String nome, int idade, int cpf, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public static Cliente cadastroCliente(Scanner entrada) {
        System.out.println("Qual o nome do cliente? ");
        String nome = entrada.next();
        System.out.println("Qual a idade do cliente? ");
        int idade = entrada.nextInt();
        System.out.println("Qual o CPF do cliente? ");
        int cpf = entrada.nextInt();
        System.out.println("Qual o telefone do cliente? ");
        int telefone = entrada.nextInt();

        return new Cliente(nome, idade, cpf, telefone);
    }

    public static void listaClientes(Cliente[] listaClientes) {
        System.out.println("Lista de clientes cadastrados:");

        for (Cliente cliente : listaClientes) {
            System.out.println("Nome do cliente: " + cliente.getNome());
            System.out.println("Idade do cliente: " + cliente.getIdade());
            System.out.println("CPF do cliente: " + cliente.getCpf());
            System.out.println("Telefone do cliente: " + cliente.getTelefone());
            System.out.println("===================================");
        }
    }
}
