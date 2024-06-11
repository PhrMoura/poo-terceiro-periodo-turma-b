import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Atividade6 {

    public static void main(String[] args) throws Exception {
        exibirMenu();
    }

    public static void exibirMenu() {
        JFrame frame = new JFrame("Calculadora");

        String[] options = { "Soma", "Subtração", "Multiplicação", "Divisão" };
        String escolha = (String) JOptionPane.showInputDialog(frame, "Escolha a operação:", "Calculadora",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (escolha != null) {
            try {
                double numero1 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Digite o primeiro número:"));
                double numero2 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Digite o segundo número:"));

                double resultado = 0;

                switch (escolha) {
                    case "Soma":
                        resultado = numero1 + numero2;
                        break;
                    case "Subtração":
                        resultado = numero1 - numero2;
                        break;
                    case "Multiplicação":
                        resultado = numero1 * numero2;
                        break;
                    case "Divisão":
                        if (numero2 == 0) {
                            throw new ArithmeticException("Divisão por zero não é permitida!");
                        }
                        resultado = numero1 / numero2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(frame, "Opção inválida!");
                        return;
                }

                JOptionPane.showMessageDialog(frame, "O resultado é: " + resultado, "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException e) {
                throw new CustomException(e.getMessage());
            }
        }
    }
}
