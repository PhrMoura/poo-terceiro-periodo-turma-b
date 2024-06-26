package segundob.listas.listatres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class listamain {
    public static void main(String[] args) {

        // atividade 1
        JFrame frame = new JFrame("Atividade 1");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        JLabel label = new JLabel("Olá, mundo!");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(panel);
        panel.add(label);

        frame.setVisible(true);

        // atividade 2

        JFrame frame2 = new JFrame("Atividade 2");
        frame2.setSize(400, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);

        JLabel nameLabel = new JLabel("Digite seu nome:");
        JTextField nameField = new JTextField(20);

        JButton welcomeButton = new JButton("Enviar");

        frame2.add(panel2);
        frame2.add(nameLabel);
        frame2.add(nameField, BorderLayout.EAST);
        frame2.add(welcomeButton, BorderLayout.SOUTH);

        welcomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();

                JOptionPane.showMessageDialog(frame, "Bem-vindo, " + name + "!", "FALA TU",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame2.setVisible(true);

        //Atividade 3

        JFrame frame3 = new JFrame("Atividade 3");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 150);

        int response = JOptionPane.showConfirmDialog(frame, "Quer mesmo continuar? >.<", "Cuidado...", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(frame, "Você continou e virou um eboy kawai", "Deu ruim :(", JOptionPane.INFORMATION_MESSAGE);
        } else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(frame, "Você não conitnuou e seguiu a vida feliz", "Deu bom :)", JOptionPane.INFORMATION_MESSAGE);
        }

        frame3.setVisible(true);

        //Atividade 4
        
        JFrame frame4 = new JFrame("Atividade 4");

        String option = JOptionPane.showInputDialog(frame4, 
        "Você precisa cagar, você ira caga na(s)" +
        "\n praia" +
        "\n montanhas" +
        "\n calças",
        "Selecione a opção",
        JOptionPane.QUESTION_MESSAGE
        );

        JOptionPane.showMessageDialog(frame4, "O usuário irá cagar na(s) " + option);

        System.exit(0);

        //Atividade 5
        //printarTamanhoSrt("Enzo");
        //printarTamanhoSrt(null);

        //Atividade 6

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

    public class PogException extends RuntimeException {

        private final JFrame exceptionFrame = new JFrame();

        public PogException(String message) {
            JOptionPane.showMessageDialog(exceptionFrame, message, "Erro Poggers", JOptionPane.ERROR_MESSAGE);
        }
    }   

    //public static void printarTamanhoSrt(String texto){
    //    try{
   //         System.out.println(texto.length());
   //     } catch (Exception e) {
   //         throw new PogException("Tamanho paia! ");
   //     }
   // }
}
