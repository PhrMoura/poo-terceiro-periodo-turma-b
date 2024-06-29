mport java.util.List;
import java.util.Scanner;

public class Main {
    private static AlunoService alunoService = new AlunoService();
    private static TestemunhoService testemunhoService = new TestemunhoService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    listarAlunos();
                    break;
                case 2:
                    criarTestemunho(scanner);
                    break;
                case 3:
                    System.out.println("Encerrando aplicação...");
                    return;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Listar alunos");
        System.out.println("2. Criar registro de testemunho");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void listarAlunos() {
        List<Aluno> alunos = alunoService.listarAlunos();
        if (alunos != null) {
            System.out.println("\nLista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome() + ", RA: " + aluno.getRa());
            }
        } else {
            ModalErro.mostrarErro("Erro ao listar alunos. Tente novamente mais tarde.");
        }
    }

    private static void criarTestemunho(Scanner scanner) {
        System.out.print("Digite a URL da foto: ");
        String urlFoto = scanner.nextLine();

        System.out.print("Digite o RA do aluno: ");
        String ra = scanner.nextLine();

        System.out.print("Digite o texto do testemunho: ");
        String texto = scanner.nextLine();

        Testemunho novoTestemunho = new Testemunho(urlFoto, ra, texto);
        boolean criadoComSucesso = testemunhoService.criarTestemunho(novoTestemunho);

        if (!criadoComSucesso) {
            ModalErro.mostrarErro("Erro ao criar testemunho. Verifique os dados e tente novamente.");
        }
    }
}