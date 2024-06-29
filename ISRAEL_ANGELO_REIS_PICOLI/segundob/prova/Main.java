package ISRAEL_ANGELO_REIS_PICOLI.segundob.prova;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String[] options = { "Listar alunos", "Criar registro", "Sair" };
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (opcao) {
            case 0:

                try {
                    String jsonDataB = ListagemAlunos.getJsonData();
                    if (jsonDataB != null) {

                        JOptionPane.showMessageDialog(null, jsonDataB, "JSON",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao obter dados", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Exceção",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;

            case 1:

                String imageUrl = JOptionPane.showInputDialog(null, "Digite a url da imagem:");
                String description = JOptionPane.showInputDialog(null, "Digite uma descrição:");
                String ra = JOptionPane.showInputDialog(null, "Digite o seu registro de aluno:");

                try {
                    String jsonData = RegistroTestemunho.registroT(imageUrl, description, ra);
                    if (jsonData != null) {

                        JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso", "Registro",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao obter dados", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Exceção",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;

            case 2:

                JOptionPane.showMessageDialog(null, "Terminando...");
                System.exit(0);

                break;

            default:

                break;
        }
    }
}
