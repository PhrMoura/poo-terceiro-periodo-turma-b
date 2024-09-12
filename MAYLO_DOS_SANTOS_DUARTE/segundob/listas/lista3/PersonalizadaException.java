package segundob.listas.lista3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PersonalizadaException extends RuntimeException {

    private final JFrame frame = new JFrame();

    public PersonalizadaException(String mensagem) {
        JOptionPane.showMessageDialog(frame, mensagem, "Atividade 5", JOptionPane.ERROR_MESSAGE);
    }
    
}
