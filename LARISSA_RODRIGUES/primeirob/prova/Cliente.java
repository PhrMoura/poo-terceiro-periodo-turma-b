package LARISSA_RODRIGUES.primeirob.prova;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private ArrayList<Cliente> clientes;


    public Cliente (String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public static void cadastrarCliente(ArrayList<Cliente> clientes, String nome, String cpf, int idade) {
        Cliente cliente = new Cliente(nome, cpf, idade);
        clientes.add(cliente);
        System.out.println("Cadastro completo.");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
