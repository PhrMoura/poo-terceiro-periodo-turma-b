package FELIPE_EMANUEL_NEGRI.segundob.prova;

import javax.swing.JOptionPane;

public class Erro extends RuntimeException{
    
      public Erro(String errorMsg) {
        JOptionPane.showMessageDialog(null,
        errorMsg,
        "ERRO!!!!",
        JOptionPane.ERROR_MESSAGE);
    }

}
