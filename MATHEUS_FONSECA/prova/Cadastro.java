package MATHEUS_FONSECA.prova;

import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    private String nome;
    private int idade;
    private String email;

    
    public Usuario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }
}

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        while (true) {
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Mostrar lista de usuários");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Usuario novoUsuario = new Usuario(nome, idade, email);
                    listaUsuarios.add(novoUsuario);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de usuários:");
                    for (Usuario usuario : listaUsuarios) {
                        System.out.println("Nome: " + usuario.getNome());
                        System.out.println("Idade: " + usuario.getIdade());
                        System.out.println("Email: " + usuario.getEmail());
                        System.out.println("--------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
