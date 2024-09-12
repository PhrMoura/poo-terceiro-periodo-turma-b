package segundob.listas.listaTres;

import javax.swing.JOptionPane;

public class Excecao extends RuntimeException {
    
    public Excecao(String errorMsg) {
        JOptionPane.showMessageDialog(
                null,
                errorMsg,
                "ERRO!",
                JOptionPane.ERROR_MESSAGE);
    }
}
