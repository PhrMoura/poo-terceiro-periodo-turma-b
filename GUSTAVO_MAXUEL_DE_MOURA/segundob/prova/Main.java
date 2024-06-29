package GUSTAVO_MAXUEL_DE_MOURA.segundob.prova;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {

            Opcoes();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "Erro", 0);
        }
    }

    public static void Opcoes() {
        String[] opcoes = { "Listar Alunos", "Criar Testemunho", "Sair" };

        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Escolha",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        while (escolha != 3) {
            switch (escolha) {
                case 0:
                    String listarAlunosMensagem = ListarAlunos.ListarAlunosAPI();
                    JOptionPane.showMessageDialog(null, listarAlunosMensagem);
                    break;

                case 1:
                    String criarTestemunho = CriarTestemunho.criarTestemunho();
                    JOptionPane.showMessageDialog(null, criarTestemunho);
                    break;

                case 2:

                    JOptionPane.showMessageDialog(null, "Finalizando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você não fez uma escolha válida.");
                    break;
            }

        }

    }
}
