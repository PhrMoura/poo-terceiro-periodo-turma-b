import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Atividade3 {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Atividade 3");

        int option = JOptionPane.showConfirmDialog(frame, "Deseja continuar?");

        String optionText = "";

        if (option == JOptionPane.YES_OPTION) {
            optionText = "Sim";
        } else if (option == JOptionPane.NO_OPTION) {
            optionText = "Não";
        } else if (option == JOptionPane.CANCEL_OPTION) {
            optionText = "Cancel";
        }

        JOptionPane.showMessageDialog(frame, "Opção selecionada: " + optionText + ".");
    }
}
