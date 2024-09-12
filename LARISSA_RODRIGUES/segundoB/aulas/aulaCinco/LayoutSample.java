package segundoB.aulas.aulaCinco;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutSample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exemplo show"); // Título do frame

        frame.setSize(400, 400); // Tamanho

        JPanel panel = new JPanel();
        panel.setBackground(Color.MAGENTA); // Cor de fundo

        JButton btn = new JButton("Clique aqui!");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ACORDAA!!!");
            }

        });

        panel.add(btn); // Adiciona o botão no painel
        frame.add(panel); // Adiciona o painel no frame

        frame.setVisible(true);
    }
}
