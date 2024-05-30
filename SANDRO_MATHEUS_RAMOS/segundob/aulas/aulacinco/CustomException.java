package segundob.aulas.aulacinco;

import javax.swing.JOptionPane;

public class CustomException extends RuntimeException {

    public CustomException(String errorMsg) {
        JOptionPane.showMessageDialog(
                null,
                errorMsg,
                "ERRO!",
                JOptionPane.ERROR_MESSAGE);
    }

}
