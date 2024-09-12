import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Atividade2 {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Atividade 2");

        String nome = JOptionPane.showInputDialog(frame, "Digite seu nome:");
        JOptionPane.showMessageDialog(frame, "Seja bem vindo(a) " + nome + "!");
    }
}
