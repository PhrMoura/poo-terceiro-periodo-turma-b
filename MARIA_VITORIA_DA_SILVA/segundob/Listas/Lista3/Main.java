package segundob.Listas.Lista3;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        // atividadeUm();
        // atividadeDois();
        // atividadeTres();
        // atividadeQuatro();
        // atividadeCinco();
        //  .;atividadeSeis();
    }

    // Atividade 1
    public static void atividadeUm() {
        JFrame frame = new JFrame("Exemplo da atividade um");

        JOptionPane.showMessageDialog(frame,
                "Olá, Mundo!",
                "Hello, World!",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Atividade 2
    public static void atividadeDois() {
        JFrame frame = new JFrame("Exemplo da atividade dois");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Digite seu nome:");
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextField textField = new JTextField();
        textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, textField.getPreferredSize().height));
        textField.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton button = new JButton("Confirmar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textField.getText();
                if (!nome.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, nome + ", Seja Bem-vindo(a) ao nosso Sistema!");
                }
            }
        });
        painel.add(label);
        painel.add(Box.createRigidArea(new Dimension(0, 5)));
        painel.add(textField);
        painel.add(Box.createRigidArea(new Dimension(0, 5)));
        painel.add(button);
        frame.add(painel);
        frame.setVisible(true);

    }

    // Atividade 3
    public static void atividadeTres() {
        int pergunta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?", "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (pergunta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Ok, você escolheu continuar... Então vamos lá!!", "Oba",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (pergunta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Que pena :(\nQuem sabe na próxima...", "Até a próxima",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Atividade 4
    public static void atividadeQuatro() {
        String[] opções = { "Opção 1", "Opção 2", "Opção 3" };

        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Seleção de Opção",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opções,
                opções[0]);
        switch (selectedOption) {
            case "Opção 1":
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1", "Opção 1",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Opção 2":
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2", "Opção 2",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Opção 3":
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3", "Opção 3",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção desconhecida", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    // Atividade 5
    public static void atividadeCinco() {
        String[] opções = { "Opção 1", "Opção 2", "Opção 3" };

        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Seleção de Opção",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opções,
                opções[0]);
        switch (selectedOption) {
            case "Opção 1":
                JOptionPane.showMessageDialog(
                        null, "ERROR\n" + //
                                "Parece que não foi possivel acessar opção 1",
                        "Error :(",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case "Opção 2":
                JOptionPane.showMessageDialog(null, "ERROR\n" + //
                        "Parece que não foi possivel acessar opção 2",
                        "Error :(",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case "Opção 3":
                JOptionPane.showMessageDialog(null, "ERROR\n" + //
                        "Parece que não foi possivel acessar opção 3",
                        "Error :(",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    // Atividade 6
    public static void atividadeSeis() {
        JFrame frame = new JFrame("Exemplo da atividade dois");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        String[] opções = { "Soma", "Subtração", "Multiplicação", "Divisão" };

        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma operação:",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opções,
                opções[0]
        );

        JLabel num1Label = new JLabel("Digite o primeiro número: ");
        JTextField num1Field = new JTextField();
        JLabel num2Label = new JLabel("Digite o segundo número: ");
        JTextField num2Field = new JTextField();
        JButton calcularButton = new JButton("Calcular");

        painel.add(num1Label);
        painel.add(num1Field);
        painel.add(num2Label);
        painel.add(num2Field);
        painel.add(calcularButton);

        frame.add(painel);
        frame.setVisible(true);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = 0;

                    switch (selectedOption) {
                        case "Soma":
                            result = num1 + num2;
                            break;
                        case "Subtração":
                            result = num1 - num2;
                            break;
                        case "Multiplicação":
                            result = num1 * num2;
                            break;
                        case "Divisão":
                            if (num2 == 0) {
                                throw new Exception("Erro: Divisão por zero não é permitida.");
                            }
                            result = num1 / num2;
                            break;
                        default:
                            throw new Exception("Operação desconhecida.");
                    }

                    JOptionPane.showMessageDialog(null,
                     "O resultado é: " + result,
                     "Resultado",
                     JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                     "Entrada inválida. Por favor, insira números válidos.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, 
                    ex.getMessage(),
                     "Erro", 
                     JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}