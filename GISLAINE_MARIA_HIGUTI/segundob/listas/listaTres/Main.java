package segundob.listas.listaTres;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        //Atividade 1
        
        exibirMensagem();

        //Atividade 2

        String nome =  solicitarNome();
        exibirMsgBoasVindas(nome);

        //Atividade 3

        perguntarContinuar();

        //Atividade 4

        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        String escolha = exibirMenu(opcoes);
        escolhaMenu(escolha);

        //Atividade 5

        try {
            throw new Excecao("Ocorreu um erro personalizado!");
        } catch (Excecao excecao) {
            System.out.println("Exceção capturada");
        }

        //Atividade 6

        boolean continuar = true;

        while (continuar) {
            String escolhaCalculadora = exibirMenu();

            if (escolhaCalculadora == null) {
                continuar = false;
                break;
            }

            try {
                double numero1 = obterNumero("Digite o primeiro número:");
                double numero2 = obterNumero("Digite o segundo número:");

                double resultado = calcular(escolhaCalculadora, numero1, numero2);

                exibirResultado(numero1, numero2, escolhaCalculadora, resultado);

            
                }catch (NumberFormatException e) {
                    exibirErro("Erro: Por favor, digite um número válido!");
                } catch (ArithmeticException e) {
                    exibirErro(e.getMessage());
                }
            
            perguntarContinuar();
        }
    }

    //Atividade 1

    public static void exibirMensagem() {

        JOptionPane.showMessageDialog(null, "Olá Mundo!");
    
    }

    //Atividade 2

    public static String solicitarNome() {

        return JOptionPane.showInputDialog("Insira o seu nome!");

    }

    public static void exibirMsgBoasVindas(String nome) {

    JOptionPane.showMessageDialog(null, "Bem-vindo(a), " + nome + "!");
    }

    //Atividade 3

    public static void perguntarContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar a execução?");

        if (resposta == JOptionPane.YES_OPTION) {
            System.out.println("Continuando execução...");
        } else if (resposta == JOptionPane.NO_OPTION) {
            System.out.println("Execução finalizada");
        } else {
            System.out.println("Execução cancelada");
        }
    }

    //Atividade 4

    public static String exibirMenu(String[] opcoes) {
        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Menu de Opções",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        return escolha;
    }

    public static void escolhaMenu(String escolha) {
        if (escolha != null) {
            switch (escolha) {
                case "Opção 1":
                    JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1");
                    break;
                case "Opção 2":
                    JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2");
                    break;
                case "Opção 3":
                    JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada");
        }
    }

    //Atividade 5 

    //clase Excecao

    //Atividade 6

    private static String exibirMenu() {
        String[] operacoes = { "Adição", "Subtração", "Multiplicação", "Divisão" };
        return (String) JOptionPane.showInputDialog(
                null,
                "Escolha a operação desejada:",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                operacoes,
                operacoes[0]);
    }

    private static double obterNumero(String mensagem) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
    }

    private static double calcular(String operacao, double num1, double num2) {
        switch (operacao) {
            case "Adição":
                return somar(num1, num2);
            case "Subtração":
                return subtrair(num1, num2);
            case "Multiplicação":
                return multiplicar(num1, num2);
            case "Divisão":
                return dividir(num1, num2);
            default:
                throw new Excecao("Operação inválida!");
        }
    }

    private static double somar(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    private static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new Excecao("Divisão por zero não é permitida!");
        }
        return num1 / num2;
    }

    private static void exibirResultado(double num1, double num2, String operacao, double resultado) {
        JOptionPane.showMessageDialog(
                null,
                String.format("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void exibirErro(String mensagem) {
        JOptionPane.showMessageDialog(
                null,
                mensagem,
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

}
