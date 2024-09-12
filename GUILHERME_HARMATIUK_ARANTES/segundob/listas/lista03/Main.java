package segundob.listas.lista03;

import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // atividade01();
        // atividade02();
        // atividade03();
        // atividade04();
        // atividade05();
        // atividade06();

    }

    private static void atividade01() {
        // Atv1 - Crie um método em Java que exiba uma mensagem simples "Olá, Mundo!" usando JOptionPane.
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 100);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        JLabel label = new JLabel("Olá Mundo");
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
    private static void atividade02() {
        // Atv2 - Crie um método que solicite ao usuário seu nome e exiba uma mensagem de boas-vindas.
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 100);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        String nome = (String) JOptionPane.showInputDialog(
            null, "Informe seu nome"
        );
        if (nome != null) {
            JLabel label = new JLabel("Bem vindo, " + nome);
            panel.add(label);
            frame.add(panel);
            frame.setVisible(true);
        }
    }
    private static void atividade03() {
        // Atv3 - Crie um método que pergunte(showConfirmDialog) ao usuário se ele deseja 
        // continuar e exiba uma mensagem conforme a resposta.
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 100);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        
        int response = JOptionPane.showConfirmDialog(
            null, "Deseja continuar?", 
            "Confirmar", 0
        );

        String msg = "";

        if (response == 0) { msg = "Confirmou"; } 
        else if (response == 1) { msg = "Negou"; }

        JLabel label = new JLabel(msg);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
    private static void atividade04() {
        // Atv4 - Crie um método que apresente uma lista de opções ao usuário e exiba 
        // uma mensagem segundo a opção escolhida. Exemplos de lista("Opção 1", "Opção 2", "Opção 3").
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 100);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        List<String> listaOpcoes = List.of("Opção 1", "Opção 2", "Opção 3");
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(
            null, 
            "Informe seu Professor Favorito", 
            "Informe",
            JOptionPane.INFORMATION_MESSAGE, 
            null,
            listaOpcoes.toArray(),
            listaOpcoes.toArray()[0]
        );
        JLabel label = new JLabel(opcaoSelecionada);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);


    }
    private static void atividade05() {
        // Atv5 - Crie uma exceção personalizada que apresente um dialog(ERROR_MESSAGE) 
        // com a mensagem do erro que ocorreu.
        try {
            throw new Exception("Deu merda.");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(
                null, 
                e.getMessage(), 
                "Erro", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    private static void atividade06() {
        // Atv6 - Crie uma calculadora utilizando JOptionPane, apresente as quatro
        //  opções matemáticas ao usuário, após selecionada a opção e avançar, requisite 
        // os dois números para realizar o cálculo, apresente o resultado em um 
        // dialog(INFORMATION_MESSAGE) e em caso de erro lance sua exceção personalizada 
        // da atividade 5.
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 100);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        List<String> listaOpcoes = List.of("Soma", "Subtração", "Multiplicar", "Dividir");
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(
            null, 
            "Informe seu Professor Favorito", 
            "Informe",
            JOptionPane.PLAIN_MESSAGE, 
            null,
            listaOpcoes.toArray(),
            listaOpcoes.toArray()[0]
        );
        if (listaOpcoes.contains(opcaoSelecionada)) {
            String no1Str = (String) JOptionPane.showInputDialog("Informe um número inteiro (1)");
            String no2Str = (String) JOptionPane.showInputDialog("Informe um número inteiro (2)");
            try {
                Integer no1 = Integer.parseInt(no1Str);
                Integer no2 = Integer.parseInt(no2Str);

                Double result = null;
                switch (opcaoSelecionada) {
                    case "Soma":
                        result = Double.valueOf(no1 + no2);
                        break;
                    case "Subtração": 
                        result = Double.valueOf(no1 - no2);
                        break;
                    case "Multiplicar":
                        result = Double.valueOf(no1 * no2);
                        break;
                    case "Dividir":
                        if (no2 == 0) { atividade05();}
                        else { result = Double.valueOf(no1 / no2); }
                        break;
                    default:
                        result = 0.0;
                        break;
                }
                
                if (result != null) {
                    JOptionPane.showConfirmDialog(
                        null, 
                        "Resultado: " + result, 
                        "Resultado", 
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
            catch (NumberFormatException e) {
                atividade05();
            }
        }   
        else {
            atividade05();
        }
    }
}


