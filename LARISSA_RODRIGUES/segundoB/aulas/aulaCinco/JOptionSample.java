package segundoB.aulas.aulaCinco;

import java.util.List;
import javax.swing.JOptionPane;

public class JOptionSample {
    public static void main(String[] args) {

        List<String> melhoresProfes = List.of("Rita", "Elenilds", "Andrade", "Sandrolax");

        String nome = JOptionPane.showInputDialog(
        null,
                "Informe seu nome:",
        "INFORME!",
        JOptionPane.INFORMATION_MESSAGE);

        String opcaoSelecionda = (String) JOptionPane.showInputDialog(
                null,
                "Informe seu professor favorito",
                "Informe",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                melhoresProfes.toArray(),
                melhoresProfes.toArray()[1]);

        if (!opcaoSelecionda.equals("Sandrolax")) {
            throw new CustomException("Errado! Seu professor favorito não é esse!");
        }

        System.out.println(nome);
        System.out.println(opcaoSelecionda);
    }
}
