package segundob.Listas;
    import javax.swing.*;
    
public class ListaTres {

    // ATV1
    public static void exibirMensagemSimples() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    // ATV2
    public static void exibirMensagemBoasVindas() {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
    }

    // ATV3
    public static void perguntarContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Que pena 😭 vai ter que aprender programar JAVA.");
        } else {
            JOptionPane.showMessageDialog(null, "VAI PROGRAMR EM JAVA MESMO ASSIM HAHA 🤣.");
        }
    }

    // ATV4
    public static void apresentarOpcoes() {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        JOptionPane.showMessageDialog(null, "Você escolheu " + opcoes[escolha] + ".");
    }

    // ATV5
    public static class MinhaExcecaoPersonalizada extends Exception {
        public MinhaExcecaoPersonalizada(String mensagem) {
            super(mensagem);
        }

        public void exibirDialogoErro() {
            JOptionPane.showMessageDialog(null, getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ATV6
    public static void calculadora() {
        String[] operacoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        int operacaoEscolhida = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

        if (operacaoEscolhida == -1) return; // Usuário cancelou a operação

        try {
            String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
            String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

            if (num1Str == null || num2Str == null) return; // Usuário cancelou a operação

            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double resultado = 0;

            switch (operacaoEscolhida) {
                case 0:
                    resultado = num1 + num2;
                    break;
                case 1:
                    resultado = num1 - num2;
                    break;
                case 2:
                    resultado = num1 * num2;
                    break;
                case 3:
                    if (num2 == 0) throw new MinhaExcecaoPersonalizada("Divisão por zero não é permitida.");
                    resultado = num1 / num2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            new MinhaExcecaoPersonalizada("Entrada inválida. Por favor, insira números válidos.").exibirDialogoErro();
        } catch (MinhaExcecaoPersonalizada e) {
            e.exibirDialogoErro();
        }
    }

    public static void main(String[] args) {
        // Descomente as linhas abaixo para testar cada atividade separadamente.

        // ATV1
         exibirMensagemSimples();

        // ATV2
         exibirMensagemBoasVindas();

        // ATV3
        perguntarContinuar();

        // ATV4
        apresentarOpcoes();

        // ATV5 - Para testar a exceção personalizada, você pode forçar um erro na ATV6

        // ATV6
         calculadora();
    }


}

