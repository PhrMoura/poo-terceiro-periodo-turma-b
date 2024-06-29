package BRUNO_EDUARDO_CALLEGARO.prova;

import java.util.Scanner;

public class menu {
    private Scanner scanner;

    public menu() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("=== Menu ===");
            System.out.println("1. Listagem dos alunos");
            System.out.println("2. Criar registro de testemunho");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    listarAlunos();
                    break;
                case 2:
                    criarTestemunho();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void listarAlunos() {
       
        System.out.println("=== Listagem dos Alunos ===");
        System.out.println("Listando alunos...");
        System.out.println("Nome:Bruno eduardo callegaro de jesus\tRA: 11558");
    }

    private void criarTestemunho() {
        System.out.println("=== Criar Registro de Testemunho ===");

        System.out.print("Digite a URL da imagem: ");
        String imageUrl = scanner.nextLine();

        System.out.print("Digite o texto do testemunho: ");
        String description = scanner.nextLine();

        System.out.print("Digite o RA do aluno: ");
        String ra = scanner.nextLine();

        
        boolean sucesso = enviarTestemunho(imageUrl, description, ra);

        if (sucesso) {
            System.out.println("Testemunho criado com sucesso para o aluno de RA " + ra);
        } else {
            System.out.println("Erro ao criar testemunho para o aluno de RA " + ra);
        }
    }

    private boolean enviarTestemunho(String imageUrl, String description, String ra) {
        return true; 
    }
}
