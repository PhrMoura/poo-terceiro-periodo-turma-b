package segundob.listas;

import javax.swing.JOptionPane;

public class ListaTres {
    
    // Classe de exceção personalizada
    public static class CalculadoraException extends Exception {
        public CalculadoraException(String mensagem) {
            super(mensagem);
            // Exibe a mensagem de erro em um dialog
            JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        try {
            // atv 1
            mostrarMensagem();
            
            // atv 2
            pedirNome();
            
            // atv 3
            perguntarSeDesejaContinuar();
            
            // atv 4
            apresentarOpcoes();

            // atv 6
            calculadora();
        } catch (CalculadoraException e) {
            
        }
    }

    
    public static void mostrarMensagem() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    
    public static void pedirNome() throws CalculadoraException {
        
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        
        
        if (nome == null || nome.trim().isEmpty()) {
            throw new CalculadoraException("Nome inválido! O nome não pode ser vazio.");
        } else {
            
            JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
        }
    }

    
    public static void perguntarSeDesejaContinuar() {
        
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar!");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você cancelou a escolha.");
        }
    }

    
    public static void apresentarOpcoes() {
        
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        
        
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Escolha",
                                                   JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        
        
        switch (escolha) {
            case 0:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1!");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você não fez uma escolha válida.");
                break;
        }
    }

    
    public static void calculadora() throws CalculadoraException {
        try {
            
            String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora",
                                                       JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha >= 0 && escolha < 4) {
                
                String num1Str = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
                String num2Str = JOptionPane.showInputDialog(null, "Digite o segundo número:");

                
                if (num1Str == null || num1Str.trim().isEmpty() || num2Str == null || num2Str.trim().isEmpty()) {
                    throw new CalculadoraException("Entrada inválida! Ambos os números são obrigatórios.");
                }

                try {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double resultado = 0;

                    
                    switch (escolha) {
                        case 0: // Soma
                            resultado = num1 + num2;
                            break;
                        case 1: // Subtração
                            resultado = num1 - num2;
                            break;
                        case 2: // Multiplicação
                            resultado = num1 * num2;
                            break;
                        case 3: // Divisão
                            if (num2 == 0) {
                                throw new CalculadoraException("Erro! Divisão por zero.");
                            }
                            resultado = num1 / num2;
                            break;
                    }

                    
                    JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                 //atv 5
                } catch (NumberFormatException e) {
                    throw new CalculadoraException("Entrada inválida! Por favor, insira números válidos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
            }
        } catch (CalculadoraException e) {
            
        }
    }
}
