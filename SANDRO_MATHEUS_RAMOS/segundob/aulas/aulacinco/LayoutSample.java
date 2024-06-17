package segundob.aulas.aulacinco;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutSample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Exemplo show");

        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.MAGENTA);

        JButton btn = new JButton("Clique aqui!");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ACORDAA!!!");
            }

        });

        panel.add(btn);
        frame.add(panel);

        frame.setVisible(true);
    }

}
