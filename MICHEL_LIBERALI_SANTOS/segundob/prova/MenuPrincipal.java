package MICHEL_LIBERALI_SANTOS.segundob.prova;

import javax.swing.JOptionPane;


public class MenuPrincipal {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api";

    public static void main(String[] args) {
        int opcao = exibirMenu();
        
        switch (opcao) {
            case 1:
                listarAlunos();
                break;
            case 2:
                criarTestemunho();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saindo da aplicação...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
    }

    private static int exibirMenu() {
        String[] opcoes = {"Listar Alunos", "Criar Testemunho", "Sair"};
        return JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu Principal", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]) + 1;
    }

    private static void listarAlunos() {
        String endpoint = BASE_URL + "https://poo-exam.vercel.app/api/testimonial";
    }

    private static void criarTestemunho() {
        String fotoUrl = JOptionPane.showInputDialog("Informe a URL da foto:");
        String ra = JOptionPane.showInputDialog("Informe o RA do aluno:");
        String textoTestemunho = JOptionPane.showInputDialog("Digite o texto do testemunho:");

        String endpoint = BASE_URL + "";
    }
}
