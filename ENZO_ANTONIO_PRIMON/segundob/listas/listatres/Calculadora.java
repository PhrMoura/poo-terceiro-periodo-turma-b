package segundob.listas.listatres;

import javax.swing.JOptionPane;

class CalculadoraException extends Exception {
    public CalculadoraException(String message) {
        super(message);
    }
}

public class Calculadora {
    public static void main(String[] args) {
        try {
            String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
            String operacaoEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha a operação desejada:",
                    "Calculadora", JOptionPane.PLAIN_MESSAGE, null, operacoes, operacoes[0]);

            if (operacaoEscolhida == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.", "Calculadora",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            double numero1 = obterNumero("Digite o primeiro número:");
            double numero2 = obterNumero("Digite o segundo número:");

            double resultado = calcular(numero1, numero2, operacaoEscolhida);
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Calculadora",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (CalculadoraException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static double obterNumero(String mensagem) throws CalculadoraException {
        String input = JOptionPane.showInputDialog(null, mensagem);
        if (input == null) {
            throw new CalculadoraException("Operação cancelada.");
        }
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException ex) {
            throw new CalculadoraException("Número inválido. Por favor, insira um número válido.");
        }
    }

    public static double calcular(double num1, double num2, String operacao) throws CalculadoraException {
        switch (operacao) {
            case "Soma":
                return num1 + num2;
            case "Subtração":
                return num1 - num2;
            case "Multiplicação":
                return num1 * num2;
            case "Divisão":
                if (num2 == 0) {
                    throw new CalculadoraException("Não é possível dividir por zero.");
                }
                return num1 / num2;
            default:
                throw new CalculadoraException("Operação inválida.");
        }
    }
}
