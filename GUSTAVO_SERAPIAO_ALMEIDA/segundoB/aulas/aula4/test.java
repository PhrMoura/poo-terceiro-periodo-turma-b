package aula4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JOGA ISSO FORA!");

        frame.setSize(4000, 4000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new java.awt.GridBagLayout()); // Usar GridBagLayout para centralizar o texto

        JLabel label = new JLabel("vo nada! vo nada.");
        label.setFont(new Font("Arial", Font.BOLD, 160)); // Ajuste a fonte e tamanho do texto
        label.setForeground(Color.WHITE); // Cor do texto

        JButton btn = new JButton("vo nada");
        btn.setPreferredSize(new Dimension(50,50));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10,10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        panel.add(label, gbc); // Adicionar o JLabel ao JPanel

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btn, gbc);

        frame.add(panel); // Adicionar o JPanel ao JFrame

        frame.setVisible(true);
    }
}