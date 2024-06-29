package AQUILES_DANIEL.segundob.prova;

import javax.swing.JOptionPane;

public class Erro extends RuntimeException {
  public Erro(String mensagemDeErro) {
    JOptionPane.showMessageDialog(
        null,
        mensagemDeErro,
        "💥",
        JOptionPane.ERROR_MESSAGE);
  }
}
