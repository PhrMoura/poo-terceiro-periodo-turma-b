package segundob.aulas.aula5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        List<String> melhoresProfes = List.of("Rita", "Elenilds", "Andrade");  

        // String npme = JOptionPane.showInputDialog(
        //     null,
        //     "Informe seu nome:",
        //     "INFORME!",
        //     JOptionPane.INFORMATION_MESSAGE
        // );

        String opcaoSelecionada = (String) JOptionPane.showInputDialog(
            null, 
            "Informe seu Professor Favorito", 
            "Informe",
            JOptionPane.INFORMATION_MESSAGE, 
            null,
            melhoresProfes.toArray(),
            melhoresProfes.toArray()[0]
        );
        System.err.println(opcaoSelecionada);

        // JButton button = new JButton("Clique Aqui");
        // button.addActionListener(new ActionListener() {
            // @Override
            // public void actionPerformed(ActionEvent e) {
                // System.err.println("Acorda");
            // }
        // });

        // panel.add(button);
        // frame.add(panel);
        // frame.setVisible(true);
    }
}
