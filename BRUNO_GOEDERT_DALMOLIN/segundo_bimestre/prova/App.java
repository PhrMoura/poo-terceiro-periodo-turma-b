package BRUNO_GOEDERT_DALMOLIN.segundo_bimestre.prova;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Prova 2º Bimestre");

        String optionsText = "Selecione uma opção: \n\n" +
                "[1] Listagem dos Alunos\n" +
                "[2] Criar Testemunho. \n" +
                "[3] Sair.\n ";

        String option = JOptionPane.showInputDialog(frame, optionsText, "Prova 2º Bimestre",
                JOptionPane.QUESTION_MESSAGE);

        switch (option) {
            case "1":
                new MenuController().listarEstudantes();
                break;

            case "2":
                new MenuController().cadastrarTestemunho();
                break;

            case "3":
                break;

            default:
                JOptionPane.showMessageDialog(new JFrame(), "Opção selecionada é invalida!", "Atenção!",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }

    }
}