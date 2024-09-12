package segundoB.listas.listaTres;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Lista três :)");
        frame.setSize(400, 400);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        // ATV 01
        JButton btnUm = new JButton("ATV 01");
        btnUm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atvUm();
            }
        });

        // ATV 02
        JButton btnDois = new JButton("ATV 02");
        btnDois.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atvDois();
            }
        });

        // ATV 03
        JButton btnTres = new JButton("ATV 03");
        btnTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atvTres();
            }
        });

        // ATV
        JButton btnQuatro = new JButton("ATV 04");
        btnQuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atvQuatro();
            }
        });

        // ATV 06
        JButton btnCinco = new JButton("Calculadora");

        btnCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora();
            }
        });

        panel.add(btnUm);
        panel.add(btnDois);
        panel.add(btnTres);
        panel.add(btnQuatro);
        panel.add(btnCinco);
        frame.add(panel);
        frame.setVisible(true);
    }

    // Métodos

    // ATV 01
    public static void atvUm() {
        JOptionPane.showMessageDialog(
                null,
                "Olá mundo!",
                "Mensagem.",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("ATV 01 - Olá mundo!");
    }

    // ATV 02
    public static void atvDois() {
        String nome = JOptionPane.showInputDialog(
                null,
                "Informe seu nome:",
                "Insirir dados.",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(
                null,
                "Seja bem vindo " + nome + "! :D",
                "Mensagem",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("ATV 02 - Seja bem vindo " + nome + "! :D");
        System.out.println();
    }

    // ATV 03
    public static void atvTres() {
        int i = JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar?",
                "Continua",
                JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    "Executando sistema . . .",
                    "Mensagem",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ATV 03 - Executando o sistema...");
            System.out.println();
        } else if (i == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    "Encerrando o sistema . . .",
                    "Mensagem",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ATV 03 - Encerrando o sistema...");
            System.out.println();
        }
    }

    // ATV 04
    public static void atvQuatro() {
        List<String> opcoes = List.of("Opção 01", "Opção 02", "Opção 03");
        String opcaoSelecionda = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Informe.",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes.toArray(),
                opcoes.toArray()[0]);

        System.out.println("ATV 04 - Opção selecionda: " + opcaoSelecionda);
        System.out.println();
    }

    // ATV 05
    public static void mensagemErro() {
        JOptionPane.showMessageDialog(
                null,
                "Opção inválida.",
                "ERRO!",
                JOptionPane.ERROR_MESSAGE);
    }

    // ATV 06
    public static void calculadora() {
        Double resultado;
        String opcaoSelecionda = JOptionPane.showInputDialog(
                null,
                "Selecione a operação desejada:\n" +
                        "[1] Adição \n[2] Subtração\n" +
                        "[3] Divisão \n[4] Multiplicação",
                "Escolha.",
                JOptionPane.QUESTION_MESSAGE);

        String primeiroNum = JOptionPane.showInputDialog(
                null,
                "Informe o primeiro número da equação:",
                "Insirir dados.",
                JOptionPane.QUESTION_MESSAGE);

        String segundoNum = JOptionPane.showInputDialog(
                null,
                "Informe o segundo número da equação:",
                "Insirir dados.",
                JOptionPane.QUESTION_MESSAGE);

        if (opcaoSelecionda.equals("1")) {
            resultado = Double.valueOf(primeiroNum) + Double.valueOf(segundoNum);
            JOptionPane.showMessageDialog(
                    null,
                    "O resultado da adição é: " + resultado,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ATV 06 - Resultado da adição: " + resultado);
        } else if (opcaoSelecionda.equals("2")) {
            resultado = Double.valueOf(primeiroNum) - Double.valueOf(segundoNum);
            JOptionPane.showMessageDialog(
                    null,
                    "O resultado da subtração é: " + resultado,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ATV 06 - Resultado da subtração: " + resultado);
        } else if (opcaoSelecionda.equals("3")) {
            resultado = Double.valueOf(primeiroNum) / Double.valueOf(segundoNum);
            JOptionPane.showMessageDialog(
                    null,
                    "O resultado da divisão é: " + resultado,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ATV 06 - Resultado da divisão: " + resultado);
        } else if (opcaoSelecionda.equals("4")) {
            resultado = Double.valueOf(primeiroNum) * Double.valueOf(segundoNum);
            JOptionPane.showMessageDialog(
                    null,
                    "O resultado da multiplicação é: " + resultado,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ATV 06 - Resultado da multiplicação: " + resultado);
        } else {
            mensagemErro();
            System.out.println("ATV 06 - Opção inválida.");
        }
    }
}