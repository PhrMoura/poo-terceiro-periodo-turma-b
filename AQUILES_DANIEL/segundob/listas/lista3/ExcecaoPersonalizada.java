package segundob.listas.lista3;

import javax.swing.JOptionPane;

public class ExcecaoPersonalizada extends RuntimeException {
  public ExcecaoPersonalizada(String erroMsg){
    JOptionPane.showMessageDialog(
          null,
          erroMsg,
          "💥",
          JOptionPane.ERROR_MESSAGE);
  }
}
