package segundob.listas.listaTres;

import javax.swing.JOptionPane;

public class Main {

    public static void helloWorld() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    public static void solicitarNome() {
        String nome = JOptionPane.showInputDialog(null, "Entre com o seu nome:");
        JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
    }

    public static void desejaContinuar() {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Opção", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Terminando...");
            System.exit(0);
        }
    }

    public static void escolherOpcao() {

        String[] opcoes = { "Opção 1", "Opção 2", "Opção 3" };

        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (escolha == 0) {
            JOptionPane.showMessageDialog(null, "As bananas são naturalmente radioativas devido ao potássio-40.");
        } else if (escolha == 1) {
            JOptionPane.showMessageDialog(null, "Polvo tem três corações e sangue azul.");
        } else if (escolha == 2) {
            JOptionPane.showMessageDialog(null, "O coração de um camarão está localizado em sua cabeça.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção foi escolhida.");
        }
    }

    public static void main(String[] args) {

        // ATV 1
        helloWorld();

        // ATV2
        solicitarNome();

        // ATV3
        desejaContinuar();

        // ATV4
        escolherOpcao();

        // ATV 6
        try {
            String[] operacoes = { "Subtração", "Soma", "Multiplicação", "Divisão" };
            String escolha = (String) JOptionPane.showInputDialog(null,
                    "Selecione uma opção", "Calculadora",
                    JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);

            double valorUm = Double.parseDouble(JOptionPane.showInputDialog("Entre com um valor:"));
            double valorDois = Double.parseDouble(JOptionPane.showInputDialog("Entre com um segundo valor:"));
            double res = 0;

            if (escolha.equals("Subtração")) {
                res = valorUm - valorDois;
            } else if (escolha.equals("Soma")) {
                res = valorUm + valorDois;
            } else if (escolha.equals("Multiplicação")) {
                res = valorUm * valorDois;
            } else {
                if (valorDois == 0) {
                    throw new Excecao("Tentou dividir por zero");
                }
                res = valorUm / valorDois;
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + res, "Calculadora",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Excecao mensagem) {
            mensagem.mensagemErro();
        }
    }
}
