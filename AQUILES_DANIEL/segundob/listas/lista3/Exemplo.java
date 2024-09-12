package segundob.listas.lista3;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exemplo {
  public static void main(String[] args) {
    List<String> melhoresProfessores = List.of("Rita", "Sandrolax", "Helena");

    String nome = JOptionPane.showInputDialog(
        null,
        "Informe seu nome",
        "INFORME!",
        JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null, "Nome informado: " + nome, null, JOptionPane.INFORMATION_MESSAGE);

    JFrame frame = new JFrame("seila");

    String opcaoSelecionada = (String) JOptionPane.showInputDialog(null,
        "Informe seu professor favorito",
        "Informe",
        JOptionPane.QUESTION_MESSAGE,
        null,
        melhoresProfessores.toArray(),
        melhoresProfessores.toArray()[0]);

    JOptionPane.showMessageDialog(frame, "opção Selecionada: " + opcaoSelecionada);

    JOptionPane.showMessageDialog(frame, "ATENÇÃO", "✝💨💫💢💌", JOptionPane.WARNING_MESSAGE);

    System.exit(0);

  }
}
