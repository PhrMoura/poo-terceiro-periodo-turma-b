package LARISSA_RODRIGUES.segundoB.prova;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String opcaoSelecionda = JOptionPane.showInputDialog(
            null,
            "Selecione a opção desejada:\n" +
                    "[1] Listagem de alunos.\n" +
                    "[2] Criar registro de testemunho.\n" +
                    "[3] Sair",
            "Escolha.",
            JOptionPane.QUESTION_MESSAGE);

            switch (opcaoSelecionda) {
                case "1":
                    ListagemAluno.listagemAluno();
                    break;
                case "2":
                    RegistroTestemunho.criarRegistro();
                    break;
                case "3":
                JOptionPane.showMessageDialog(null, "Encerrando o sistema...", "Sair", 1);
                    break;
                default:
                    mensagemErro();
                    break;
            }
    }

    public static void mensagemErro() {
        JOptionPane.showMessageDialog(
                null,
                "Opção inválida.",
                "ERRO!",
                JOptionPane.ERROR_MESSAGE);
    }
}
