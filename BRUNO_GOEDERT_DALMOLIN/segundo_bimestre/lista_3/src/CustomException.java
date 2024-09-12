import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        JOptionPane.showMessageDialog(new JFrame(), message, message, JOptionPane.ERROR_MESSAGE);
    }
}
