import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Atividade4 {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Atividade 4");

        List<String> lOptions = List.of("Opção 1", "Opção 2", "Opção 3");

        String option = (String) JOptionPane.showInputDialog(frame,
                "Selecione uma opção:",
                "Selecione uma opção:",
                JOptionPane.QUESTION_MESSAGE,
                null,
                lOptions.toArray(),
                lOptions.toArray()[0]);

        JOptionPane.showMessageDialog(frame, "Opção selecionada: " + option + ".");
    }
}
