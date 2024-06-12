package segundob.Aulas.auladois.aulatres;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionSample {
    private static final String String = null;

    public static void main(String[] args) {

        List<String> melhoresProfes = List.of("Rita", "Elenilton", "Sandrolax");


        String nome = JOptionPane.showInputDialog(
            null,
            "Informe seu nome: ",
            "INFORME!",
            JOptionPane.ERROR_MESSAGE
            );
            
            JFrame frame = new JFrame("seila");

        String opcaoSelecionada = (String) JOptionPane.showInputDialog(
            frame,
            "Informe seu professor favorito",
            "INFORME",
            JOptionPane.QUESTION_MESSAGE,
            null,
            melhoresProfes.toArray(),
            melhoresProfes.toArray()[0]

        );
        JOptionPane.showMessageDialog(frame, "opcao selec" + opcaoSelecionada);

        System.out.println(nome);

        


    }
}
