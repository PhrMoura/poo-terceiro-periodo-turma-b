package segundob.listas.lista3;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TerceiraLista {

    public static void main(String[] args) {
        
        // Atividade 1

        JFrame frameHello = new JFrame("Atividade 1");

        JOptionPane.showMessageDialog(frameHello,
        "Olá Mundo!",
        "Atividade 1",
        JOptionPane.INFORMATION_MESSAGE);

        // Atividade 2

        JFrame frameWelcome = new JFrame("Atividade 2");

        String nomeUsuario = JOptionPane.showInputDialog(
            frameWelcome,
            "Qual seu nome?",
            "Atividade 2",
            JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(frameWelcome,
        "Seja bem vindo " + nomeUsuario + "!",
        "Atividade 2",
        JOptionPane.INFORMATION_MESSAGE);

        // Atividade 3

        JFrame frameConfirm = new JFrame("Atividade 3");

        Boolean escolha = JOptionPane.showConfirmDialog(
            frameConfirm,
            "Aceita os termos do contrato?",
            "Atividade 3",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION;

        if (escolha == true) {
            JOptionPane.showMessageDialog(frameConfirm,
            "Obrigado por me dar sua casa!",
            "Atividade 3",
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frameConfirm,
            "Que pena, ficamos triste sem você!",
            "Atividade 3",
            JOptionPane.INFORMATION_MESSAGE);
        }

        // Atividade 4

        JFrame frameCar = new JFrame("Atividade 4");
        List<String> carrosVenda = List.of("Uno", "Gol", "Palio");

        String carroEscolhido = (String) JOptionPane.showInputDialog(
            frameCar,
            "Escolha um carro",
            "Atividade 4",
            JOptionPane.QUESTION_MESSAGE,
            null,
            carrosVenda.toArray(),
            carrosVenda.toArray()[0]);

        JOptionPane.showMessageDialog(frameCar, "Parabéns, você acabou de adquirir um " + carroEscolhido);


        // Atividade 5
        
        somarInteiros(10, 10);
        somarInteiros(10, null);

        // Atividade 6

        JFrame frameCalculator = new JFrame("Calculadora Basica");
        List<String> opcaoCalculadora = List.of("Soma", "Subtração", "Divisão", "Multiplicação");

        String opcaoEscolhida = (String) JOptionPane.showInputDialog(
            frameCalculator,
            "Escolha uma Operação",
            "Atividade 6",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcaoCalculadora.toArray(),
            opcaoCalculadora.toArray()[0]);

        int number1 = Integer.parseInt(JOptionPane.showInputDialog(
            frameCalculator,
            "Insira o primeiro valor",
            "Atividade 6",
            JOptionPane.QUESTION_MESSAGE));
            
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(
            frameCalculator,
            "Insira o segundo valor",
            "Atividade 6",
            JOptionPane.QUESTION_MESSAGE));

        switch (opcaoEscolhida) {
            case "Soma":
                try {
                    JOptionPane.showMessageDialog(frameCalculator, "O valor da soma é: " + (number1 + number2));
                } catch (Exception e) {
                    throw new PersonalizadaException("Não foi encontrado dois numeros validos");
                }
                break;
            case "Subtração":
                try {
                    JOptionPane.showMessageDialog(frameCalculator, "O valor da subtração é: " + (number1 - number2));
                } catch (Exception e) {
                    throw new PersonalizadaException("Não foi encontrado dois numeros validos");
                }
                break;
            case "Divisão":
                try {
                    JOptionPane.showMessageDialog(frameCalculator, "O valor da divisão é: " + (number1 / number2));
                } catch (Exception e) {
                    throw new PersonalizadaException("Não foi encontrado dois numeros validos");
                }
                break;
            case "Multiplicação":
                try {
                    JOptionPane.showMessageDialog(frameCalculator, "O valor da multiplicação é: " + (number1 * number2));
                } catch (Exception e) {
                    throw new PersonalizadaException("Não foi encontrado dois numeros validos");
                }
                break;
        }
        
        System.exit(0);

    }

    public static void somarInteiros (Integer number1, Integer number2) {
        try {
            System.out.println("Resultado da soma: " + (number1 + number2));
        } catch (Exception e) {
            throw new PersonalizadaException("Não foi encontrado dois numeros validos");
        }

    }
    
}
