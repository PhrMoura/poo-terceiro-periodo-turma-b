package segundob.listas.listatres;

import javax.swing.JOptionPane;

public class Main {
    // ATV1
    public static void exibirMensagemOlaMundo() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    // ATV2
    public static void solicitarNomeEExibirMensagem() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
    }

    // ATV3
    public static void perguntarSeDesejaContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar.");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você cancelou a operação.");
        }
    }

    // ATV4
    public static void apresentarListaDeOpcoes() {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", 
            "Opções", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        JOptionPane.showMessageDialog(null, "Você escolheu: " + escolha);
    }

    // ATV5
    static class MinhaExcecao extends Exception {
        public MinhaExcecao(String mensagem) {
            super(mensagem);
            JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ATV6
    public static void calculadora() {
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String operacao = (String) JOptionPane.showInputDialog(null, "Escolha uma operação:", 
            "Calculadora", JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);

        if (operacao != null) {
            try {
                String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
                String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                double resultado = 0;

                switch (operacao) {
                    case "Soma":
                        resultado = num1 + num2;
                        break;
                    case "Subtração":
                        resultado = num1 - num2;
                        break;
                    case "Multiplicação":
                        resultado = num1 * num2;
                        break;
                    case "Divisão":
                        if (num2 == 0) {
                            throw new MinhaExcecao("Erro: Divisão por zero!");
                        }
                        resultado = num1 / num2;
                        break;
                }
                JOptionPane.showMessageDialog(null, "O resultado da " + operacao + " é: " + resultado, 
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                new MinhaExcecao("Erro: Entrada inválida!");
            } catch (MinhaExcecao e) {
                // Exceção já tratada na classe MinhaExcecao
            }
        }
    }

    public static void main(String[] args) {

        // // ATV1
        // exibirMensagemOlaMundo();

        // // ATV2
        // solicitarNomeEExibirMensagem();

        // // ATV3
        // perguntarSeDesejaContinuar();

        // // ATV4
        // apresentarListaDeOpcoes();

        // ATV5 - Teste da exceção personalizada
        try {
            throw new MinhaExcecao("Erro personalizado!");
        } catch (MinhaExcecao e) {
            // Exceção já tratada
        }

        // ATV6
        calculadora();
    }
}
