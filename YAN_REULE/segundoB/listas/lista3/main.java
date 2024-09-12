package segundoB.listas.lista3;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        exibirMensagem();

        exibirBoasVindas();

        verificarContinuar();

        apresentarOpcoes();
    }

    public static void exibirMensagem() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    public static void exibirBoasVindas() {
        String nome = JOptionPane.showInputDialog("Por favor, digite seu nome:");
        String mensagem = "Olá, " + nome + "! Bem-vindo!";
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static void verificarContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Continuando...");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Saindo...");
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida ou cancelada.");
        }
    }

    public static void apresentarOpcoes() {
        Object[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        
        if (escolha == 0) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1.");
        } else if (escolha == 1) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2.");
        } else if (escolha == 2) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada ou a janela foi fechada.");
        }
    }

    
}
