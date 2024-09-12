package segundob.listas.lista3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ExplicacaoAula {

  public static void main(String[] args) {
    JFrame frame = new JFrame("ACORDA");
    frame.setSize(400, 400);

    JPanel panel = new JPanel();
    panel.setBackground(Color.red);

    JButton buton = new JButton("ACORDA");
    buton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "ACORDA", "ACORDA", JOptionPane.WARNING_MESSAGE);
      }
    });

    panel.add(buton);
    frame.add(panel);
    frame.setVisible(true);
    
  }
}
